package br.univali.bank.core;

import br.univali.bank.customers.interfaces.AccountHolder;
import br.univali.bank.enums.AccountType;
import br.univali.bank.exceptions.InsufficientBalanceException;

public class Account {

    private AccountType accountType;

    private String accountNumber;
    private double balance;
    private AccountHolder owner;

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException();
        }
        this.balance -= amount;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public  AccountType getAccountType(){
        return accountType;
    }
    public AccountHolder getOwner(){
        return owner;
    }

}
