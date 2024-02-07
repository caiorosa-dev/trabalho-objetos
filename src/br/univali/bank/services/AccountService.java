package br.univali.bank.services;

import br.univali.bank.core.Account;
import br.univali.bank.core.Bank;
import br.univali.bank.core.Transaction;

import java.util.List;

public class AccountService {
    private final Bank bank;

    public AccountService(Bank bank) {
        this.bank = bank;
    }

    public void deposit (Account account, double amount){
        //Realiza um depósito na conta especificada.
    };

    public void withdraw(Account account, double amount){
        //Realiza um saque na conta especificada.
    };

    public void transfer(Account sourceAccount, Account destinationAccount, double amount){
        //Realiza uma transferência de uma conta de origem para uma conta de destino.
    };

    public double getBalance(Account account){
        //Retorna o saldo atual da conta especificada.

        return 0;
    };

    public List<Transaction> getTransactions(Account account){
        //Retorna uma lista das últimas transações realizadas na conta especificada.

        return null;
    };

    public Account getAccountByNumber(String accountNumber){
        //Retorna a conta bancária com o número especificado.

        return null;
    };
}
