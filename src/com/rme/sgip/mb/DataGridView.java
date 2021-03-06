package com.rme.sgip.mb;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.rme.sgip.model.Car;
import com.rme.sgip.service.CarService;

@ManagedBean(name = "dataGridView")
@ViewScoped
public class DataGridView implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Car> cars;

	private Car selectedCar;

	@ManagedProperty("#{carService}")
	private CarService service;

	@PostConstruct
	public void init() {
		cars = service.createCars(48);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setService(CarService service) {
		this.service = service;
	}

	public Car getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(Car selectedCar) {
		this.selectedCar = selectedCar;
	}
}
