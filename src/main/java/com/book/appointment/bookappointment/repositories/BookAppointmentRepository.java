package com.book.appointment.bookappointment.repositories;

import com.book.appointment.bookappointment.model.BookAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookAppointmentRepository extends JpaRepository<BookAppointment, BigInteger> {
}
