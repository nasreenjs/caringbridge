package com.db.hackathon.dementia.dabbler.caringbridge.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userType;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private String address;
    private String mobileNumber;
    private String hobby;
    private String gender;
    private String profilePhoto;
    private String emergencyContactNumber;
    private String password;
    private String confirmPassword;
    private String patientMobileNumber;
    private double latitude;  // patient
    private double longitude;  // patient
    private double safeRadiusKm;  // patient
}