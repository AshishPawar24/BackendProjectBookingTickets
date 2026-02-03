package com.scienceMuseumTicketBooking.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scienceMuseumTicketBooking.backend.model.Museum;


//public interface MuseumRepository<Museum> extends JpaRepository<Museum, Integer> {
public interface MuseumRepository extends JpaRepository<Museum, Integer> {
    List<Museum> findMueByState(String state);

    // Find museums by city
    List<Museum> findMueByCity(String city);

    // Find museums by state and city
    List<Museum> findMueByStateAndCity(String state, String city);
    @Query("SELECT m FROM Museum m WHERE m.muname LIKE CONCAT(:name, '%') ORDER BY m.muname ASC")
    List<Museum> findMuseumsByMunameStartingWith(@Param("name") String name);

}