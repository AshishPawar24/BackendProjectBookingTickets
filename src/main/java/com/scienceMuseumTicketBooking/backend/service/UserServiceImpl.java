package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository urepo;
    public UserServiceImpl(UserRepository urepo) {
        super();
        this.urepo = urepo;
    }
    @Override
    public int insert(User b) {
        System.out.println("Saving user: " + b);
        User savedUser = urepo.save(b);
        // Return the auto-generated ID
        return savedUser.getUid();
    }


    @Override
    public List<User> getall() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getbyid(int id) {

        return urepo.findById(id).get();
    }
    @Override
    public void updateLastLogin(int uid, String date) {
        // TODO Auto-generated method stub
        User user = urepo.findById(uid).get();
        if(user!=null) {
            user.setLastLogin(date);
            urepo.save(user);
        }


    }


}