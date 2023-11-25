package com.simplilearn.spring.bean;

public class Sleep {

    String birth;
    String recommendation;
    String sleepEnvironment;

    public Sleep(String birth, String recommendation, String sleepEnvironment) {
        this.birth = birth;
        this.recommendation = recommendation;
        this.sleepEnvironment = sleepEnvironment;
    }
    public String getBirth() {
        return birth;
    }
    public String getRecommendation() {
        return recommendation;
    }
    public String getSleepEnvironment() {
        return sleepEnvironment;
    }


}
