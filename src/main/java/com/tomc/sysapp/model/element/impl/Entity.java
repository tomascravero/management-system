package com.tomc.sysapp.model.element.impl;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;

/**
 * Modelo gen�rico para la implementaci�n de entidades de aplicaci�n.
 * 
 * @implNote no deber�a utilizarse a�n
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
