/*
 * TONY UREÑA FORTUÑO
 */

import java.util.Scanner;

public class StarWars {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        String textoNivel1, textoNivel2, textoNivel3,
        textoNivel4, textoNivel5, textoTeclaIntro,
        textoInicio, textoGanar, textoPerder, textoFin,
        borrarTerminal;

        String teclaIntro = "a";
        int numeroS1, numeroS2, sumatorioS1S2 = 0, solucionNivel1;
        int numeroP1, numeroP2, productorioP1P2 = 1, solucionNivel2 ;
        int numeroN, factorialN10 = 1, solucionNivel3;
        int numeroP, numeroPEsPrimo = 0, solucionNivel4; boolean divisibleOtro = false;
        int numeroMinutos, numeroSegundos, factorialM = 1, factorialS = 1, sumaFactoriales, solucionNivel5;

        // Inicialización de variables para problemas matemáticos
        // Inic. Variables Nivel 1

        numeroS1 = (int)(1 + Math.random() * (10 - 1 + 1));
        numeroS2 = (int)(20 + Math.random() * (30 - 20 + 1));
        
        for (int i = numeroS1; i <= numeroS2; i++) {
            sumatorioS1S2 = sumatorioS1S2 + i;
            // Debug muestra el sumatorio paso a paso
            //System.out.println(sumatorioS1S2);
        }

        // Inic. Variables Nivel 2
        numeroP1 = (int)(1 + Math.random() * (7 - 1 + 1));
        numeroP2 = (int)(8 + Math.random() * (12 - 8 + 1));

        for (int i = numeroP1; i <= numeroP2; i++) {
            productorioP1P2 = productorioP1P2 * i;
            // Debug muestra el sumatorio paso a paso
            //System.out.println(productorioP1P2);
        }

        // Inic. Variables Nivel 3
        numeroN = (int)(50 + Math.random() * (100 - 50 + 1));
        numeroN = (int)Math.floor(numeroN / 10);

        for (int i = 1; i <= numeroN; i++) {
            
            factorialN10 = factorialN10 * i;
            // Debug muestra el factorial paso a paso
            //System.out.println(factorialN10);
            
        }

        // Inic. Variables Nivel 4
        numeroP = (int)(10 + Math.random() * (100 - 10 + 1));
        
        for (int i = numeroP; i > 1; i--) {

            if (numeroP % i == 0 && numeroP != i){
                divisibleOtro = true;
            }

        }

        if (divisibleOtro){
            numeroPEsPrimo = 0;
        } else {
            numeroPEsPrimo = 1;
        }

            // Debug muestra el numero y si es primo
            //System.out.println("El número " + numeroP + "es primo? " + numeroPEsPrimo);


        // Inic. Variables Nivel 5
        
        numeroMinutos  = (int)(5 + Math.random() * (10 - 5 + 1));
        numeroSegundos = (int)(5 + Math.random() * (10 - 5 + 1));
        
        for (int i = 1; i <= numeroMinutos; i++) {
            
            factorialM = factorialM * i;
            // Debug muestra el factorial paso a paso
            //System.out.println(factorialM);
            
        }

        for (int i = 1; i <= numeroSegundos; i++) {
            
            factorialS = factorialS * i;
            // Debug muestra el factorial paso a paso
            //System.out.println(factorialS);
            
        }
        sumaFactoriales = factorialM + factorialS;


        // Inicialización de textos
        // \033[H\033[2J es el código ANSI para borrar la pantalla del terminal.
        borrarTerminal = "\f";
        textoInicio = "=== STAR WARS CÓDIGOS SECRETOS ===\n\nHace mucho tiempo, en una galaxia muy, muy lejana…\n\nLa Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\nen una nave imperial robada en una misión secreta para infiltrarse en otra\nestrella de la muerte que el imperio está construyendo para destruirla.\n\n(Presiona Intro para continuar)";
        textoTeclaIntro = "La princesa Leia te dirige una mirada de reojo. Saca un cuaderno y un\nbolígrafo de un bolsillo oculto en su toga intergaláctica y escribe una nota:\n\n    Requisitos para próximos agentes:\n       -Nivel de matemáticas: 4º ESO\n       -Nivel de comprensión lectora: 2º Parvulario.\n\nCierra su bloc de notas y lo guarda junto al bolígrafo. Te mira fijamente y repite:\n\n(Presiona Intro para continuar)";
        textoNivel1 = "Los problemas empiezan cuando deben realizar un salto hiperespacial hasta\nel sistema " + numeroS1 + " en el sector " + numeroS2 +", pero el sistema de navegación está estropeado\ny el computador tiene problemas para calcular parte de las coordenadas de salto.\n\nChewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n\nRecuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\ncalcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n\n¿Qué debe introducir?\n";
        textoNivel2 = "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos\nla estrella de la muerte.\n\nComo van en una nave imperial robada se aproximan lentamente con la intención\nde pasar desapercibidos.\n\nDe repente suena el comunicador: “Aquí agente de espaciopuerto " + numeroP1 + " contactando\ncon nave imperial " + numeroP2 + ". No están destinados en este sector. ¿Qué hacen aquí?”.\n\nHan Solo coge el comunicador e improvisa. “Eh… tenemos un fallo en el… eh…\ncondensador de fluzo... Solicitamos permiso para atracar y reparar la nave”.\n\nEl agente, que no se anda con tonterías, responde “Proporcione código de\nacceso o abriremos fuego”.\n\nHan Solo ojea rápidamente el manual del piloto que estaba en la guantera\ny da con la página correcta. El código es el productorio entre el nº del\nagente y el nº de la nave (ambos inclusive).\n\n¿Cuál es el código?\n";
        textoNivel3 = "Han Solo proporciona el código correcto.\n\nAtracan en la estrella de la muerte, se equipan con trajes de soldados\nimperiales que encuentran en la nave para pasar desapercibidos y bajan.\n\nAhora deben averiguar en qué nivel de los " + numeroN + " existentes se encuentra el\nreactor principal.\n\nSe dirigen al primer panel computerizado que encuentran y la Princesa Leia\nintenta acceder a los planos de la nave pero necesita introducir una clave\nde acceso.\n\nEntonces recuerda la información que le proporcionó Cando Falrissian\n“La clave de acceso a los planos de la nave es el factorial de N/10\n(redondeando N hacia abajo), donde N es el nº de niveles”.\n\n¿Cual es el nivel correcto?\n";
        textoNivel4 = "Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la\npuerta acorazada que da al reactor principal. R2D2 se conecta al panel de\nacceso para intentar hackear el sistema y abrir la puerta.\n\nPara desencriptar la clave necesita verificar si el número " + numeroP + " es primo o no.\n\nSi es primo introduce un 1, si no lo es introduce un 0.\n";
        textoNivel5 = "Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque\nla bomba, programe el temporizador y salir de allí corriendo.\n\nNecesita programarlo para que explote en exactamente " + numeroMinutos + " minutos y " + numeroSegundos + " segundos,\nel tiempo suficiente para escapar antes de que explote pero sin que el sistema\nde seguridad anti-explosivos detecte y desactive la bomba.\n\nPero el temporizador utiliza un reloj Zordgiano un tanto peculiar.\n\nPara convertir los minutos y segundos al sistema Zordgiano hay que sumar el\nfactorial de " + numeroMinutos + " y el factorial de " + numeroSegundos + ".\n\n¿Qué valor debe introducir?\n";
        textoGanar  = "Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan\na sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder.\n\nLa nave se convierte en un hervidero de soldados de arriba a abajo y entre el\ncaos que les rodea consiguen llegar a la nave y salir de allí a toda prisa.\n\nA medida que se alejan observan por la ventana la imagen de la colosal estrella\nde la muerte explotando en el silencio del espacio, desapareciendo para siempre\njunto a los restos del malvado imperio.\n\n¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n\nEnhorabuena ;D";
        textoPerder = "Ese no era el código correcto...\n\nLa misión ha sido un fracaso... :( :( :(\n\nTodavía no eres un Maestro Jedi de las Matemáticas.\n\n¡Vuelve a intentarlo!";
        textoFin    = "Gracias por jugar :D\n\n";

    /////
    // INICIO
    //////////////

    System.out.print(borrarTerminal);
    System.out.println(textoInicio);

    while (!teclaIntro.equals("")){

        teclaIntro = reader.nextLine();

        if (!teclaIntro.equals("")){

            System.out.println(textoTeclaIntro);

        }

    };

    /////
    // Nivel 1
    /////////////

        System.out.print(borrarTerminal);
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

        System.out.print(borrarTerminal);
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
        
        System.out.print(borrarTerminal);
        System.out.println(textoNivel3);
        // Debug muestra numero aletorio / 10 factorial
        System.out.println("Factorial de " + numeroN + ": " + factorialN10 );

        solucionNivel3 = reader.nextInt();

        if (solucionNivel3 != factorialN10) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 4
    /////////////

        System.out.print(borrarTerminal);
        System.out.println(textoNivel4);
        // Debug muestra si es primo
        System.out.println("El número " + numeroP + "es primo?: " + numeroPEsPrimo);

        solucionNivel4 = reader.nextInt();

        if (solucionNivel4 != numeroPEsPrimo) {
            System.out.println(textoPerder);
        } else {

    /////
    // Nivel 5
    /////////////

        System.out.print(borrarTerminal);
        System.out.println(textoNivel5);
        // Debug muestra la suma de los factoriales
        System.out.println("La suma de los factoriales es: " + sumaFactoriales);

        solucionNivel5 = reader.nextInt();

        if (solucionNivel5 != sumaFactoriales) {
            System.out.println(textoPerder);
        } else {

    /////
    // GANAR
    /////////////
        
        System.out.print(borrarTerminal);
        System.out.println(textoGanar);

        }}}}}

    /////
    // FIN
    /////////////
        
        System.out.print(borrarTerminal);
        System.out.println(textoFin);
    }
}
