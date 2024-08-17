package com.feliqe.springboot.app.spring_boot_web.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import com.feliqe.springboot.app.spring_boot_web.models.Usuario;

// asociamos la configuraicon de controller
@Controller
// indicamos el primer nivel de la ruta en el navegador
@RequestMapping("/app")
public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;

    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;

    //definirmos la ruta del navegador
    @GetMapping({"/index","/", "", "home" })
    public String index(Model model) {
        model.addAttribute("titulo", textoIndex);
        return "index";
    }

    //metodo de perfil
    @RequestMapping("/perfil")
    public String perfil(Model model) {

        // definimos el nombre del model que suaremos
        Usuario usuario = new Usuario();

        // asiganamos data a los campos
        usuario.setNombre("Felipe");
        usuario.setApellido("Cerda");
        usuario.setEmail("felipe@mail.cl");

        // usamos el arreglo de usuario realizados
        model.addAttribute("usuario", usuario);

        // anidamos el titulo con el nombre del usuario asiganos en las variables de la funcion
        model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
        return "perfil";
    }

    // metodo de listar
    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", textoListar);
        return "listar";
    }

    //metodo para poder usar los metodos para que este a comun a todos los arrgelos de los metodos
    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        // primer arreglo
        // List<Usuario> usuarios = new ArrayList<>();
        // usuarios.add(new Usuario("Felipe", "Cerda", "felipe@email.cl"));
        // usuarios.add(new Usuario("Andres", "Silva", "andres@email.cl"));
        // usuarios.add(new Usuario("Vanessa", "Uno", "vanessa@email.cl"));

        List<Usuario> usuarios = Arrays.asList(new Usuario("Felipe", "Cerda", "felipe@email.cl"),
                new Usuario("Andres", "Silva", "andres@email.cl"), new Usuario("Vanessa", "Uno", "vanessa@email.cl"));

        return usuarios;
    }
}
