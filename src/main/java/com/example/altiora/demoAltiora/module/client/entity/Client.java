package com.example.altiora.demoAltiora.module.client.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.altiora.demoAltiora.module.order.entity.Order;
import com.example.altiora.demoAltiora.util.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "client")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Client extends BaseEntity {
	
	@Column(name = "nameClient", nullable = false)
	private String nameClient;
	
	@Column(name = "lastNameClient", nullable = false)
	private String lastNameClient;
	
	@JsonManagedReference("ClientOrder")
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<>();

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getLastNameClient() {
		return lastNameClient;
	}

	public void setLastNameClient(String lastNameClient) {
		this.lastNameClient = lastNameClient;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

}
