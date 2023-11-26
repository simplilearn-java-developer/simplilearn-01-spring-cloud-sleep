package com.simplilearn.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.spring.bean.Sleep;
import com.simplilearn.spring.config.Config;
import com.simplilearn.spring.service.SleepService;

@RestController
public class SleepController {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    static final String PORT_PROPERTY = "local.server.port";
    
    @Autowired
    Config config;
    
    @Autowired
    Environment environment;

    @Autowired
    SleepService sleepService;

    @GetMapping("/sleep/{birth}") // format: yyyy-MM-dd
    Sleep getSleepRecommendation(@PathVariable String birth) {

    	logger.debug("Getting Sleep Recommendation, birth: {}", birth);
    	
    	String port = this.environment.getProperty(PORT_PROPERTY);
    	String recommendation = this.sleepService.getSleepRecommendation(birth);
    	
    	return new Sleep(birth,recommendation,port);
    	
    }

    @GetMapping("/sleep/config") 
    Config getSleepConfig() {
    	
    	logger.debug("Getting Sleep Configuration");
    	    	
    	return config;
    }
}
