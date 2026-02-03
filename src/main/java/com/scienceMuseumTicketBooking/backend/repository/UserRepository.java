package com.scienceMuseumTicketBooking.backend.repository;

import com.scienceMuseumTicketBooking.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<User, Integer> {

}