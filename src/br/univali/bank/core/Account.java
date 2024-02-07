package br.univali.bank.core;

import br.univali.bank.customers.interfaces.AccountHolder;
import br.univali.bank.enums.AccountType;
import br.univali.bank.exceptions.InsufficientBalanceException;
import br.univali.bank.exceptions.NotAllowedExceededException;

public class Account {

    private AccountType accountType;
    private String accountNumber;
    private double balance;
    private AccountHolder owner;
    private boolean isAdmin = false;

    public Account(AccountType accountType, String accountNumber, double balance, AccountHolder owner, boolean isAdmin) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.isAdmin = isAdmin;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException();
        }

        this.balance -= amount;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setBalance(double balance) throws NotAllowedExceededException {
        if (!this.isAdmin) {
            throw new NotAllowedExceededException();
        }

        this.balance = balance;
    }

    public boolean isAdmin() {
        return isAdmin;
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
