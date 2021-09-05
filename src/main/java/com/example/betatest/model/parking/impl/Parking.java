package com.example.betatest.model.parking.impl;

import java.util.Optional;

import com.example.betatest.model.cars.impl.Car;
import com.example.betatest.model.floors.impl.Floor;
import com.example.betatest.model.parking.IParking;
import com.example.betatest.model.tickets.impl.Ticket;

public class Parking implements IParking {

	private Car car;
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
	public Car getParkingCar() {
		return car;
	}

	@Override
	public Floor getParkingFloor() {
		return floor;
	}

	private void setParkingsStatus(Car car) {
		this.car = car;
		available = !available;
		ticket = new Ticket(car, this);
	}

	@Override
	public Optional<Ticket> getParkingTicket() {
		return Optional.ofNullable(ticket);
	}

}
