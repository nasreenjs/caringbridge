package com.db.hackathon.dementia.dabbler.caringbridge.controller;

import com.db.hackathon.dementia.dabbler.caringbridge.entity.Users;
import com.db.hackathon.dementia.dabbler.caringbridge.service.GcpStorageService;
import com.db.hackathon.dementia.dabbler.caringbridge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private GcpStorageService gcpStorageService;

    @PostMapping("/create")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }



    @PostMapping("/upload")
    public String uploadProfilePhoto(@RequestParam("file") MultipartFile file) throws IOException {
        return gcpStorageService.uploadFile(file);
    }

}