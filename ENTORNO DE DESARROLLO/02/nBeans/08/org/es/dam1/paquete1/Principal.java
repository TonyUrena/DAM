package es.dam1.paquete1;

import java.time.LocalDate;

import es.dam1.funciones.lib.ClaseConLibreriasExternas;

public class Principal {

	public static void main(String[] args) {

		//Variable que almacena un texto
		String cadenaTexto = "telefono-";
		
		// Llamada a la función repiteTexto que se encuentra definida en la clase ClaseConLibreriasExternas
		// El resultado se almacena en la variable cadenaRepetida
		String cadenaRepetida = ClaseConLibreriasExternas.repiteTexto(cadenaTexto, 5);
		
		//Se muestra por pantalla el resultado de la función repiteTexto
		System.out.println("Texto repetido = "+cadenaRepetida);
		
		// Se llama a la función now() de la clase Localdate,
		// esta clase pertenece a la libreria joda-time-2.0.jar
		System.out.println("La fecha de hoy = "+LocalDate.now());
	}

}
