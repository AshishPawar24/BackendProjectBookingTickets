package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.model.User;
import org.springframework.stereotype.Service;

@Service
public class CashfreeServiceImpl implements CashfreeService {

    @Override
    public String createOrder(String orderId, int amount, String name, String email, String phone) {
        return "TEMP_ORDER_CREATED_" + orderId;  // placeholder
    }

    @Override
    public String createorderdirectly(Booking b, User u) {
        return "";
    }

    @Override
    public String checkOrderStatus(String orderId) {
        return "TEMP_STATUS_OK";
    }
}
