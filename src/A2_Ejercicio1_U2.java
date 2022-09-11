
//Desarrollar un programa Java que permita el ingreso de tres números enteros distintos desde el teclado 
//y determine e imprima el menor. En caso de ingresar números iguales, mostrar un mensaje 
//y finalizar el programa. Realizar el diagrama de flujo correspondiente.
import java.util.Scanner;

public class A2_Ejercicio1_U2 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = valor.nextInt();
        System.out.println("Ingrese el primer numero: ");
        num2 = valor.nextInt();
        System.out.println("Ingrese el primer numero: ");
        num3 = valor.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros deben ser distintos");
        } else if (num1 == num3) {
            System.out.println("Los numeros deben ser distintos");
        } else if (num2 == num3) {
            System.out.println("Los numeros deben ser distintos");
        } else if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("El menor es: " + num1);
            } else
                System.out.println("El menor es: " + num3);
        } else if (num2 < num3) {
            System.out.println("El menor es: " + num2);
        } else
            System.out.println("El menor es: " + num3);

        valor.close();
    }
}
