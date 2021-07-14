package com.springapi.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapi.crm.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
