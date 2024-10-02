package com.db.hackathon.dementia.dabbler.caringbridge.repository;


import com.db.hackathon.dementia.dabbler.caringbridge.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}