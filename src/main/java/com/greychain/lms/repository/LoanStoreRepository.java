package com.greychain.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greychain.lms.entity.LoanStore;

public interface LoanStoreRepository extends JpaRepository<LoanStore, String> {
	
}
