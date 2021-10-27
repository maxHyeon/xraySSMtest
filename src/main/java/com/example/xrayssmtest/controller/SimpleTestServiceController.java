package com.example.xrayssmtest.controller;

import com.example.xrayssmtest.service.SimpleTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/v1/test")
public class SimpleTestServiceController {
    @Autowired
    private SimpleTestService simpleTestService;

    @GetMapping(value = "/echo")
    @ResponseBody
    public String echo(@RequestParam(value = "string",defaultValue = "test") String echoText)  {
        return simpleTestService.echoStringReturn(echoText);
    }
}
