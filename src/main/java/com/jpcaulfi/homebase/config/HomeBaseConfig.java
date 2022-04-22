package com.jpcaulfi.homebase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeBaseConfig {

    @Bean
    public HomeBaseProperties homeBaseProperties() {
        return new HomeBaseProperties();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
