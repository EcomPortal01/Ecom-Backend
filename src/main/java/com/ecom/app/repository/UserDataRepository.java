package com.ecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.app.module.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long>{

}
