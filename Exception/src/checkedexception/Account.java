package checkedexception;

import java.math.BigDecimal;

public class Account {
	
	public int accountNumber;
	public BigDecimal amount;
	
	
	public Account(int accountNumber, BigDecimal amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
