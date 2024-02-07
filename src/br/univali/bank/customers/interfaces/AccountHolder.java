package br.univali.bank.customers.interfaces;

import br.univali.bank.customers.Address;

// Interface que representa um titular de conta bancária
public interface AccountHolder {
	/**
	 * Retorna o nome completo do titular da conta.
	 */
	String getFullName();

	/**
	 * Retorna o endereço do titular da conta.
	 */
	Address getAddress();
}