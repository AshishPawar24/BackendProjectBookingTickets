package com.scienceMuseumTicketBooking.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.scienceMuseumTicketBooking.backend.model.User;
import com.scienceMuseumTicketBooking.backend.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private int uid = 1;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/currentuser")
    public User getCurrentUser() {
        return userService.getbyid(uid);
    }

    @PostMapping("/save")
    public int saveUser(@RequestBody User u) {
        uid = userService.insert(u);
        return uid;
    }

    @PostMapping("/saves")
    public Map<String, Object> saveUserReturnSession(@RequestBody User u) {
        uid = userService.insert(u);
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", uid);
        return map;
    }

    @PostMapping("/updatelast")
    public void updateLastLogin(@RequestParam int uid, @RequestParam String date) {
        userService.updateLastLogin(uid, date);
    }
}
