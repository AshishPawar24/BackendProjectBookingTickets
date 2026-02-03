package com.scienceMuseumTicketBooking.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scienceMuseumTicketBooking.backend.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByUserUid(int uid);
}