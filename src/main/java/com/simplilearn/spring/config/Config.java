package com.simplilearn.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sleep-service")
@PropertySource("classpath:config.properties")
public class Config {

    @Value("${sleep-service.adults3.age}")
    int adults3Age;

    @Value("${sleep-service.adults3.msg}")
    String adults3Msg;

    @Value("${sleep-service.adults2.age}")
    int adults2Age;

    @Value("${sleep-service.adults2.msg}")
    String adults2Msg;

    @Value("${sleep-service.adults1.age}")
    int adults1Age;

    @Value("${sleep-service.adults1.msg}")
    String adults1Msg;

    @Value("${sleep-service.teen.age}")
    int teenAge;

    @Value("${sleep-service.teen.msg}")
    String teenMsg;

    @Value("${sleep-service.school.age}")
    int schoolAge;

    @Value("${sleep-service.school.msg}")
    String schoolMsg;

    @Value("${sleep-service.preschool.age}")
    int preschoolAge;

    @Value("${sleep-service.preschool.msg}")
    String preschoolMsg;

    @Value("${sleep-service.toddler.age}")
    int toddlerAge;

    @Value("${sleep-service.toddler.msg}")
    String toddlerMsg;

    @Value("${sleep-service.infant.age}")
    int infantAge;

    @Value("${sleep-service.infant.msg}")
    String infantMsg;

    @Value("${sleep-service.newborn.age}")
    int newbornAge;

    @Value("${sleep-service.newborn.msg}")
    String newbornMsg;


    public int getAdults3Age() {
        return adults3Age;
    }

    public String getAdults3Msg() {
        return adults3Msg;
    }

    public int getAdults2Age() {
        return adults2Age;
    }

    public String getAdults2Msg() {
        return adults2Msg;
    }

    public int getAdults1Age() {
        return adults1Age;
    }

    public String getAdults1Msg() {
        return adults1Msg;
    }

    public int getTeenAge() {
        return teenAge;
    }

    public String getTeenMsg() {
        return teenMsg;
    }

    public int getSchoolAge() {
        return schoolAge;
    }

    public String getSchoolMsg() {
        return schoolMsg;
    }

    public int getPreschoolAge() {
        return preschoolAge;
    }

    public String getPreschoolMsg() {
        return preschoolMsg;
    }

    public int getToddlerAge() {
        return toddlerAge;
    }

    public String getToddlerMsg() {
        return toddlerMsg;
    }

    public int getInfantAge() {
        return infantAge;
    }

    public String getInfantMsg() {
        return infantMsg;
    }

    public int getNewbornAge() {
        return newbornAge;
    }

    public String getNewbornMsg() {
        return newbornMsg;
    }

}
