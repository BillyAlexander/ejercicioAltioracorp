package com.example.altiora.demoAltiora.module.item.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.altiora.demoAltiora.util.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "item")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Item extends BaseEntity {
	@Column(name = "nameItem", nullable = false)
	private String nameItem;

	@Column(name = "priceItem", nullable = false)
	private Double priceItem;
	
	/*@JsonBackReference("OrderItem")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "orderId", foreignKey = @ForeignKey(name = "fk_item_order"))
	private Order order;*/

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public Double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(Double priceItem) {
		this.priceItem = priceItem;
	}

	/*public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}*/
	

}
