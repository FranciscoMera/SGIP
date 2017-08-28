package com.rme.sgip.model;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String randomBrand;
	private Integer randomYear;
	private String randomColor;
	private Integer randomPrice;
	private Boolean RandomSoldState;

	public Car() {

	}

	public Car(String id, String randomBrand, Integer randomYear, String randomColor, Integer randomPrice,
			Boolean randomSoldState) {
		super();
		this.id = id;
		this.randomBrand = randomBrand;
		this.randomYear = randomYear;
		this.randomColor = randomColor;
		this.randomPrice = randomPrice;
		RandomSoldState = randomSoldState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRandomBrand() {
		return randomBrand;
	}

	public void setRandomBrand(String randomBrand) {
		this.randomBrand = randomBrand;
	}

	public Integer getRandomYear() {
		return randomYear;
	}

	public void setRandomYear(Integer randomYear) {
		this.randomYear = randomYear;
	}

	public String getRandomColor() {
		return randomColor;
	}

	public void setRandomColor(String randomColor) {
		this.randomColor = randomColor;
	}

	public Integer getRandomPrice() {
		return randomPrice;
	}

	public void setRandomPrice(Integer randomPrice) {
		this.randomPrice = randomPrice;
	}

	public Boolean getRandomSoldState() {
		return RandomSoldState;
	}

	public void setRandomSoldState(Boolean randomSoldState) {
		RandomSoldState = randomSoldState;
	}

	@Override
	public String toString() {
		return "Car [randomId=" + id + ", randomBrand=" + randomBrand + ", randomYear=" + randomYear
				+ ", randomColor=" + randomColor + ", randomPrice=" + randomPrice + ", RandomSoldState="
				+ RandomSoldState + "]";
	}

}
