package com.telusko.SecurityEx01.repository;

import com.telusko.SecurityEx01.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

    UserModel findByUsername(String username);
}
