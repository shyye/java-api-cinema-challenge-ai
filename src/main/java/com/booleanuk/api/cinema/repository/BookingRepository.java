package com.booleanuk.api.cinema.repository;

import com.booleanuk.api.cinema.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}