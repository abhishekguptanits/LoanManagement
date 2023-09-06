package com.greychain.lms;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greychain.lms.entity.LoanStore;
import com.greychain.lms.service.LoanStoreService;
import com.greychain.lms.service.LoanStoreServiceImpl;

@SpringBootApplication()
public class LoanManagementSystemApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LoanManagementSystemApplication.class);
		System.out.println("Let's start working...");
		
		LoanStoreService loanService = new LoanStoreServiceImpl();
		
		Date paymentDate = new Date();
		Date dueDate = paymentDate;
		LoanStore newLoan = loanService.createLoan("L1", "C1", "LEN1", Double.valueOf(10000), Double.valueOf(10000), 
				paymentDate, Float.valueOf(1), dueDate, Float.valueOf((float) 0.01));
		System.out.println(newLoan);
		
		try {
			Date paymentDate1 = new Date(77777L);
			Date dueDate1 = new Date(66666L);
			// Since paymentDate is greater than dueDate, it will throw exception
			LoanStore loan = loanService.createLoan("L2", "C1", "LEN1", Double.valueOf(20000), Double.valueOf(5000), 
					paymentDate1, Float.valueOf(1), dueDate1, Float.valueOf((float) 0.01));
			System.out.println(loan);
		} catch (Exception e) {
			// Catching Exception and Printing error message
			System.out.println("Oh No!! An Exception occured 😉");
			System.out.println(e.getMessage());
		}
	}

}
