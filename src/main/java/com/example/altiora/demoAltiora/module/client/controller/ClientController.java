package com.example.altiora.demoAltiora.module.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.altiora.demoAltiora.module.client.entity.Client;
import com.example.altiora.demoAltiora.module.client.service.ClientService;
import com.example.altiora.demoAltiora.util.base.entity.BaseError;

@RestController
@RequestMapping(value = "client", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		List<Client> clients = clientService.getAll();
		return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Client newClient) {
		try {			
			return new ResponseEntity<Client>(clientService.save(newClient), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new BaseError(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> delete(@PathVariable int id) {
		try {	
			Client client = null;
			clientService.deleteClientById(id);
			return new ResponseEntity<Client>(client, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new BaseError(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}

}
