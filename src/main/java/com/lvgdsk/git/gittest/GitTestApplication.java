package com.lvgdsk.git.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("run application");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
