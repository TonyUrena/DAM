import java.util.Random;
import java.util.Scanner;

public class StarWars {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        String textoInicio, textoNivel1, textoNivel2,
        textoNivel3, textoNivel4, textoNivel5, textoGanar,
        textoPerder;

        Random random = new Random();
        int numeroS1, numeroS2, sumatorioS1S2 = 0, solucionNivel1;
        int numeroP1, numeroP2, productorioP1P2 = 1, solucionNivel2 ;

        // Inicialización de textos
        textoInicio = "=== STAR WARS CÓDIGOS SECRETOS ===\n Hace mucho tiempo, en una galaxia muy, muy lejana … La Princesa Leia, LukeSkywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio está construyendo para destruirla. (Presiona Intro para continuar)";
        textoNivel1 = "Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el computador tiene problemas para calcular parte de las coordenadas de salto. Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie. Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n ¿Qué debe introducir?";
        textoNivel2 = "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte. Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh … tenemos un fallo en el … eh … condensador de fluzo... Solicitamos permiso para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde “Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta. El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive). ¿Cuál es el código?";
        textoNivel3 = "Nivel 3";
        textoNivel4 = "Nivel 4";
        textoNivel5 = "Nivel 5";
        textoGanar  = "muy bien toma un azucarillo";
        textoPerder = "jaja mamaste";

        // Inicialización de variables para problemas matemáticos
        // Inic. Variables Nivel 1
        numeroS1 = random.nextInt((10 - 1) + 1) + 1;
        numeroS2 = random.nextInt((30 - 20) + 1) + 20;
        for (int i = numeroS1; i <= numeroS2; i++) {
            sumatorioS1S2 = sumatorioS1S2 + i;
            // Debug muestra el sumatorio paso a paso
            System.out.println(sumatorioS1S2);
        }

        // Inic. Variables Nivel 2
        numeroP1 = random.nextInt((7 - 1) + 1) + 1;
        numeroP2 = random.nextInt((12 - 8) + 1) + 12;
        for (int i = numeroP1; i <= numeroP2; i++) {
            productorioP1P2 = productorioP1P2 * i;
            // Debug muestra el sumatorio paso a paso
            System.out.println(productorioP1P2);
        }

        // Inic. Variables Nivel 3


        // Inic. Variables Nivel 4


        // Inic. Variables Nivel 5

        
    /////
    // INICIO
    //////////////

        System.out.println(textoInicio);
        // TODO Leer tecla intro, por el momento salta automático al nivel1

    /////
    // Nivel 1
    /////////////

        System.out.println(textoNivel1);
        // Debug muestra numeros aleatorio sumatorio
        System.out.println(numeroS1 + "-" + numeroS2 + " Sumatorio = " + sumatorioS1S2);

        solucionNivel1 = reader.nextInt();
        
        if (solucionNivel1 != sumatorioS1S2) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 2
    /////////////

        System.out.println(textoNivel2);
        // Debug muestra numeros aleatorios productorio
        System.out.println(numeroP1 + "-" + numeroP2 + " Productorio = " + productorioP1P2);

        solucionNivel2 = reader.nextInt();

        if (solucionNivel2 != productorioP1P2) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 3
    /////////////

        System.out.println("Nivel3");

        if (false) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 4
    /////////////

        System.out.println("Nivel4");

        if (false) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 5
    /////////////

        System.out.println("Nivel5");

        if (false) {
            System.out.println(textoPerder);
        } else {

        }}}}}
    }
}
