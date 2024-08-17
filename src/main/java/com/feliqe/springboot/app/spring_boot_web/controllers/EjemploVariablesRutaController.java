package com.feliqe.springboot.app.spring_boot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Enviar parametros de la ruta (@PathVariable)");
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    //pasamor campos por la url
    public String variables(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en al ruta es: " + texto);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    //pasamos dos varoles por la url
    public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en al ruta es: " + texto + " y el numero enviado del path es :" + numero);
        return "variables/ver";
    }
}
