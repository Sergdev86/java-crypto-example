package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EncryptionController {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index2(Model model){

        String hello = "Java crypto Thymeleaf example!";

        model.addAttribute("someString", hello);
        return "index.html";
    }

}
