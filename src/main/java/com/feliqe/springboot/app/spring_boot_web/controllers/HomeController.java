package com.feliqe.springboot.app.spring_boot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    //redicionara al pagin indicada como retorno
    public String home() {
        return "forward:/app/index";
    }
}
