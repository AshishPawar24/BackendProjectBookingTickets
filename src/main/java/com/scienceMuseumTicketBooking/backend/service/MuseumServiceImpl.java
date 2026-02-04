package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Museum;
import com.scienceMuseumTicketBooking.backend.repository.MuseumRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MuseumServiceImpl implements MuseumService{
    private final MuseumRepository museumRepository;

    public MuseumServiceImpl(MuseumRepository museumRepository) {
        this.museumRepository = museumRepository;
    }

    @Override
    public List<Museum> card_details() {
        return Collections.emptyList();
    }

    @Override
    public Museum fullDetails(int mid) {
        return null;
    }

    @Override
    public String createmueByAdmin(Museum mue) {
        return null;
    }

    @Override
    public String updatemueByAdmin(Museum mue) {
        return null;
    }

    @Override
    public String deletemueByAdmin(Museum mue) {
        return null;
    }

    @Override
    public List<Museum> findMueByState(String state) {
        return Collections.emptyList();
    }

    @Override
    public List<Museum> findMueBycity(String city) {
        return Collections.emptyList();
    }

    @Override
    public List<Museum> findMueByStateandCity(String state, String city) {
        return Collections.emptyList();
    }

    @Override
    public List<Museum> searchMuseumsByName(String name) {
        return Collections.emptyList();
    }
}
