package paquete;


/** Un comentario de clase
 * * Puedes ver que admite <b>etiquetas HTML</b>
 * el comentario no puede continuar despues de la seccion de etiquetas
 *  @deprecated "version anterior" {@link #concatena(String, String, String) otraversion}
 *  @author Maria
 *  @see "Concatenacion de cadenas en Java. Esto muestra solo un string no un enlace"
 *  @see <a href="https://lefunes.wordpress.com/2008/05/08/concatenacion-de-cadenas-en-java-optimizaciones-realizadas-por-el-compilador/#section">Mas informacion concatenacion</a>
 *  @version version1
 *  
 *  @since JDK1.1
 *   
 *    
 *    
 */	
public class ComentariosVarios {
	
	/** comento la variable cadena */
	public String cadena;
	/**
	 * Tiene un metodo concatena con los siguientes parametros
	 *
	 * @param s1 the s 1
	 * @param s2 the s 2
	 * @param s3 the s 3
	 * @return devuelve la concatenciacion de los tres parametros de entrada
	 */
	public String concatena (String s1, String s2, String s3)
	{
		/** este comentario no generara documentacion, esta
                 * dentro del metodo*/
		
		
		
		return s1+s2+s3;
		
	}

}