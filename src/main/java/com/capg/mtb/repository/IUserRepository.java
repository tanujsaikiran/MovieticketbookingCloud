package com.capg.mtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.mtb.model.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
