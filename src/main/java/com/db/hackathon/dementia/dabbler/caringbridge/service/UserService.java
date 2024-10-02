package com.db.hackathon.dementia.dabbler.caringbridge.service;

import com.db.hackathon.dementia.dabbler.caringbridge.entity.Users;
import com.db.hackathon.dementia.dabbler.caringbridge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Users saveUserWithProfilePhoto(Users user, String profilePhotoPath) {
        user.setProfilePhoto(profilePhotoPath);
        return userRepository.save(user);
    }



}