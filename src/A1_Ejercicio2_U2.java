//Desarrollar un programa Java que permita el ingreso de tres notas correspondientes a evaluaciones de un alumno
// y determine e imprima el promedio de las mismas. Realizar el diagrama de flujo correspondiente.

import java.util.Scanner;

public class A1_Ejercicio2_U2 {

    public static void main(String[] args) {
        double cont=0, suma=0, promedio=0, nota;
        Scanner valor = new Scanner (System.in);
        System.out.println("Ingrese la nota del Alumno: ");
        nota = valor.nextInt();
        while (cont < 2) {
            suma = suma + nota;
            cont = cont+1;
            System.out.println("Ingrese la nota del Alumno: ");
            nota = valor.nextInt();
        }
        promedio =  suma / cont;
        System.out.println("El promedio de las 3 notas es: " +promedio);
        valor.close();
    }
    
}
