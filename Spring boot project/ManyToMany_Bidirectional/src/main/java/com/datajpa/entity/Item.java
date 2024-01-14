package com.datajpa.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String item_name;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy="items")
	private Set<Customer> customers = new HashSet<>(); 
	
	

	public Item() {
		super();
	}

	public Item(String item_name) {
		super();
		this.item_name = item_name;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
	
	
}
