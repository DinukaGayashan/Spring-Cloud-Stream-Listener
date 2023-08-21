package com.dinukagayashan.springcloudstreamlistener.external.configuration;

import com.dinukagayashan.springcloudstreamlistener.domain.dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class UserConsumerConfiguration {

    @Bean
    public Consumer<String> userConsumer(){
        return message -> System.out.println(message);
    }

}
