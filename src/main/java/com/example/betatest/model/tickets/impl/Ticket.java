package com.example.betatest.model.tickets.impl;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.betatest.model.branches.impl.Branch;
import com.example.betatest.model.cars.impl.Car;
import com.example.betatest.model.floors.impl.Floor;
import com.example.betatest.model.parking.impl.Parking;
import com.example.betatest.model.parkingFares.impl.ParkingFare;
import com.example.betatest.model.tickets.ITickets;
import com.example.betatest.model.tickets.TicketStatusEnum;
import com.example.betatest.model.users.impl.User;
import com.example.betatest.model.employee.impl.Employee;

@Entity
public class Ticket implements ITickets {

	@Id
	private Long ticketId;
	private LocalDate localDate;
	private Car car;
	private Parking parking;
	private Floor floor;
	private Branch branch;
	private Employee employee;
	private ParkingFare parkingFare;
	private BigDecimal price;
	private TicketStatusEnum ticketStatus;

	public Ticket(Car car, Parking parking) {
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
