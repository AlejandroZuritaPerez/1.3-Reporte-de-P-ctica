package ejercicio1_22;

/**
 *
 * @author Alejandro Zurita Pérez 
 */
public class Ejercicio1_22 {
    private String cadena;
 
//////////////////////////////////////////////////////////////////////
//UN CONSTRUCTOR                                                   //
////////////////////////////////////////////////////////////////////
 
public Ejercicio1_22(String mensaje) { // Abre el constructor 
cadena = mensaje;
} // Cierra el constructor
 
//////////////////////////////////////////////////////////////////////////
//METODO PRESENTA                                                       //
/////////////////////////////////////////////////////////////////////////
 
 
public void Presenta() { // Abre metodo presenta
 
int contador = 1;
System.out.print("\n 1 10*N 100*N 1000*N\n\n");
 
while ( 5 >= contador) { // Abre while
System.out.printf("%6d %6d %6d %6d\n", contador, 10*contador, 100*contador, 1000*contador++);
} // Cierra while
 
} // Cierra metodo presenta
} //Cierra clase Deitel_4_22

