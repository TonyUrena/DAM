package paquete;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Money {
	private double cantidad;
	private String moneda;
	
	/**
	 * Constructor predefinido de la clase, inicializa los valores de la clase a 0
	 * si no se le proporcionan parámetros
	 */
	public Money (){
		this.cantidad=0;
		this.moneda="";
	}

	/**
	 * Constructor de Money.
	 * 
	 * @param cantidad cantidad
	 * @param moneda moneda
	 * 
	 */
	public Money(double cantidad, String moneda) {
		this.cantidad = cantidad;
		this.moneda = moneda;
	}
	/**
	 * Devuelve cantidad
	 * @return devuelve double cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}
	
	/**
	 * Devuelve moneda
	 * @return devuelve String moneda
	 */
	public String getMoneda() {
		return moneda;
	}
	
	/**
	 * asigna cantidad
	 * 
	 * @param cantidad cantidad
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * asigna moneda
	 * 
	 * @param moneda moneda
	 */
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	/**
	 * Si el valor moneda del objeto es igual al valor de moneda que 
	 * recibe como parametro, entonces instancia y devuelve un objeto nuevo
	 * pasandole la suma de cantidad de este objeto y la del objeto que le pasamos
	 * como parametro y moneda de este objeto. 
	 * Si no, llama a a exchange
	 * 
	 * @return Devuelve un objeto tipo moneda
	 * 
	 * @see exchange
	 */
	public Money add(Money m){
		Money aux;
		if (this.getMoneda().equals(m.getMoneda()))
			return new Money(this.cantidad+m.getCantidad(),this.getMoneda());
		else{
			aux = exchange(m, this.getMoneda());
			return new Money(this.getCantidad()+aux.getCantidad(),this.getMoneda());
		}
	}
	
	/**
	 * Devuelve un nuevo objeto de tipo money con el parámetro cantidad multiplicado
	 * por el atributo cantidad del objeto que recibe como parametro.
	 * 
	 * @return la multipliacion de moneda con el parametro
	 * 
	 * @param m objeto de tipo money
	 */
	public Money multiply(Money m){
		return new Money(this.cantidad*m.getCantidad(),this.getMoneda());
	}
	
	/**
	 * Calcula el cambio entre monedas. Recibe un objeto de tipo Money
	 * y calcula su cambio respecto al tipo de moneda que recibe como
	 * segundo parametro
	 * 
	 * @return Un objeto tipo moneda con el cambio realizado respecto al tipo
	 * de moneda que se ha pasado.
	 * 
	 * @param m Objeto tipo Money a intercambiar
	 * @param moneda String que determina que tipo de moneda necesitamos como cambio
	 */
	public static Money exchange(Money m, String moneda){
		Money resul = new Money();
		double cantidad=0;
		BigDecimal bd;
		if (m.getMoneda().equals(moneda))
			return m;
		
		if (m.getMoneda().equals("EUR") && moneda.equals("USD")){
			cantidad=m.getCantidad()*1.14;
		}
		else if (m.getMoneda().equals("USD") && moneda.equals("EUR")){
			cantidad= m.getCantidad()/1.14;	
		}
		
		bd = new BigDecimal(cantidad);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		resul.setCantidad(bd.doubleValue());
		resul.setMoneda(moneda);
		return resul;
	}

	/**
	 * Compara el objeto money con otro objeto money y devuelve true si son iguales
	 * en valor y tipo.
	 * 
	 * @return true si la cantidad y el tipo son exactamente iguales, false si
	 * uno de los dos no lo es.
	 * 
	 * @param o Objeto a comparar.
	 */
	@Override
	public boolean equals(Object o){
		if (this==o)
			return true;
		
		if (o instanceof Money){
			Money m = (Money)o;
			if ((this.getCantidad()==m.getCantidad() && (this.getMoneda().equals(m.getMoneda()))))
					return true;
		}
		return false;
	}
}