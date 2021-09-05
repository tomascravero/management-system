package com.example.betatest.model.parkingFares.impl;

import java.math.BigDecimal;

import com.example.betatest.model.cars.CarTypeEnum;
import com.example.betatest.model.parkingFares.ParkingFareTypeEnum;

public class ParkingFare {

	private ParkingFareTypeEnum fareType;
	private CarTypeEnum carType;
	private BigDecimal fare;

	public ParkingFare(ParkingFareTypeEnum fareType, CarTypeEnum carType, BigDecimal fare) {
		this.fareType = fareType;
		this.carType = carType;
		this.fare = fare;
	}

}
