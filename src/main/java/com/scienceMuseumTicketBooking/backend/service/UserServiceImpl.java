package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository urepo;

    public UserServiceImpl(UserRepository urepo) {
        this.urepo = urepo;
    }

    @Override
    public int insert(User u) {
        User saved = urepo.save(u);
        return saved.getUid();
    }

    @Override
    public List<User> getall() {
        return urepo.findAll();
    }

    @Override
    public User getbyid(int id) {
        return urepo.findById(id).orElse(null);
    }

    @Override
    public void updateLastLogin(int uid, String date) {
        User user = urepo.findById(uid).orElse(null);
        if (user != null) {
            user.setLastLogin(date);
            urepo.save(user);
        }
    }
}
