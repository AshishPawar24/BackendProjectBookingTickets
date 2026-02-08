package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository brepo;

    public BookingServiceImpl(BookingRepository brepo) {
        this.brepo = brepo;
    }

    @Override
    public int createBooking(Booking b) {
        Booking saved = brepo.save(b);
        return saved.getBid();
    }

    @Override
    public List<Booking> getById(int uid) {
        return List.of();
    }

    @Override
    public List<Booking> getAll() {
        return List.of();
    }

    @Override
    public List<Booking> getbyid(int uid) {
        return brepo.findByUserUid(uid);
    }

    @Override
    public List<Booking> getall() {
        return brepo.findAll();
    }

    @Override
    public String changeStatusBooking(int bid, String ans) {
        Booking booking = brepo.findById(bid).orElse(null);

        if (booking == null) {
            return "booking not found";
        }

        booking.setBooking_status(ans);
        brepo.save(booking);
        return "Status updated successfully";
    }

    @Override
    public Booking getByIdOne(int uid) {
        return null;
    }

    @Override
    public Booking getbyidone(int bid) {
        return brepo.findById(bid).orElse(null);
    }
}