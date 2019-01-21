package com.tutorial.ws.service;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Simple hr service implementation
 */
@Component
public class HumanResourceServiceImpl implements HumanResourceService {

    @Override
    public void bookHoliday(Date startDate, Date endDate, String name) {
        System.out.println("Booking holiday for [" + startDate + " - " + endDate + "] for employee : " + name);
    }

}
