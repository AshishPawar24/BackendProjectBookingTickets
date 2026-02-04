package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Museum;

import java.util.List;

public interface MuseumService {
    List<Museum> card_details();
    Museum fullDetails(int mid);

    // admin
    String createmueByAdmin(Museum mue);
    String updatemueByAdmin(Museum mue);
    String deletemueByAdmin(Museum mue);

    // additional
    List<Museum> findMueByState(String state);
    List<Museum> findMueBycity(String city);
    List<Museum> findMueByStateandCity(String state, String city);
    List<Museum> searchMuseumsByName(String name);
}
