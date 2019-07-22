package com.bes.provider.controller;

import com.bes.provider.service.WebSitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Autowired
    private WebSitesService webSitesService;
    @RequestMapping("/helloWorld")
    public String getHelloWorld(@RequestParam  String name){
        return name + ",Hello World";
    }


}
