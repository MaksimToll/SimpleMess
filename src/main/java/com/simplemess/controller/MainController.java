package com.simplemess.controller;

import com.simplemess.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("hello")
    public User user(){
        return new User(1L, "One", "Panch");
    }

}
