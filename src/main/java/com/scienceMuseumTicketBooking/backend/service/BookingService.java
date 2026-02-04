package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;

import java.util.List;

public interface BookingService {
    int createBooking(Booking b);
    List<Booking> getById(int uid);
    List<Booking> getAll();
    String changeStatusBooking(int bid, String ans);
    Booking getByIdOne(int uid);
}
