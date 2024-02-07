package br.univali.bank.customers;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	/**
	 * Retorna a rua do endereço.
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Define a rua do endereço.
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Retorna a cidade do endereço.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Define a cidade do endereço.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Retorna o estado do endereço.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Define o estado do endereço.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Retorna o CEP do endereço.
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Define o CEP do endereço.
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
