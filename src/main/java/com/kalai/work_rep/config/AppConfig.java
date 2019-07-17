package com.kalai.work_rep.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/insert/wcate").allowedOrigins("http://localhost:4200/")
                .allowedHeaders("Access-Control-Allow-Origin", "*")
                .allowedHeaders("Access-Control-Allow-Headers", "Content-Type,x-requested-with").maxAge(864000)
                .allowCredentials(false).allowedMethods("POST", "DELETE", "GET");
    }*/


}
