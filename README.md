# LoanManagement
Solution For the below Problem Statement

Problem Statement
There is a scenario where thousands of loans are flowing into one store, assume any way of transmission of Loans. We need to create a one loan store, which store the loans in the following order

![image](https://github.com/abhishekguptanits/LoanManagement/assets/96632166/b728806e-cccd-43f4-bba4-99cbb5c47289)

There are couple of requirement/validation
1. The payment date can’t be greater than the Due Date. If its greater we have to reject the Loan and thrown the exception
2. We need to write an aggregation on the remaining amount, Interest and Penalty Group by Lender, Group by Interest and Group by Customer ID.
3. If the Loan crosses the due date, it should write an alert in the log message.
