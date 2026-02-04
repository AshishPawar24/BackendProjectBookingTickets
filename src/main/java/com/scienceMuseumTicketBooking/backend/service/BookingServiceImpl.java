package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public int createBooking(Booking b) {
        return 0; // TEMP: placeholder
    }

    @Override
    public List<Booking> getById(int uid) {
        return List.of(); // TEMP
    }

    @Override
    public List<Booking> getAll() {
        return List.of(); // TEMP
    }

    @Override
    public String changeStatusBooking(int bid, String ans) {
        return ""; // TEMP
    }

    @Override
    public Booking getByIdOne(int uid) {
        return null; // TEMP
    }
}
