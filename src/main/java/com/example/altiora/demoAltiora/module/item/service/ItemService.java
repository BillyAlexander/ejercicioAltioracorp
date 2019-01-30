package com.example.altiora.demoAltiora.module.item.service;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.altiora.demoAltiora.module.item.entity.Item;
import com.example.altiora.demoAltiora.module.item.repository.ItemRepo;
import com.example.altiora.demoAltiora.util.base.entity.BaseService;

@Service 
public class ItemService extends BaseService<Item> {

	public ItemService() {
		super(Item.class);
	}
	
	@Autowired	
	private ItemRepo itemRepo;
	
	public List<Item> getAll() {
		List<Item> items = itemRepo.findAll();
		return items;
	}
	
	public Item save(Item newItem) {
		Item item = itemRepo.save(newItem);
		return item;
	}
	
	public void deleteLogicItemById(int id) throws ServletException {
		Item item = itemRepo.getOne(id);
		if(item != null) {
			item = changeStatus(item);
		}
	}
}
