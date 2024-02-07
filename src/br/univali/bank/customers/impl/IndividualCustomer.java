package br.univali.bank.customers.impl;

import br.univali.bank.customers.Address;
import br.univali.bank.customers.Customer;
import br.univali.bank.enums.MaritalStatus;

import java.util.Date;

public class IndividualCustomer extends Customer {
	private String cpf;
	private MaritalStatus maritalStatus;

	public IndividualCustomer(String customerID, String fullName, Date dateOfBirth, Address address, String cpf, MaritalStatus maritalStatus) {
		super(customerID, fullName, dateOfBirth, address);
		this.cpf = cpf;
		this.maritalStatus = maritalStatus;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}