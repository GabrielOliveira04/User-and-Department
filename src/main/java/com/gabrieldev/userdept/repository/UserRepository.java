package com.gabrieldev.userdept.repository;

import com.gabrieldev.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
