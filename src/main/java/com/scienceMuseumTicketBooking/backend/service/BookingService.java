package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;

import java.util.List;

public interface BookingService {
    int createBooking(Booking b);
    List<Booking>getbyid(int uid);
    List<Booking>getall();
    String changeStatusBooking(int bid,String ans);
    Booking getbyidone(int uid);
}