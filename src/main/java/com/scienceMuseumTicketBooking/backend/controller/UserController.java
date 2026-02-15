package com.scienceMuseumTicketBooking.backend.controller;

import java.util.HashMap;
import java.util.Map;

import com.scienceMuseumTicketBooking.backend.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;
import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    int uid=1;
    UserServiceImpl userv;
    public UserController(UserServiceImpl userv) {
        super();
        this.userv = userv;
    }
    @GetMapping("/currentuser")
    public User getCurrentUser() {

        return userv.getbyid(uid);
    }

    @PostMapping("/save")
    public int insert(@RequestBody User b1) {
        uid=userv.insert(b1);
        return uid;
    }

    @PostMapping("/saves")
    public Map insertrandom(@RequestBody User b1) {
        uid=userv.insert(b1);
        Map map=new HashMap();
        map.put("sessionId",uid);
        return map;
    }

    @PostMapping("/updatelast")
    public void updatelastLogin(int uid, String date) {
        userv.updateLastLogin(uid, date);
    }


}