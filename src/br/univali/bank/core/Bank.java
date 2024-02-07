package br.univali.bank.core;

import br.univali.bank.customers.Customer;

import java.util.List;

public class Bank {

    private List<Account> accounts;
    private List<Customer> customers;
    private List<Transaction> transactions;

    public Bank(List<Account> accounts, List<Customer> customers, List<Transaction> transactions) {
        this.accounts = accounts;
        this.customers = customers;
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
}
