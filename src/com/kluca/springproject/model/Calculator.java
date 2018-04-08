package com.kluca.springproject.model;

import javax.validation.constraints.NotNull;

public class Calculator {

	@NotNull(message="is required")
	private Integer amount;
	
	@NotNull(message="is required")
	private Double interest;
	
	@NotNull(message="is required")
	private Integer years;

	private Double yield;
	
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Double getYield() {
		setYield(Math.pow(1+interest, years)*amount);
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}		
	
}
