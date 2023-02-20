package ejercicio1_21;

import java.util.Scanner;

/**
 *
 * @author Alejandro Zurita Pérez
 */
public class Ejercicio1_21 {
    Scanner entrada = new Scanner(System.in);

private int numero;
private int contador = 1;
private int mayor;

public void Recibe() { // Abre el metodo Recibe


System.out.printf("\nEste programa recibe 10 numeros e imprime cual de ellos es el mayor.\n");
System.out.printf("\nPor favor introduzca el numero %d: ", contador++);
mayor = entrada.nextInt();

while ( 10 >= contador) { // Abre while

System.out.printf("\nPor favor introduzca el numero %d: ", contador++);
numero = entrada.nextInt();

if ( numero > mayor)
mayor = numero;
} // Cierra while

System.out.printf("\nEl numero mayor es: %d\n\n", Retorna());
} // Cierra el metodo Recibe

public int Retorna() { // Abre metodo retorna
    
return mayor;
} // Cierra metodo retorna
} // Cierra clase Ejercicio1_21

