//Desarrollar un programa en Java que calcule y escriba en pantalla el factorial de n, 
//entre los valores 1 y 10. Realizar Diagrama de flujo.

import java.util.Scanner;

public class A4_Ejercicio1_U2 {
    public static void main(String[] args) {
        int num, fact=1, i=1;
        Scanner valor = new Scanner (System.in);
        System.out.println("Ingrese el numero para calcular el Factorial");
        num = valor.nextInt();
        
        if (num>=1){
            
        }


        if (num >= 1 && num <= 10){
            while (i<=num) {
                fact = fact * i;
                i = i+1;
            }
        } System.out.println("El Factorial es: "+fact);
    valor.close();
    }
}
