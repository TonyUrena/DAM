package modelo;

import java.util.NoSuchElementException;

/**
 * Una clase que hace cosas con un array de enteros
 * 
 * @author Alguien
 * @version 1.0
 */

public class ArrayEnteros {
	
	private Integer array[];

	/**
	 * Constructor del array de enteros
	 * 
	 * @param	a El array de enteros 
	 * @return	un array de enteros
	 * @exception IllegalArgumentException si no hay elementos
	 * @see java.lang.Array
	 */
	public ArrayEnteros(Integer[] a) {
		if ((a==null) || (a.length==0))
			throw new IllegalArgumentException("No hay elementos");
		this.array = a;
	}
	
	/**
	 * Suma todos los valores del array devuelve la suma en int
	 * 
	 * @return un entero con la suma de todos los valores
	 */
	public int sumaArray(){
		int suma=0;
		
		for(Integer a:array)
			suma=suma+a;
		
		return suma;
	}
	
	/**
	 * Comprueba cual es el mayor valor dentro de los analizados 
	 * 
	 * @return un entero con el valor máximo del array
	 */
	public int mayorArray(){
		int max=array[0];
		for (Integer a:array){
			if (a>max)
				max=a;
		}
		
		return max;
	}
	
	/**
	 * Comprubea en que posición se encuentra el valor
	 * 
	 * @param n número a buscar en el array
	 * @return la posición del array
	 * @exception NoSuchElementException si no encuentra el elemento
	 * 
	 */
	public int posicionArray(int n){
		
		for (int i=0;i<array.length;i++){
			if(n==array[i])
				return i;
		}
		throw new NoSuchElementException("El elemento no se ha encontrado");
	}

}
