package com.example.altiora.demoAltiora.module.client.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.altiora.demoAltiora.module.client.entity.Client;
import com.example.altiora.demoAltiora.module.client.repository.ClientRepo;
import com.example.altiora.demoAltiora.util.base.entity.BaseService;

@Service 
public class ClientService extends BaseService<Client> {

	public ClientService() {
		super(Client.class);
	}

	@Autowired
	private ClientRepo clientRepo;
	
	public List<Client> getAll() {
		List<Client> clients = clientRepo.findAll();
		return clients;
	}
	
	public Client save(Client newClient) {
		if(newClient.getId()!=0)
		{
			Calendar sameDate = new GregorianCalendar();
			newClient.setUpdateDate(sameDate.getTime());
		}
		Client client = clientRepo.save(newClient);	
		return client;
	}
	
	public void deletelogicClientById(int id) throws ServletException {
		Client client = clientRepo.getOne(id);
		if(client != null) {
			client = changeStatus(client);
		}
	}
	
	public void deleteClientById(int id) throws ServletException {
		Client client = clientRepo.getOne(id);
		if(client != null) {
			clientRepo.deleteById(id);
		}
	}
}
