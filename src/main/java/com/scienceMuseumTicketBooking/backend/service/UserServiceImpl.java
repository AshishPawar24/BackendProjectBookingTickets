package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public int insert(User b) {
        return 0;
    }

    @Override
    public List<User> getall() {
        return Collections.emptyList();
    }

    @Override
    public User getbyid(int id) {
        return null;
    }

    @Override
    public void updateLastLogin(int uid, String date) {
        // later update
    }
}
