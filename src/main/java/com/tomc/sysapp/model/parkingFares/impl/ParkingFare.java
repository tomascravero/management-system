package com.tomc.sysapp.model.parkingFares.impl;

import com.tomc.sysapp.model.parkingFares.ParkingFareTypeEnum;
import com.tomc.sysapp.model.vehicle.CarTypeEnum;

public class ParkingFare {

	private ParkingFareTypeEnum fareType;
	private CarTypeEnum carType;
	private long fare;

	public ParkingFare(ParkingFareTypeEnum fareType, CarTypeEnum carType, long fare) {
		this.fareType = fareType;
		this.carType = carType;
		this.fare = fare;
	}

}
