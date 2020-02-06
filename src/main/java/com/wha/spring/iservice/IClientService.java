package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Client;


public interface IClientService 
{
    public void saveClient(Client client);
    public  void updateClient(Client client) ;
    public void deleteClientById(int id);
    public List<Client> findAllClients() ;
	public Client findClientById(int id);
}
