package br.univali.bank.services;

import br.univali.bank.core.Account;
import br.univali.bank.core.Transaction;
import br.univali.bank.customers.Customer;

import java.util.List;

public class CustomerService {

    public void addCustomer(Customer customer){
        customer = new client;
        //Adiciona um novo cliente ao sistema.
    };

    public void updateCustomer(Customer customer){
        customer customized;
        System.out.print(updateCustomer);
        //Atualiza as informações do cliente no sistema.
    };

    public void deleteCustomer(Customer customer){
        Delete(customer);
        //Remove um cliente do sistema.
    };

    public void getCustomerByID(String customerID){
        //Retorna um cliente pelo ID especificado.
    };

    public void getAllCustomers(){
        List <Customer>;
        //Retorna uma lista de todos os clientes no sistema.
    };

    public void getCustomerAccounts(Customer customer){
        List<Account>;
        //Retorna uma lista das contas associadas ao cliente especificado.
    };

    public void getCustomerTransactions(Customer customer){
        List<Transaction>;
        //Retorna uma lista das últimas transações realizadas pelo cliente especificado.
    };
}
