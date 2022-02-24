package com.lvgdsk.git.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGitController {

    @GetMapping("hello")
    public String say(){
        return "hello dev";
    }

    @GetMapping("play")
    public String play(){
        return "i am play badminton bbb";
    }

    @GetMapping("devTest")
    public String devTest(){
        return "dev test";
    }

    @GetMapping("runTest")
    public String runTest(){
        return "run test";
    }
}
