package com.lvgdsk.git.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGitController {

    @GetMapping("hello")
    public String say(){
        return "hello git,how useful you are!";
    }

    @GetMapping("play")
    public String play(){
        return "i am play badminton bbb";
    }

    @GetMapping("devTest")
    public String devTest(){
        return "dev test";
    }
}
