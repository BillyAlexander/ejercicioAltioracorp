package com.example.altiora.demoAltiora.module.order.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.example.altiora.demoAltiora.module.client.entity.Client;
import com.example.altiora.demoAltiora.module.item.entity.Item;
import com.example.altiora.demoAltiora.util.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "orden")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Order extends BaseEntity {
	@Column(name = "dateOrder", nullable = false)
	private Date dateOrder;

	/*@JsonManagedReference("OrderItem")
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Item> items = new ArrayList<>();*/
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinTable(name = "order_item", joinColumns = @JoinColumn(name = "orden", foreignKey = @ForeignKey(name = "item_order_fk")), inverseJoinColumns = @JoinColumn(name = "item", foreignKey = @ForeignKey(name = "order_item_fk")), uniqueConstraints = {
			@UniqueConstraint(name = "order_item_uk", columnNames = { "orden", "item" }) })
	private List<Item> items = new ArrayList<>();
	
	@JsonBackReference("ClientOrder")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "clientId", foreignKey = @ForeignKey(name = "fk_order_client"))
	private Client client;
	
	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
