package br.univali.bank.customers;

import br.univali.bank.customers.interfaces.AccountHolder;

import java.util.Date;

// Classe abstrata que representa um cliente
public abstract class Customer implements AccountHolder {
	protected String customerID;
	protected String fullName;
	protected Date dateOfBirth;
	protected Address address;

	public Customer(String customerID, String fullName, Date dateOfBirth, Address address) {
		this.customerID = customerID;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getFullName() {
		return fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}
}
