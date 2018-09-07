package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EncryptionController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        String hello = "Hello!";

        model.addAttribute("someString", hello);
        return "index.html";
    }




}
