package com.tomc.sysapp.model.parking.impl;

import java.util.Optional;

import com.tomc.sysapp.model.element.impl.Entity;
import com.tomc.sysapp.model.floors.impl.Floor;
import com.tomc.sysapp.model.parking.IParking;
import com.tomc.sysapp.model.tickets.impl.Ticket;
import com.tomc.sysapp.model.vehicle.impl.Vehicle;

public class Parking extends Entity implements IParking {

	private Vehicle car;
	private Floor floor;
	private Ticket ticket;
	private boolean available;

	public Parking(Floor floor) {
		this.floor = floor;
		// al crear un parking siempre debe estar disponible
		available = true;
	}

	@Override
	public boolean isParkingAvailable() {
		return available;
	}

	@Override
	public Vehicle getParkingCar() {
		return car;
	}

	@Override
	public Floor getParkingFloor() {
		return floor;
	}

	private void setParkingsStatus(Vehicle car) {
		this.car = car;
		available = !available;
		ticket = new Ticket(car, this);
	}

	@Override
	public Optional<Ticket> getParkingTicket() {
		return Optional.ofNullable(ticket);
	}

}
