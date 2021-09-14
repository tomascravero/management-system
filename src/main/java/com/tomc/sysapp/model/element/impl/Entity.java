package com.tomc.sysapp.model.element.impl;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;

/**
 * Modelo genérico para la implementación de entidades de aplicación.
 * 
 * @implNote no debería utilizarse aún
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
