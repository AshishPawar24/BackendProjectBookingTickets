package com.scienceMuseumTicketBooking.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.scienceMuseumTicketBooking.backend.model.Museum;
import com.scienceMuseumTicketBooking.backend.service.MuseumService;

@RestController
@CrossOrigin
@RequestMapping("/museum")
public class MuseumController {

    private final MuseumService museumService;

    private int mueid = 0;

    public MuseumController(MuseumService museumService) {
        this.museumService = museumService;
    }

    @GetMapping("/all")
    public List<Museum> getMuseumCards() {
        return museumService.card_details();
    }

    @GetMapping("/mue/{mid}")
    public Museum getMuseumDetails(@PathVariable int mid) {
        mueid = mid;
        return museumService.fullDetails(mid);
    }

    @PostMapping("/create")
    public String createMuseum(@RequestBody Museum museum) {
        return museumService.createmueByAdmin(museum);
    }

    @GetMapping("/mue/by-state")
    public List<Museum> findByState(@RequestParam String state) {
        return museumService.findMueByState(state);
    }

    @GetMapping("/mue/by-city")
    public List<Museum> findByCity(@RequestParam String city) {
        return museumService.findMueBycity(city);
    }

    @GetMapping("/mue/by-both")
    public List<Museum> findByStateAndCity(@RequestParam String state, @RequestParam String city) {
        return museumService.findMueByStateandCity(state, city);
    }

    @GetMapping("/mue/search")
    public List<Museum> searchByName(@RequestParam String name) {
        return museumService.searchMuseumsByName(name);
    }
}
