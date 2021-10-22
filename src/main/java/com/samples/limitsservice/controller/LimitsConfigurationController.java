package com.samples.limitsservice.controller;

import com.samples.limitsservice.Configuration;
import com.samples.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limitsold")
    public LimitConfiguration retrieveLimitsFromConfigurationold(){
        return  new LimitConfiguration(1000,1);
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return  new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
