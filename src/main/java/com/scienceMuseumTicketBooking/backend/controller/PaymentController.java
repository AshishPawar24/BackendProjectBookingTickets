package com.scienceMuseumTicketBooking.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.scienceMuseumTicketBooking.backend.model.ORDER_MODEL;
import com.scienceMuseumTicketBooking.backend.model.Booking;
import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.service.CashfreeService;

@RestController
@CrossOrigin
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private CashfreeService cashfreeService;

    @PostMapping("/create-order")
    public String createOrder(@RequestBody ORDER_MODEL o) {

        return cashfreeService.createOrder(
                o.getOrder_id(),
                o.getAmount(),
                o.getCustomer_name(),
                o.getCustomer_email(),
                String.valueOf(o.getCustomer_phone())
        );
    }

    @GetMapping("/directly")
    public String createorderdirectly(Booking b, User u) {
        return cashfreeService.createorderdirectly(b, u);
    }

    @GetMapping("/order-status")
    public String getOrderStatus(@RequestParam String orderId) {
        return cashfreeService.checkOrderStatus(orderId);
    }
}
