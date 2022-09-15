package com.facefinderserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.AdminAccount;
import com.model.UserAccount;

@Repository
public interface AccountRepository extends JpaRepository < UserAccount, Integer > {
    //UserAccount findByUsername(String id);
}