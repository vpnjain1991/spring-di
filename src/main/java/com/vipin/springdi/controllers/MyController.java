package com.vipin.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("in sayHello");
        return "Hi Folks";
    }
}
