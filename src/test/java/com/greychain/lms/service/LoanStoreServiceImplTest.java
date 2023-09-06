package com.greychain.lms.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.greychain.lms.entity.LoanStore;

class LoanStoreServiceImplTest {

	@Test
	void testCreateLoan() throws Exception {
		String loanId = "L1";
		String customerId = "C1";
		String lenderId = "LEN1";
		Double amount = Double.valueOf(10000);
		Double remainingAmount = Double.valueOf(10000);
		Date paymentDate = new Date(77777L);
		Float interesePerDay = Float.valueOf(1);
		Date dueDate = new Date(77777L);
		Float penaltyPerDay = Float.valueOf((float) 0.01);
		
		LoanStoreServiceImpl loanStoreServiceImpl = new LoanStoreServiceImpl();
		LoanStore loan = loanStoreServiceImpl.createLoan(loanId, customerId, lenderId, 
				amount, remainingAmount, paymentDate, interesePerDay, dueDate, penaltyPerDay);
		
		assertEquals(customerId, loan.getCustomerId());
		assertEquals(lenderId, loan.getLenderId());
		assertEquals(amount, loan.getAmount());
		assertEquals(remainingAmount, loan.getRemainingAmount());
		assertEquals(paymentDate, loan.getPaymentDate());
		assertEquals(interesePerDay, loan.getInterestPerDay());
		assertEquals(dueDate, loan.getDueDate());
		assertEquals(penaltyPerDay, loan.getPenaltyPerDay());
		assertEquals(loanId, loan.getLoanId());
	}
	
	@Test
	void testCreateLoan_Exception() throws Exception {
		String loanId = "L1";
		String customerId = "C1";
		String lenderId = "LEN1";
		Double amount = Double.valueOf(10000);
		Double remainingAmount = Double.valueOf(10000);
		Date paymentDate = new Date(77777L);
		Float interesePerDay = Float.valueOf(1);
		Date dueDate = new Date(77776L);
		Float penaltyPerDay = Float.valueOf((float) 0.01);
		
		LoanStoreServiceImpl loanStoreServiceImpl = new LoanStoreServiceImpl();
		
		String errorMessage = "The payment date can’t be greater than the Due Date.";
		try {
			loanStoreServiceImpl.createLoan(loanId, customerId, lenderId, 
					amount, remainingAmount, paymentDate, interesePerDay, dueDate, penaltyPerDay);
		} catch (Exception e) {
			assertEquals(errorMessage, e.getMessage());
		}
	}

}
