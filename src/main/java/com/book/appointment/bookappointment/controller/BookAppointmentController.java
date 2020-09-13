package com.book.appointment.bookappointment.controller;

import com.book.appointment.bookappointment.model.AppointmentResponse;
import com.book.appointment.bookappointment.model.BookAppointment;
import com.book.appointment.bookappointment.repositories.BookAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-appointment")
public class BookAppointmentController {

    @Autowired
    private BookAppointmentRepository bookAppointmentRepository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<AppointmentResponse> bookAppointment(@RequestBody BookAppointment bookAppointment) {
        bookAppointmentRepository.save(bookAppointment);
        AppointmentResponse registrationResponse = new AppointmentResponse();
        registrationResponse.setBooking_id(bookAppointment.getBooking_id());
        registrationResponse.setAppointment_date(bookAppointment.getAppointment_date());
        registrationResponse.setStatus(bookAppointment.getStatus());
        registrationResponse.setTime(bookAppointment.getTime());
        return ResponseEntity.status(HttpStatus.CREATED).body(registrationResponse);
    }
}
