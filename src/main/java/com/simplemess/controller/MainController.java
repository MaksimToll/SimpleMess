package com.simplemess.controller;

import com.simplemess.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class MainController {
//    @RequestMapping("hello")
//    public User user(){
//        return new User(1L, "One", "Panch");
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "index";
    }


}
