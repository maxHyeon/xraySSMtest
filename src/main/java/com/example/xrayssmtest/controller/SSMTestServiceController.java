package com.example.xrayssmtest.controller;

import com.example.xrayssmtest.service.SSMTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/test")
public class SSMTestServiceController {

    @Autowired
    private SSMTestService ssmTestService;

    @GetMapping(value = "/ssm")
    @ResponseBody
    public String echo(@RequestParam(value = "keyname",defaultValue = "param1") String ssmValue)  {
        return ssmTestService.getSSMValue(ssmValue);
    }
}
