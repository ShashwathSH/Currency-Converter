package com.shashwathsh.Currency_Converter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    RestClient restClient() {
        return RestClient.builder()
                .baseUrl("https://api.freecurrencyapi.com/v1")
                .build();
    }
}

