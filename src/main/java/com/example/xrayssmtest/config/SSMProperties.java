package com.example.xrayssmtest.config;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class SSMProperties {
    @Value("${key1:}")
    private String key1Key;
}
