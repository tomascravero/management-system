package com.tomc.sysapp.model.tickets;

public interface ITickets {

	/**
	 * Calcula la tarifa (fare) en base al tiempo de reserva del parking.
	 * 
	 * @return BigDecimal
	 */
	public long calculateFare();

}
