package com.springboot.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

    @GetMapping("/Welcome")
    public string welcome(){
        return "Welocme to my world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }

}
