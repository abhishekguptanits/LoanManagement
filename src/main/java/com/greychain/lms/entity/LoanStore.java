package com.greychain.lms.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "loan_store")
public class LoanStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String loanId;
	
	@Column(name = "customer_id", nullable = false)
	private String customerId;
	
	@Column(name = "lender_id", nullable = false)
	private String lenderId;
	
	@Column(name = "amount", nullable = false)
	private Double amount;
	
	@Column(name = "remaining_amount", nullable = false)
	private Double remainingAmount;
	
	@Column(name = "payment_date", nullable = false)
	private Date paymentDate;
	
	@Column(name = "interest_per_day", nullable = false)
	private Float interestPerDay;
	
	@Column(name = "due_date", nullable = false)
	private Date dueDate;
	
	@Column(name = "penalty_per_day", nullable = false)
	private Float penaltyPerDay;
	
	public LoanStore() {
		
	}
	
	public LoanStore(String customerId, String lenderId, Double amount, Double remainingAmount,
			Date paymentDate, Float interestPerDay, Date dueDate, Float penaltyPerDay) {
		super();
		this.customerId = customerId;
		this.lenderId = lenderId;
		this.amount = amount;
		this.remainingAmount = remainingAmount;
		this.paymentDate = paymentDate;
		this.interestPerDay = interestPerDay;
		this.dueDate = dueDate;
		this.penaltyPerDay = penaltyPerDay;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLenderId() {
		return lenderId;
	}

	public void setLenderId(String lenderId) {
		this.lenderId = lenderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Float getInterestPerDay() {
		return interestPerDay;
	}

	public void setInterestPerDay(Float interestPerDay) {
		this.interestPerDay = interestPerDay;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Float getPenaltyPerDay() {
		return penaltyPerDay;
	}

	public void setPenaltyPerDay(Float penaltyPerDay) {
		this.penaltyPerDay = penaltyPerDay;
	}

	@Override
	public String toString() {
		return "LoanStore [loanId=" + loanId + ", customerId=" + customerId + ", lenderId=" + lenderId + ", amount="
				+ amount + ", remainingAmount=" + remainingAmount + ", paymentDate=" + paymentDate + ", interestPerDay="
				+ interestPerDay + ", dueDate=" + dueDate + ", penaltyPerDay=" + penaltyPerDay + "]";
	}
	
}
