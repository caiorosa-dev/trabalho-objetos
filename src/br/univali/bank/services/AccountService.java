package br.univali.bank.services;

import br.univali.bank.core.Account;
import br.univali.bank.core.Transaction;

import java.util.List;

public class AccountService {

    public void deposit (Account account, double amount){
        amount++;
        //Realiza um depósito na conta especificada.
    };

    public void withdraw(Account account, double amount){
        amount--;
        System.out.println(amount);
        //Realiza um saque na conta especificada.
    };

    public void transfer(Account sourceAccount, Account destinationAccount, double amount){
        sourceAccount--;
        destinationAccount++;
        System.out.println(amount);
        //Realiza uma transferência de uma conta de origem para uma conta de destino.
    };

    public double void getBalance(Account account){
        System.out.println(account);
        //Retorna o saldo atual da conta especificada.
    };

    public void getTransactions(Account account){
        List<Transaction>;
        //Retorna uma lista das últimas transações realizadas na conta especificada.
    };

    public void getAccountByNumber(String accountNumber){
        System.out.println(Account);
        //Retorna a conta bancária com o número especificado.
    };
}
