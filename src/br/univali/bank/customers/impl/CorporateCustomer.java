package br.univali.bank.customers.impl;

import br.univali.bank.customers.Address;
import br.univali.bank.customers.Customer;

import java.util.Date;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String cnpj;

	public CorporateCustomer(String customerID, String fullName, Date dateOfBirth, Address address, String companyName, String cnpj) {
		super(customerID, fullName, dateOfBirth, address);
		this.companyName = companyName;
		this.cnpj = cnpj;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}