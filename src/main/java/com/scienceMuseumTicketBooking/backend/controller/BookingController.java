package com.scienceMuseumTicketBooking.backend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.service.BookingService;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;
    public String sesssion_id;


    private String sessionId;
    private int bid = 0;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/get")
    public Map<String, Object> getSessionId() {
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", sessionId);
        return map;
    }

    @PostMapping("/create")
    public Map<String, Object> createBooking(@RequestBody Booking booking) {

        bid = bookingService.createBooking(booking);
        sessionId = "TEMP_SESSION_ID";

        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", sessionId);
        return map;
    }

    @GetMapping("/user/{uid}")
    public List<Booking> getBookingsByUser(@PathVariable int uid) {
        return bookingService.getById(uid);
    }

    @GetMapping("/booking")
    public Booking getCurrentBooking() {
        return bookingService.getByIdOne(bid);
    }

    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAll();
    }

    @PostMapping("/status")
    public String changeBookingStatus(@RequestParam int bid, @RequestParam String newStatus) {
        return bookingService.changeStatusBooking(bid, newStatus);
    }

    public Booking getcurrentbooking() {
        return null;
    }
}
