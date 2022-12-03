import java.util.Scanner;

/*
 *  Tony Ureña Fortuño
 */

public class EjercicioObligatorio4 {
    
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        int dia, mes, ano, diaIncrementado;
        boolean fechaCorrecta;

        System.out.println("Introduce el día: ");
        dia = reader.nextInt();
        System.out.println("Introduce el mes: ");
        mes = reader.nextInt();
        System.out.println("Introduce el año: ");
        ano = reader.nextInt();


        // Acumulamos el día y comprobamos si necesitamos saltar al mes siguiente
        // Utilizamos el mes como número del case para agrupar las operaciones de mes
        diaIncrementado = dia + 7;

        switch(mes){

            case 2:
                if  (dia > 28){
                    System.out.println("ERROR: Febrero no puede tener más de 28 días, vuelve a introducir los datos.\n");
                    fechaCorrecta = false;
                }else if (diaIncrementado < 28) {
                    dia = diaIncrementado;
                    fechaCorrecta = true;
                } else {
                    dia = diaIncrementado - 28;
                    mes++;
                    fechaCorrecta = true;
                }
            break;

            case 1: case 3: case 5: case 7: case 8: case 10:
                if (dia > 31 ){
                    System.out.println("ERROR: Este mes no puede tener más de 30 días, vuelve a introducir los datos.\n");
                    fechaCorrecta = false;
                } else if (diaIncrementado < 31) {
                    dia = diaIncrementado;
                    fechaCorrecta = true;
                } else {
                    dia = diaIncrementado - 31;
                    mes++;
                    fechaCorrecta = true;
                }
            break;

            case 4: case 6: case 9: case 11:
                if  (dia > 31){
                    System.out.println("ERROR: Un mes no puede tener más de 31 días, vuelve a introducir los datos \n");
                    fechaCorrecta = false;
                }else if (diaIncrementado < 30) {
                    dia = diaIncrementado;
                    fechaCorrecta = true;
                } else {
                    dia = diaIncrementado - 30;
                    mes++;
                    fechaCorrecta = true;
                }
            break;

            case 12:
                // Diciembre es un caso especial: devuelve los contadores de mes y año a 1 antes de incrementar el año
                if  (dia > 31){
                    System.out.println("ERROR: Un mes no puede tener más de 31 días, vuelve a introducir los datos \n");
                    fechaCorrecta = false;
                }else if (diaIncrementado < 3) {
                    dia = diaIncrementado;
                    fechaCorrecta = true;
                } else {
                    dia = diaIncrementado - 31;
                    mes = 1;
                    ano++;
                    fechaCorrecta = true;
                }
            break;

            default:
                System.out.println("ERROR: Un año no puede tener más de 12 meses, vuelve a introducir los datos \n");
                fechaCorrecta = false;
            break;

        }
        if (fechaCorrecta){
            System.out.println ("7 días despúes de la fecha introducida será el día: " + dia + " / " + mes + " / " + ano);
        }
    }
}