package com.tomc.sysapp.model.parkingFares.impl;

import java.math.BigDecimal;

import com.tomc.sysapp.model.parkingFares.ParkingFareTypeEnum;
import com.tomc.sysapp.model.vehicle.CarTypeEnum;

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
