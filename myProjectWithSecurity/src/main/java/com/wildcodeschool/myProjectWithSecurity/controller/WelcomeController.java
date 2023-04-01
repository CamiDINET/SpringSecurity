package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the shield!!!";
    }
    @GetMapping("/avengers/assemble")
    public String avengers(){
       return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String city(){
        return "Biarritz, Bordeaux, Lille, Lyon, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse";
    }

}