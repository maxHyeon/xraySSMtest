package com.example.xrayssmtest.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleTestService {

    public String echoStringReturn(String t)  {
        return t;
    }
}
