package com.feliqe.springboot.app.spring_boot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    //pasamos los campos
    @GetMapping({ "/", "" })
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    //pasara el parametro  por medio de string
    public String param(
            @RequestParam(name = "texto", required = false, defaultValue = "debe ingresar un texto en la url") String texto,
            Model model) {
        model.addAttribute("titulo", "Recibir parametros del Request HTTP GEt - URL");
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "params/ver";
    }

    @GetMapping("/mix-params")
    //pasamos dos valores
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
        model.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el numero es '" + numero + "'");
        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    // validanmos los datos de variables a recibir
    public String param(HttpServletRequest request, Model model) {
        String saludo = request.getParameter("saludo");
        Integer numero = null;
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException e) {
            numero = 0;
        }

        model.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el numero es '" + numero + "'");
        return "params/ver";
    }
}
