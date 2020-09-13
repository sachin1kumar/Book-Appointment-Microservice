package com.book.appointment.bookappointment.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;


public class AppointmentResponse {

    private BigInteger booking_id;
    private Date appointment_date;
    private String status;
    private Time time;

    public AppointmentResponse() {
    }

    public BigInteger getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(BigInteger booking_id) {
        this.booking_id = booking_id;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
