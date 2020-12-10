package com.newproject.booking.controller;

import com.newproject.booking.model.User;
import com.newproject.booking.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
   private RegistrationService registrationService;

    @PostMapping ("/registeruser")
    public User registrUser(@RequestBody User user) throws Exception {

        String tempEmailAddress =user.getEmailAddress();
        if(tempEmailAddress !=null && !"".equals(tempEmailAddress)){

            User userobj = registrationService.fetchUserByEmailAddress(tempEmailAddress);
            if(userobj != null){
                throw new Exception("user with "+tempEmailAddress+ "is already exist");

            }
        }
        User userObj = null;
        userObj =  registrationService.saveUser(user);
        return userObj;

    }
    @PostMapping("/login")
    public User loginUser(@RequestBody User user) throws Exception {

        String tempEmailAddress = user.getEmailAddress();
        String tempPassword = user.getPassword();
        User userObj = null;
        if(tempEmailAddress !=null && tempPassword !=null){
            userObj = registrationService.fetchUserByEmailAddressAndPassword(tempEmailAddress,tempPassword);

        }
        if(userObj==null){
            throw new Exception("User does not exist");
        }
        return userObj;
    }

}
