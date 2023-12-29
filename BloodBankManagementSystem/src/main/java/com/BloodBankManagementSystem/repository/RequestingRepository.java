package com.BloodBankManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.BloodBankManagementSystem.model.Requesting;


@EnableJpaRepositories
@Repository
public interface RequestingRepository extends JpaRepository<Requesting, Integer> 
{

	//void updateStatus(String email);

	//void rejectStatus(String email);

}
