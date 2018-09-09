package com.example.web;

import com.example.service.AESEncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EncryptionController {


    @Autowired
    private AESEncryptionService service;


    // init start page method
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }

    //performes AJAX request of decryption
    @RequestMapping(value = "/todecrypt/{cipher}", method = RequestMethod.GET)
    @ResponseBody
    public String ajaxEncryptText(@PathVariable("cipher") String cipher) {

        return service.decriptTheMessageWithAES(cipher);
    }

    //performes AJAX request of enryption
    @RequestMapping(value = "/toencrypt/{message}", method = RequestMethod.GET)
    @ResponseBody
    public String showGuestList(@PathVariable("message") String message) {

        return service.encriptTheMessageWithAES(message);
    }

}
