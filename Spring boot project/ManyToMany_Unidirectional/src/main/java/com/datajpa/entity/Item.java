package com.datajpa.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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


	public Item(String item_name) {
		super();
		this.item_name = item_name;
	}
	
	
}
