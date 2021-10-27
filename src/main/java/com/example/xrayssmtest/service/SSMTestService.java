package com.example.xrayssmtest.service;

import lombok.RequiredArgsConstructor;
import com.example.xrayssmtest.config.SSMProperties;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SSMTestService {

    private final SSMProperties ssmProperties;

    public String getSSMValue(String ssmValue) {
        return ssmProperties.getKey1Key();
    }
}
