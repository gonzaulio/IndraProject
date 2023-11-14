package com.indra.technicalTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * DTO of the 'Price' entity of the BBDD.
 */

@Entity
@Table(name = "prices")
public class Price {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String startDate;
    private String endDate;
    private Integer priceList;
    private Integer productId;
    private Integer priority;
    private Double price;
    private String currency;
    private Integer brandId;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Integer getPriceList() {
		return priceList;
	}
	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	

}
