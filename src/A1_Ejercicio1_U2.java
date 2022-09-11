//Desarrollar un programa Java que permita el ingreso de dos números enteros distintos desde el teclado, 
//y determine e imprima el menor. En caso de ingresar dos números iguales, 
//mostrar un mensaje y finalizar el programa. Realizar el diagrama de flujo correspondiente.
import java.util.Scanner;

public class A1_Ejercicio1_U2 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = valor.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = valor.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros deben ser distintos");
        } else {
            if (num1 < num2) {
                System.out.println("El menor es " + num1);
            } else
                System.out.println("El menor es " + num2);
        }
    valor.close();
    }
}
