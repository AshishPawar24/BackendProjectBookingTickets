package com.scienceMuseumTicketBooking.backend.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scienceMuseumTicketBooking.backend.model.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {
    List<Package> findByMuseumMid(int mid);
}