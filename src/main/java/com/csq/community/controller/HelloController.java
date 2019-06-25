package com.csq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ercai
 * @date 2019/6/25 - 8:50
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(@RequestParam(name="name") String name, Model model ){
        model.addAttribute("name",name);
        return "hello";
    }
}
