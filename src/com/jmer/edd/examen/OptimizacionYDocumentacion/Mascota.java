package com.jmer.edd.examen.OptimizacionYDocumentacion;

/**
 * MOdela una super clase mascota, de aqui heredarán los animales que creemos.
 * 
 * @author José Miguel Escribano Ruiz
 *
 */
public class Mascota {

	/**
	 * Nombre del animal.
	 */
	protected String name;

	/**
	 * Modela un objeto mascota
	 */
	public Mascota() {
		super();
	}

	/**
	 * Asigna un nuevo nombre
	 * 
	 * @param name
	 */
	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve el nuevo nombre
	 * 
	 * @return nombre del animal
	 */
	public String getName() {
		return name;
	}

}