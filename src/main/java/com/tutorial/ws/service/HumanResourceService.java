package com.tutorial.ws.service;

import java.util.Date;

/**
 * Interface for HR Service
 */
public interface HumanResourceService {

    /**
     * Books a holiday.
     *
     * @param startDate the start date of the holiday
     * @param endDate   the end date of the holiday
     * @param name      the name of the person taking the holiday
     */
    void bookHoliday(Date startDate, Date endDate, String name);
}
