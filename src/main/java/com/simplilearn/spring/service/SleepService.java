package com.simplilearn.spring.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

@Service
public class SleepService {


    public String getSleepRecommendation(String birth) {

        LocalDate now = LocalDate.now();
        LocalDate dob = LocalDate.parse(birth);

        if (dob.isAfter(now)) {
            throw new RuntimeException("Invalid date of birth!, birth: " + birth);
        }

        Period period = Period.between(dob, now);

        if (period.getYears() >= 65) { /* Adult */
            return "7-9 hours";
        }
        else if (period.getYears()>= 61) { /* Adult */
            return "7-8 hours";
        }
        else if (period.getYears()>= 18) { /* Adult */
            return "7 or more hours per night";
        }
        else if (period.getYears()>= 13) { /* Teen: 13-18 years */
            return "8-10 hours per 24 hours";
        }
        else if (period.getYears()>= 6) { /* School Age: 6-12 years */
            return "9-12 hours per 24 hours";
        }
        else if (period.getYears()>= 3) { /* PreSchool Age: 3-5 years */
            return "10-13 hours per 24 hours (including naps)";
        }
        else if (period.getYears()>= 1) { /* Toddler: 1-2 years */
            return "11-14 hours per 24 hours (including naps)";
        }
        else if (period.getMonths()>= 4) { /* Infant: 4-12 months */
            return "12-16 hours per 24 hours (including naps)";
        }
        else { /* Newborn: 0-3 months */
            return "14-17 hours (National Sleep Foundation)";
        }
    }
}
