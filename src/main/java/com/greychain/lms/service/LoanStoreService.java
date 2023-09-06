package com.greychain.lms.service;

import java.util.Date;

import com.greychain.lms.entity.LoanStore;

public interface LoanStoreService {
	
	public LoanStore createLoan(String loanId, String customerId, String lenderId, Double amount, Double remainingAmount, 
			Date paymentDate, Float interestPerDay, Date dueDate, Float penaltyPerDay) throws Exception;
	
}
