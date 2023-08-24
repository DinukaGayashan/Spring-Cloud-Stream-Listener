package com.dinukagayashan.springcloudstreamlistener.domain.service.impl;

import com.dinukagayashan.springcloudstreamlistener.domain.dto.UserDto;
import com.dinukagayashan.springcloudstreamlistener.domain.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(UserDto user) {
        log.info(user.toString());
    }

}
