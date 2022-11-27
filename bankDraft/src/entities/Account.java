package entities;

import java.util.Random;

public class Account {
	private String name;
	private Integer numAccount;
	private Double balance;
	
	public Account(){
	}

	public Account(String name, Integer numAccount, Double balance) {

		this.name = name;
		this.numAccount = numAccount;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(Integer numAccount) {
		this.numAccount = numAccount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double value) {
		balance -= value;
	}
	
	
	public String toString() {
		
		return  "Nome: "+name + ", " + "Account: "+numAccount  + ", " + "Balance: "+ String.format("%.2f", balance);
		
	}
	
	
	
	
}
