package com.example.betatest.model.parking;

import java.util.Optional;

import com.example.betatest.model.cars.impl.Car;
import com.example.betatest.model.floors.impl.Floor;
import com.example.betatest.model.tickets.impl.Ticket;

public interface IParking {

	/**
	 * Obtiene el estado del Parking.
	 * 
	 * @return boolean 
	 * 		TRUE - available
	 * 		FALSE - occupied		
	 */
	public boolean isParkingAvailable();

	/**
	 * Obtiene el objeto Car relacionado al Parking.
	 * 
	 * @return Instanceof Car
	 */
	public Car getParkingCar();

	/**
	 * Obtiene el objeto Floor (piso) al que pertenece el Parking.
	 * 
	 * @return Instanceof Floor
	 */
	public Floor getParkingFloor();
	
	/**
	 * Retorna el ticket generado de la reserva. 
	 * 
	 * @return Optional<Ticket>
	 */
	public Optional<Ticket> getParkingTicket();

}
