package com.greychain.lms.service;

import java.util.Date;

import com.greychain.lms.entity.LoanStore;

public class LoanStoreServiceImpl implements LoanStoreService {

	@Override
	public LoanStore createLoan(String loanId, String customerId, String lenderId, Double amount, 
			Double remainingAmount, Date paymentDate, Float interestPerDay, 
			Date dueDate, Float penaltyPerDay) throws Exception {
		
		if(dueDate.before(paymentDate)) {
			throw new Exception("The payment date can’t be greater than the Due Date.");
		}
		
		LoanStore loan = new LoanStore(customerId, lenderId, amount, remainingAmount, 
				paymentDate, interestPerDay, dueDate, penaltyPerDay);
		loan.setLoanId(loanId);
		
		return loan;
	}

}
