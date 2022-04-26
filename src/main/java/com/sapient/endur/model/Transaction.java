package com.sapient.endur.model;
/**
 * 
 * @author Admin
 * The methods of an interface are by default public and abstract
 */
public interface Transaction {
	public abstract void deposit(Double amount);
	public abstract String withdraw(Double amount);
	public abstract Double transfer(Double amount, Account toAccount);
	
}
