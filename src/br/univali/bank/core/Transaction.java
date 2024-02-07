package br.univali.bank.core;
import br.univali.bank.enums.TransactionType;

import java.util.Date;
public class Transaction{

    private String transactionID;
    private double amount;
    private Date transactionDate;
    private TransactionType transactionType;
    private Account sourceAccount;
    private Account destinationAccount;

    public Transaction(String transactionID, double amount, Date transactionDate, TransactionType transactionType, Account sourceAccount, Account destinationAccount) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    public String getTransactionID(){
        return transactionID;
    }

    public double getAmount(){
        return amount;
    }

    public Date getTransactionDate(){
        return transactionDate;
    }

    public TransactionType getTransactionType(){
        return transactionType;
    }

    public Account getSourceAccount(){
        return sourceAccount;
    }

    public Account getDestinationAccount(){
        return destinationAccount;
    }
}

