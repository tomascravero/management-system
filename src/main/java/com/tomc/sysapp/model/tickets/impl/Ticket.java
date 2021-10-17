package com.tomc.sysapp.model.tickets.impl;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.tomc.sysapp.model.branches.impl.Branch;
import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.model.floors.impl.Floor;
import com.tomc.sysapp.model.parking.impl.Parking;
import com.tomc.sysapp.model.parkingFares.impl.ParkingFare;
import com.tomc.sysapp.model.tickets.ITickets;
import com.tomc.sysapp.model.tickets.TicketStatusEnum;
import com.tomc.sysapp.model.users.impl.User;
import com.tomc.sysapp.model.vehicle.impl.Vehicle;

public class Ticket implements ITickets {

	private Long ticketId;
	private LocalDate localDate;
	private Vehicle car;
	private Parking parking;
	private Floor floor;
	private Branch branch;
	private Employee employee;
	private ParkingFare parkingFare;
	private BigDecimal price;
	private TicketStatusEnum ticketStatus;

	public Ticket(Vehicle car, Parking parking) {
		this.localDate = LocalDate.now();
		this.car = car;
		this.floor = parking.getParkingFloor();
		this.branch = this.floor.getBranch();
		this.employee = this.branch.getEmployee();
		this.ticketStatus = TicketStatusEnum.RESERVED_TICKET;
	}

	@Override
	public BigDecimal calculateFare() {
		return price;
	}
}
