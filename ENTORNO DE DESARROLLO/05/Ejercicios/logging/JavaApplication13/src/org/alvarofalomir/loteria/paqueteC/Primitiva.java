package org.alvarofalomir.loteria.paqueteC;

import java.io.IOException;

import org.alvarofalomir.loteria.paqueteB.ClaseAuxiliarLoteria;

public class Primitiva {

	public Primitiva() {
		// TODO Auto-generated constructor stub
	}

	public double juegaPrimitiva() throws IOException{//En este metodo de clase resolveremos el problema de la Primitiva   
		ClaseAuxiliarLoteria.borrar_pantalla();
		String fechacadena = ClaseAuxiliarLoteria.dia_del_sorteo(1).toString();
		// Seguimos con lo que pide el enunciado.
		System.out.println("Proximo Sorteo :" + fechacadena);  
		int NumerosPrimitiva;

		//inicializamos los numeros del array
		System.out.print("Apuesta: ");
		for (int i=0;i<=7;i++)
		{
			NumerosPrimitiva=(int) Math.floor(Math.random()*49 +1);
			if (i<6)
				System.out.print(Integer.toString(NumerosPrimitiva)+ " ");
			if (i==6) // Para el complementario
				System.out.println("\nComplementario:" +  Integer.toString(NumerosPrimitiva)+ " ");
			if (i==7)  
			{
				NumerosPrimitiva=(int) Math.floor(Math.random()*9 );
				System.out.print("Reintegro:" + Integer.toString(NumerosPrimitiva)+ " ");
			}
		}
		// Sumamos el coste de la apuesta
		ClaseAuxiliarLoteria.tecla_para_continuar();
		return 1;
		
	}

}
