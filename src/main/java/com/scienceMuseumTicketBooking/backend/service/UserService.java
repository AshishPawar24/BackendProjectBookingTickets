package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.User;

import java.util.List;

public interface UserService {
    public int insert(User b);
    public List<User> getall();
    public User getbyid(int id);
    public void updateLastLogin(int uid, String date);

}