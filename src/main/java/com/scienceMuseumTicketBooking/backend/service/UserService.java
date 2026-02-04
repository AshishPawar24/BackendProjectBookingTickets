package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.User;

import java.util.List;

public interface UserService {
    int insert(User b);
    List<User> getall();
    User getbyid(int id);
    void updateLastLogin(int uid, String date);
}
