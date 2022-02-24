package com.lvgdsk.git.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGitController {

    @GetMapping("hello")
    public String say(){
        return "hello git,how useful you are!";
    }

    @GetMapping("devTest")
    public String devTest(){
        return "dev test";
    }

    @GetMapping("sitTest")
    public String sitTest(){
        return "test sit";
    }
}
