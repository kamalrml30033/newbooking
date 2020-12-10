package com.newproject.booking.repository;

import com.newproject.booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Registration extends JpaRepository<User,Integer> {
   public  User findByEmailAddress(String emailAddress);
   public  User findByEmailAddressAndPassword(String emailAddress, String password);
}
