package br.univali.bank.services;

import br.univali.bank.core.Account;
import br.univali.bank.core.Transaction;
import br.univali.bank.customers.Customer;

import java.util.List;

public class CustomerService {

    public void addCustomer(Customer customer){
        //Adiciona um novo cliente ao sistema.
    };

    public void updateCustomer(Customer customer){
        //Atualiza as informações do cliente no sistema.
    };

    public void deleteCustomer(Customer customer){
        //Remove um cliente do sistema.
    };

    public Customer getCustomerByID(String customerID){
        //Retorna um cliente pelo ID especificado.

        return null;
    };

    public List<Customer> getAllCustomers(){
        //Retorna uma lista de todos os clientes no sistema.

        return null;
    };

    public List<Account> getCustomerAccounts(Customer customer){
        //Retorna uma lista das contas associadas ao cliente especificado.

        return null;
    }

    public List<Transaction> getCustomerTransactions(Customer customer){
        //Retorna uma lista das últimas transações realizadas pelo cliente especificado.

        return null;
    };
}
