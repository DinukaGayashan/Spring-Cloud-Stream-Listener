package com.dinukagayashan.springcloudstreamlistener.external.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class CryptocurrencyConsumerConfiguration {

    @Bean
    public Consumer<String> cryptocurrencyConsumer(){
        return message -> System.out.println(message);
    }

}
