package com.dinukagayashan.springcloudstreamlistener.external.configuration;

import com.dinukagayashan.springcloudstreamlistener.domain.dto.CryptocurrencyDto;
import com.dinukagayashan.springcloudstreamlistener.domain.service.CryptocurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class CryptocurrencyConsumerConfiguration {

    @Autowired
    CryptocurrencyService cryptocurrencyService;

    @Bean
    public Consumer<CryptocurrencyDto> cryptocurrencyConsumer() {
        return message -> cryptocurrencyService.printCryptocurrency(message);
    }

}
