package es.dam1.funciones.lib;

import org.apache.commons.lang3.StringUtils;

/* Esta clase contiene un único metodo que recibe como parametros de entrada un texto y un número
 * Devuelve el texto repetido el numero de veces que se le ha indicado.
 */
public class ClaseConLibreriasExternas {

	// Definición de la función repiteTexto
	public static String repiteTexto(String texto, int repeticiones) {
		
		// Se llama a la función repeat de la clase StringUtils,
		// esta clase pertenece a la libreria commons-lang3-3.12.0.jar
		String resultadoRepeticiones = StringUtils.repeat(texto, repeticiones);
		
		//devuelve el resultado de la llamada a la función repeat
		return resultadoRepeticiones; 
	}
}
