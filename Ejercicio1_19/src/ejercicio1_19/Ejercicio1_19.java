package ejercicio1_19;

import java.util.Scanner;

/**
 *
 * @author Alejandro Zurita Pérez
 */
public class Ejercicio1_19 {
    
Scanner entrada = new Scanner(System.in);
private int numeroEmpleado;
private int numero;
private float salarioEmpleado = 0;

public void Recibe() { // Abre metodo Recibe

System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar:");
numeroEmpleado = entrada.nextInt();

while (-1 != numeroEmpleado) { // Abre while

System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
numero = entrada.nextInt();

while ( -1 != numero) { // Abre while anidado

if ( 1 == numero )
salarioEmpleado += 239.99;
if ( 2 == numero)
salarioEmpleado += 129.75;
if ( 3 == numero)
salarioEmpleado += 99.95;
if ( 4 == numero)
salarioEmpleado += 350.89;

System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
numero = entrada.nextInt(); 
} // Cierra while anidado

System.out.printf("\nEl salario total del empleado %d es %.2f\n", numeroEmpleado, 200 + Retorna(salarioEmpleado));

System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar: ");
numeroEmpleado = entrada.nextInt();
} // Cierra while
} // Cierra metodo Recibe

public double Retorna( double salario) { // Abre metodo Retorna
    
return salario*0.9;
} // Cierra metodo Retorna
} // Cierra clase Ejercicio1_19