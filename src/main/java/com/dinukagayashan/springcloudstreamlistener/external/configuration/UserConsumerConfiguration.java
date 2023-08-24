package com.dinukagayashan.springcloudstreamlistener.external.configuration;

import com.dinukagayashan.springcloudstreamlistener.domain.dto.UserDto;
import com.dinukagayashan.springcloudstreamlistener.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class UserConsumerConfiguration {

    @Autowired
    UserService userService;

    @Bean
    public Consumer<UserDto> userConsumer() {
        return message -> userService.printUser(message);
    }

}
