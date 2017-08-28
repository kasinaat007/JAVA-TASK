package com.kasinaat007.stock;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ITEM_TAB")
public class Item {
	@Id
	@Column(name = "ITEM_ID")
	@GeneratedValue
	private Integer id;
	@Column(name = "ITEM_NAME")
	private String itemName;
	@Column(name = "ITEM_PRICE")
	private Double itemPrice;
	@Column(name = "ITEM_STOCK")
	private Integer Stock;
	@Column(name = "MANF_DATE")
	@Temporal(TemporalType.DATE)
	private Date manufacturingDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public String toString() {
		return "id =" + id + "\nitemName=" + itemName + "\nitemPrice=" + itemPrice + "\nStock=" + Stock
				+ "\nmanufacturingDate=" + manufacturingDate;
	}
}
