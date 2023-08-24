package com.dinukagayashan.springcloudstreamlistener.domain.service.impl;

import com.dinukagayashan.springcloudstreamlistener.domain.dto.CryptocurrencyDto;
import com.dinukagayashan.springcloudstreamlistener.domain.service.CryptocurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CryptocurrencyServiceImpl implements CryptocurrencyService {

    @Override
    public void printCryptocurrency(CryptocurrencyDto cryptocurrency) {
        log.info(cryptocurrency.toString());
    }

}
