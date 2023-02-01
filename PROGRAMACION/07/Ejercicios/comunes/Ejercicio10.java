public class Ejercicio10 {

    public static void main(String[] args) {

        int dia, mes, anyo;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce un día, mes y año");

        if(compruebaFecha(dia, mes, anyo)){
            System.out.println("La fecha introducida es correcta.");
        } else {
            System.out.println("La fecha introducida es incorrecta.");
        }
    }

    public static boolean compruebaFecha(int dia, int mes, int anyo){

        boolean fechaCorrecta;

        if(dia < 30 && mes <= 12 && anyo > 0){
            fechaCorrecta = true;
        } else {
            fechaCorrecta = false;
        }

        return fechaCorrecta;

    }
    
}
