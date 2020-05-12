package com.vipin.springdi.controllers;

import com.vipin.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
