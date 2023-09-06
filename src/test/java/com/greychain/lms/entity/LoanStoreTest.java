package com.greychain.lms.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

class LoanStoreTest {

	@Test
	void testLoanStore() {
		String customerId = "C1";
		String lenderId = "LEN1";
		Double amount = Double.valueOf(10000);
		Double remainingAmount = Double.valueOf(10000);
		Date paymentDate = new Date(77777L);
		Float interesePerDay = Float.valueOf(1);
		Date dueDate = new Date(77777L);
		Float penaltyPerDay = Float.valueOf((float) 0.01);
		LoanStore loan = new LoanStore(customerId, lenderId, amount, remainingAmount, 
				paymentDate, interesePerDay, dueDate, penaltyPerDay);
		
		String loanId = "L1";
		loan.setLoanId(loanId);
		
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
	public void testSetterMethods() {
		String customerId = "C1";
		String lenderId = "LEN1";
		Double amount = Double.valueOf(10000);
		Double remainingAmount = Double.valueOf(10000);
		Date paymentDate = new Date(77777L);
		Float interesePerDay = Float.valueOf(1);
		Date dueDate = new Date(77777L);
		Float penaltyPerDay = Float.valueOf((float) 0.01);
		
		LoanStore loan = new LoanStore();
		loan.setCustomerId(customerId);
		loan.setLenderId(lenderId);
		loan.setAmount(amount);
		loan.setRemainingAmount(remainingAmount);
		loan.setPaymentDate(paymentDate);
		loan.setInterestPerDay(interesePerDay);
		loan.setDueDate(dueDate);
		loan.setPenaltyPerDay(penaltyPerDay);
		String loanString = loan.toString();
		
		assertEquals(customerId, loan.getCustomerId());
		assertEquals(lenderId, loan.getLenderId());
		assertEquals(amount, loan.getAmount());
		assertEquals(remainingAmount, loan.getRemainingAmount());
		assertEquals(paymentDate, loan.getPaymentDate());
		assertEquals(interesePerDay, loan.getInterestPerDay());
		assertEquals(dueDate, loan.getDueDate());
		assertEquals(penaltyPerDay, loan.getPenaltyPerDay());
		assertTrue(loanString.length() > 0);
	}

}
