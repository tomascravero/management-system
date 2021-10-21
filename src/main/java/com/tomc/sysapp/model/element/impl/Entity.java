package com.tomc.sysapp.model.element.impl;

import java.sql.Timestamp;

/**
 * Modelo generico para la implementacion de entidades de aplicacion.
 * 
 * @implNote no deberia utilizarse aun
 *
 */
public class Entity {

	private Long id;
	private Timestamp dateTime;
	private Timestamp createdAt;
	private Timestamp updatedAt;
//	private User modifiedBy;

	public Entity() {

	}

}
