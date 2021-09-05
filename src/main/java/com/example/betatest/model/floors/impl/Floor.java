package com.example.betatest.model.floors.impl;

import java.util.List;

import com.example.betatest.model.branches.impl.Branch;
import com.example.betatest.model.floors.IFloor;
import com.example.betatest.model.parking.impl.Parking;

public class Floor implements IFloor {

	private int totalParkings;
	private List<Parking> occupiedParkings;
	private List<Parking> availableParkings;
	private Branch branch;

	@Override
	public List<Parking> getAvailableParkings() {
		return availableParkings;
	}

	@Override
	public List<Parking> getOccupiedParkings() {
		return occupiedParkings;
	}

	@Override
	public Branch getBranch() {
		return branch;
	}

}
