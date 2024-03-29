package com.csq.community.service;

import com.csq.community.dto.PaginationDTO;
import com.csq.community.dto.QuestionDTO;
import com.csq.community.mapper.QuestionMapper;
import com.csq.community.mapper.UserMapper;
import com.csq.community.model.Question;
import com.csq.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;


    public PaginationDTO list(Integer page, Integer size) {

        PaginationDTO paginationDTO = new PaginationDTO();
        Integer totalCount = questionMapper.count();
        paginationDTO.setPagination(totalCount, page, size);

        if(page <1){
            page = 1;
        }

        if(page > paginationDTO.getTotalPage()){
            page = paginationDTO.getTotalPage();
        }

        //size*(page-1)
        Integer offset = size*(page-1);
        List<Question> questions = questionMapper.list(offset,size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();

         for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        paginationDTO.setQuestions(questionDTOList);
        return paginationDTO;
     }
}
