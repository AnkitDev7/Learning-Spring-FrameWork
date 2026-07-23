package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/admision")
public class myController {

//    @RequestMapping(value = "/registration.do" , method = RequestMethod.GET)
    @GetMapping("/registration.do")
    public String register(){
        System.out.println("Test....");
        return "registration";
    }
}
