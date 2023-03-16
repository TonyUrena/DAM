package ejemplos;

public class CodigoParaRefactorizar{

	public double calculoIva(double precioBase) {
		return precioBase + (0.21 * precioBase);//el IVA cambia?
		//Con el valor 0.21, extraer una constante
	}

	public int diasMes(int mes, int anio) {

		int diasMes = 0;

		switch (mes) {

			case 1:
	
			case 3:
	
			case 5:
	
			case 7:
	
			case 8:
	
			case 10:
	
			case 12:
				diasMes = 31;
				break;
	
			case 4:
	
			case 6:
	
			case 9:
	
			case 11:
				diasMes = 30;
				break;
	
			case 2:
				if (
						(anio % 400 == 0) ||((anio % 4 == 0) && (anio % 100 != 0))  //esto se entiende?
					) 
					//Selecciona toda la condición y extraela a un metodo, ponle un nombre apropiado
	
					diasMes = 29;
	
				else
					diasMes = 28;
	
				break;
	
		}

		return diasMes;

	}
	
	
	public double subidaPrecio(double precioBase, double subida) {
		precioBase = precioBase+subida;
		double precioConIVA = calculoIva(precioBase);
		System.out.println("El nuevo precio base es "+precioBase);
		System.out.println("El precio con IVA es "+precioConIVA);
		//Extraemos las salidas por consola?
		//Selecciona todas las lineas de salida por consolay extraelas a un metodo, ponle un nombre apropiado
		return precioBase;
	}
}
