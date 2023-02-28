package org.alvarofalomir.loteria.paqueteC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.alvarofalomir.loteria.paqueteB.ClaseAuxiliarLoteria;

public class Quiniela {
	
	public Quiniela() {
		// TODO Auto-generated constructor stub
	}

	//En este metodo de clase resolveremos el problema de la Quiniela.
	public double juegaQuiniela() throws IOException
	{
		ClaseAuxiliarLoteria.borrar_pantalla();
		String fechacadena = ClaseAuxiliarLoteria.dia_del_sorteo(2).toString();		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int opcion=0;
		String texto="";
		char caracter;
		do
		{
			System.out.println("Proxima Jornada :" + fechacadena);  
			System.out.print("Cuantas apuestas quieres (2-8)?");
			texto=teclado.readLine();
			if (texto.isEmpty()) texto = "0";
			caracter= texto.charAt(0);
			opcion=caracter-48; // 48 es el valor ASCII de 0
			if (opcion<=1 || opcion>=9)
				System.out.println("Numero de apuestas incorrecto");
			System.out.println(caracter);
		}
		while (opcion<=1 || opcion>=9);

		int ApuestasX12;
		for(int i=0;i<opcion;i++)
		{
			System.out.print("Apuesta " + Integer.toString(i+1) + ":");
			for (int j=0;j<=14;j++)
			{
				ApuestasX12=(int) Math.floor(Math.random()*3+1 );
				if (ApuestasX12==1)
					System.out.print("1 ");
				if (ApuestasX12==2)
					System.out.print("X ");
				if (ApuestasX12==3)
					System.out.print("2 ");
			}
			System.out.println("");
		}
		//Calculamos las apuestas en funcion del numero de opciones introducido
		ClaseAuxiliarLoteria.tecla_para_continuar();
		return (0.5)*opcion;
	}
}
