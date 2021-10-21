package com.tomc.sysapp.model.tickets.impl;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.tomc.sysapp.model.branches.impl.Branch;
import com.tomc.sysapp.model.employee.impl.Employee;
import com.tomc.sysapp.model.floors.impl.Floor;
import com.tomc.sysapp.model.parking.impl.Parking;
import com.tomc.sysapp.model.parkingFares.impl.ParkingFare;
import com.tomc.sysapp.model.tickets.ITickets;
import com.tomc.sysapp.model.tickets.TicketStatusEnum;
import com.tomc.sysapp.model.vehicle.impl.Vehicle;

public class Ticket implements ITickets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketId;
	@Column(name = "date")
	private LocalDate localDate;
	private Vehicle car;
	@Column(name = "parking")
	@ManyToOne(targetEntity = Parking.class, fetch = FetchType.LAZY)
	private Parking parking;
	@Column(name = "floor")
	@ManyToOne(targetEntity = Floor.class, fetch = FetchType.LAZY)
	private Floor floor;
	@Column(name = "branch")
	@ManyToOne(targetEntity = Branch.class, fetch = FetchType.LAZY)
	private Branch branch;
	@Column(name = "employee")
	@ManyToOne(targetEntity = Employee.class, fetch = FetchType.LAZY)
	private Employee employee;
	@Column(name = "parking_fare")
	@ManyToOne(targetEntity = ParkingFare.class, fetch = FetchType.LAZY)
	private ParkingFare parkingFare;
	@Column(name = "price")
	private long price;
	@Column(name = "ticket_status")
	@ManyToOne(targetEntity = TicketStatusEnum.class, fetch = FetchType.LAZY)
	private TicketStatusEnum ticketStatus;

	public Ticket(Vehicle car, Parking parking) {
		this.localDate = LocalDate.now();
		this.car = car;
		this.floor = parking.getParkingFloor();
		this.branch = this.floor.getBranch();
//		this.employee = this.branch.getEmployeebyId();
		this.ticketStatus = TicketStatusEnum.RESERVED_TICKET;
	}

	@Override
	public long calculateFare() {
		return price;
	}
}
