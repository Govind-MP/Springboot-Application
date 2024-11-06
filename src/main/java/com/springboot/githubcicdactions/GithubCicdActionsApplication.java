package com.springboot.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

    @GetMapping("/Welcome")
    public String welcome(){
        return "Welcome to my world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }

}
