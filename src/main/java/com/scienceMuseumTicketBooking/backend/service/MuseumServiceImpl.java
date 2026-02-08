package com.scienceMuseumTicketBooking.backend.service;

import com.scienceMuseumTicketBooking.backend.model.Museum;
import com.scienceMuseumTicketBooking.backend.repository.MuseumRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MuseumServiceImpl implements MuseumService {

    private final MuseumRepository mrepo;

    public MuseumServiceImpl(MuseumRepository mrepo) {
        this.mrepo = mrepo;
    }

    @Override
    public List<Museum> card_details() {
        return mrepo.findAll();
    }

    @Override
    public Museum fullDetails(int mid) {
        return mrepo.findById(mid).orElse(null);
    }

    @Override
    public String createmueByAdmin(Museum mue) {
        mrepo.save(mue);
        return "success";
    }

    @Override
    public String updatemueByAdmin(Museum mue) {
        Museum existing = mrepo.findById(mue.getMid()).orElse(null);
        if (existing == null) return "Museum not found";

        mrepo.save(mue);
        return "updated";
    }

    @Override
    public String deletemueByAdmin(Museum mue) {
        Museum existing = mrepo.findById(mue.getMid()).orElse(null);
        if (existing == null) return "Museum not found";

        mrepo.delete(existing);
        return "deleted";
    }

    @Override
    public List<Museum> findMueByState(String state) {
        return mrepo.findMueByState(state);
    }

    @Override
    public List<Museum> findMueBycity(String city) {
        return mrepo.findMueByCity(city);
    }

    @Override
    public List<Museum> findMueByStateandCity(String state, String city) {
        return mrepo.findMueByStateAndCity(state, city);
    }

    @Override
    public List<Museum> searchMuseumsByName(String name) {
        return mrepo.findMuseumsByMunameStartingWith(name);
    }
}