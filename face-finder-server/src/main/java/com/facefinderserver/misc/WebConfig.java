package com.facefinderserver.misc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Annotationen fuer den Support von
 * Grundfunktionen eines Model-View-Controller Projektes
 * wie z.B. registrieren eines Controllers, type Converter, Validation, Exception Handling etc.
 * Quelle: https://www.baeldung.com/spring-mvc-tutorial
 */
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
    }
}
