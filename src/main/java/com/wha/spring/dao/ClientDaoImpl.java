package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.IClientDao;
import com.wha.spring.model.Client;


@Repository("clientDao")
public class  ClientDaoImpl extends AbstractDao implements IClientDao 
{
	
	public  void saveClient(Client client) {
		persist(client);
	}
	
	public Client findClientById(int id) {
		return (Client) getSession().get(Client.class, id);
	}
	
	public List<Client> findAllClients() {
		String req ="SELECT c FROM Client c";
		List<Client> listClients = getSession().createQuery(req).list();
		return listClients ;	
	}
	
	public void updateClient(Client client) {
		getSession().update(client);
	}

	public void deleteClientById(int id) {
		getSession().delete(Client.class);
	}
}
