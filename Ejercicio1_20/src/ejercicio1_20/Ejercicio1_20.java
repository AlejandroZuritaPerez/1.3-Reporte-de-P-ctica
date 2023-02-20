package ejercicio1_20;

import java.util.Scanner;

/**
 *
 * @author Alejandro Zurita Pérez 
 */
public class Ejercicio1_20 {
     /**
     * Método encargado de realizar el calculo del sueldo.
     * La empresa paga la cuota normal en las primeras 40 horas
     * de trabajo de cada empleado, y paga cuota y media en
     * todas las horas trabajadas que excedan de 40.
     */
    public void calcularSueldo() {
        //Se crea un objeto Scanner para obtener la entrada
        //de datos del usuario.
        Scanner entrada = new Scanner(System.in);

        /**
         * Contiene el contador para los tres empleados.
         */
        int contador = 0;
        /**
         * Contiene las horas trabajadas por los empleados.
         */
        int horas = 0;
        /**
         * Contiene el sueldo por hora trabajada.
         */
        double tarifa = 0.0;
        /**
         * Contiene el sueldo total del empleado.
         */
        double sueldo = 0.0;

        //En el caso del ciclo while: Primero se evalúa la condición de entrada
        //si es verdadera ejecuta las sentencias en su cuerpo, luego vuelve a
        //verificar la condición de entrada y hasta que sea falsa sale del ciclo.
        while ( contador < 3) {
            System.out.println("Las horas trabajadas del empleado "
                    + (contador + 1) + ": ");
            horas = entrada.nextInt();
            System.out.println("La tarifa por hora: ");
            tarifa = entrada.nextDouble();

            if ( horas <= 40 ) {
                sueldo = horas * tarifa;
            } else {
                sueldo = (40 * tarifa) + (horas-40) * (tarifa*1.5) ;
            }

            System.out.println("El sueldo del empleado " + (contador + 1)
                    + " es: " + sueldo);

            contador++;
        }
    }

    /**
     * Punto de entrada a la clase y a la aplicación.
     * @param args matriz de argumentos de cadena.
     */
    public static void main(String[] args) {
        //El operador new es el encargado de crear instancias de
        //una clase, es decir los objetos que tienen las características
        //de la clase. El operador new de Java es capaz de reservar la
        //memoria para un objeto de este tipo sabiendo los atributos que
        //tiene según la definición de la clase.
        Ejercicio1_20 Ejercicio1_20 = new Ejercicio1_20();
        Ejercicio1_20.calcularSueldo();
    }
}
