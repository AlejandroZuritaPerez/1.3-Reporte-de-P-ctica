package ejercicio1_17;

import java.util.Scanner;

/**
 *
 * @author Alejandro Zurita Pérez
 */
public class Ejercicio1_17 {

public static void main(String[] args) {
    
Scanner entrada = new Scanner( System.in );

int kms = 0;
int litros = 0;
double kmsLitro;
double totalKms = 0;
double totalLitros = 0;


System.out.print("Escriba los kilometros conducidos o -1 para terminar: ");
kms = entrada.nextInt();


while( kms != -1 )
{
System.out.print("Escriba los litros usados: ");
litros = entrada.nextInt();
kmsLitro = kms/litros;
System.out.printf("Kilometros por litro obtenidos en este viaje: %.2f\n",kmsLitro);

totalKms += kms;
totalLitros += litros;


System.out.print("Escriba los kilometros conducidos o -1 para terminar: ");
kms = entrada.nextInt();
}

if(totalKms != 0)
{
System.out.printf("Total de kilometros por litro obtenidos en todos los abastecimientos: %.2f\n",totalKms/totalLitros);
}
else
System.out.println("No se introdujeron datos");
}
}
