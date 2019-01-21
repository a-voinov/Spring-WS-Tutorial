package com.tutorial.ws.port;

import com.mycompany.hr.schemas.HolidayRequest;
import com.tutorial.ws.service.HumanResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

/**
 * Endpoint handles holiday requests
 */
@Endpoint
public class HREndpoint {

    private HumanResourceService service;

    @Autowired
    public HREndpoint(HumanResourceService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = "http://mycompany.com/hr/schemas",
            localPart = "HolidayRequest")
    public void handleHolidayRequest(@RequestPayload HolidayRequest holidayRequest){
        service.bookHoliday(
                holidayRequest.getHoliday().getStartDate().toGregorianCalendar().getTime(),
                holidayRequest.getHoliday().getEndDate().toGregorianCalendar().getTime(),
                holidayRequest.getEmployee().getFirstName() + " " + holidayRequest.getEmployee().getLastName());
    }
}
