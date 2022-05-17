package com.jmer.edd.examen.OptimizacionYDocumentacion;

/**
 * Lanzada para indicar que la edad del perro es menor de 0.
 * 
 * @author José Miguel Escribano Ruiz
 *
 */
public class EdadErroneaException extends Exception {

	/**
	 * Serial Excepción.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una excepción EdadErroneaException con el mensaje detallado
	 * 
	 * @param messages	mensaje detallado.
	 */
	public EdadErroneaException(String messages) {
		super(messages);
	}
}
