package com.newproject.booking.service;

import com.newproject.booking.model.User;
import com.newproject.booking.repository.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private Registration registration;

    public User saveUser(User user){
       return registration.save(user);

    }
    public User fetchUserByEmailAddress(String email){
       return registration.findByEmailAddress(email);

    }

    public User fetchUserByEmailAddressAndPassword(String email,String password){
        return registration.findByEmailAddressAndPassword(email,password);

    }
}
