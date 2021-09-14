package com.tomc.sysapp.model.tickets;

import java.math.BigDecimal;

public interface ITickets {
	
	/**
	 * Calcula la tarifa (fare) en base al tiempo de reserva del parking.
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal calculateFare();

}
