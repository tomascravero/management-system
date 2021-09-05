package com.example.betatest.model.floors;

import java.util.List;
import java.util.Map;

import com.example.betatest.model.branches.impl.Branch;
import com.example.betatest.model.cars.impl.Car;
import com.example.betatest.model.parking.impl.Parking;

public interface IFloor {

	/**
	 * Retorna la lista de Parkings disponibles.
	 * 
	 * @return List<Parking>
	 */
	public List<Parking> getAvailableParkings();

	/**
	 * Retorna la lista de Parkings ocupados.
	 * 
	 * @return List<Parking>
	 */
	public List<Parking> getOccupiedParkings();
	
	/**
	 * Retorna la sucursal a la cual pertenece la planta.
	 * 
	 * @return Branch
	 */
	public Branch getBranch();
}
