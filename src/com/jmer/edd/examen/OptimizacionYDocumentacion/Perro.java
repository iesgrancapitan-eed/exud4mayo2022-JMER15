package com.jmer.edd.examen.OptimizacionYDocumentacion;

/**
 * <p>Modela una clase Perro cuyo estado es nombre y edad.
 * Su comportamiento es ladrar. Hereda todo su estado y comportamiento de la clase Mascota.</p>
 * 
 * @author José Miguel Escribano Ruiz
 *
 */
public class Perro extends Mascota {
	
	/**
	 * Ladrido del perro.
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	
	/**
	 * edad del perro
	 */
	private int age;
	
	/**
	 * Modela un perro que hereda con nombre y edad.
	 * 
	 * @param name	nombre del perro.
	 * @param age   edad del perro
	 * @throws EdadErroneaException si la edas es menor de 0.
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	/**
	 * Asigna una nueva edad al perro.
	 * 
	 * @param age	nueva edad.
	 * @throws EdadErroneaException si la edad es menor de 0.
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	/**
	 * Devuelve la edad
	 * 
	 * @return edad
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Comportamiento del perro
	 * 
	 * @return ladrido
	 */
	public String ladrar() {
		return Perro.GUAUUUUUUUUUU;
	}

}

