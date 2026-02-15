package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    BookingRepository brepo;
    public BookingServiceImpl(BookingRepository brepo) {
        super();
        this.brepo = brepo;
    }

    @Override
    public int createBooking(Booking b) {

        Booking booo = brepo.save(b);
        return booo.getBid();
    }

    @Override
    public List<Booking>getbyid(int uid) {
        List<Booking> l = brepo.findByUserUid(uid);
        return l;
    }

    @Override
    public List<Booking> getall() {
        // TODO Auto-generated method stub
        return brepo.findAll();

    }

    @Override
    public String changeStatusBooking(int bid,String ans) {
        // TODO Auto-generated method stub
        Booking booking = brepo.findById(bid).get();
        if(booking==null) {
            return "booking not found";
        }
        else {
            booking.setBooking_status(ans);
            brepo.save(booking);
            return"Status updated successfully";
        }
    }

    @Override
    public Booking getbyidone(int uid) {
        return brepo.findById(uid).get();
    }

}