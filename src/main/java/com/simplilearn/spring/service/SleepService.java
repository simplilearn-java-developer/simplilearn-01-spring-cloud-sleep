package com.simplilearn.spring.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.spring.config.Config;

@Service
public class SleepService {

    @Autowired
    Config config;

    public String getSleepRecommendation(String birth) {

        LocalDate now = LocalDate.now();
        LocalDate dob = LocalDate.parse(birth);

        if (dob.isAfter(now)) {
            throw new RuntimeException("Invalid date of birth!, birth: " + birth);
        }

        Period period = Period.between(dob, now);

        if (period.getYears() >= config.getAdults3Age()) { /* Adult */
            return config.getAdults3Msg();
        }
        else if (period.getYears()>= config.getAdults2Age()) { /* Adult */
            return config.getAdults2Msg();
        }
        else if (period.getYears()>= config.getAdults1Age()) { /* Adult */
            return config.getAdults1Msg();
        }
        else if (period.getYears()>= config.getTeenAge()) { /* Teen: 13-18 years */
            return config.getTeenMsg();
        }
        else if (period.getYears()>= config.getSchoolAge()) { /* School Age: 6-12 years */
            return config.getSchoolMsg();
        }
        else if (period.getYears()>= config.getPreschoolAge()) { /* PreSchool Age: 3-5 years */
            return config.getPreschoolMsg();
        }
        else if (period.getYears()>= config.getToddlerAge()) { /* Toddler: 1-2 years */
            return config.getToddlerMsg();
        }
        else if (period.getMonths()>= config.getInfantAge()) { /* Infant: 4-12 months */
            return config.getInfantMsg();
        }
        else { /* Newborn: 0-3 months */
            return config.getNewbornMsg();
        }
    }
}
