package com.tomc.sysapp.model.parking;

import java.util.Optional;

import com.tomc.sysapp.model.floors.impl.Floor;
import com.tomc.sysapp.model.tickets.impl.Ticket;
import com.tomc.sysapp.model.vehicle.impl.Vehicle;

public interface IParking {

	/**
	 * Obtiene el estado del Parking.
	 * 
	 * @return boolean TRUE - available FALSE - occupied
	 */
	public boolean isParkingAvailable();

	/**
	 * Obtiene el objeto Car relacionado al Parking.
	 * 
	 * @return Instanceof Car
	 */
	public Vehicle getParkingCar();

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
