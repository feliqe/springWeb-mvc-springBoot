package com.feliqe.springboot.app.spring_boot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
// indicamos la configuracion de properties para definir campos para el titulo
@PropertySources({
    @PropertySource("classpath:textos.properties")
})

public class TextoPropertiesConfig {

}
