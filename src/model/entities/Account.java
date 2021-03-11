package model.entities;

import model.exceptions.DomainException;

public class Account {
    
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {

	}
	
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withdrawLimit;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}


	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

    public Double deposit(Double deposit) {
    	return balance += deposit;
    }
   
    public Double withdraw(Double withdraw)  {
    
      if (withdraw > withDrawLimit) {
    	 throw new DomainException("The amount exceeds withDraw limit");
     }else if (withdraw  > balance) {
        	 throw new DomainException("Not enough balance");
     }else {
    	 return balance -= withdraw;
     }
     
     }
     
     public String toString() {
    	 return "New balance: "+String.format("%.2f",balance);
    	 
     }
     
    
	
	
	
	
}
