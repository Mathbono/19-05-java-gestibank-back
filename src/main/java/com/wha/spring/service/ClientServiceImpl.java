package com.wha.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.spring.idao.IClientDao;
import com.wha.spring.iservice.IClientService;
import com.wha.spring.model.Client;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements IClientService
{
	@Autowired
	private IClientDao dao;
	
	public void saveClient(Client client) {
		 dao.saveClient(client);
	}

    public List<Client> findAllClients() {
    	 return dao.findAllClients();
    } 

	public Client findClientById(int id) {
		return dao.findClientById(id);
	}

	public void updateClient(Client client) {
		dao.updateClient(client);
	}

	public void deleteClientById(int id) {
		dao.deleteClientById(id);
	}
}
