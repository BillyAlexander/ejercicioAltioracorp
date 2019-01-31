package com.example.altiora.demoAltiora.module.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.altiora.demoAltiora.module.item.entity.Item;
import com.example.altiora.demoAltiora.module.item.service.ItemService;
import com.example.altiora.demoAltiora.util.base.entity.BaseError;

@RestController
@RequestMapping(value = "item", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		List<Item> items = itemService.getAll();
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Item newItem) {
		try {			
			return new ResponseEntity<Item>(itemService.save(newItem), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new BaseError(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}

}
