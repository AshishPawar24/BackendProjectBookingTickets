package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.model.User;

public interface CashfreeService {

    String createOrder(String orderId, int amount, String name, String email, String phone);

    String createorderdirectly(Booking b, User u);

    String checkOrderStatus(String orderId);
}
