package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Client;

public interface IClientDao
{
	public void saveClient(Client client);
	public Client findClientById(int id);
	public List<Client> findAllClients();
	public void updateClient(Client client);
	public void deleteClientById(int id);
}
	
