package com.BloodBankManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.BloodBankManagementSystem.model.Admin;

@EnableJpaRepositories
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> 
{
	Optional<Admin> findOneByEmailAndPassword(String email, String password);
    //Admin findByUserName(String userName);
     Admin findByEmail(String email);
}
