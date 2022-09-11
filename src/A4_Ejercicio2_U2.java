
//Desarrollar un programa en java que permita leer un número por teclado 
//y muestre su cuadrado si es mayor a 20, de lo contrario muestre su raíz cuadrada, 
//repetir el proceso hasta que se introduzca un número negativo.
import java.util.Scanner;

public class A4_Ejercicio2_U2 {
    public static void main(String[] args) {
        double num, cuadrado, raizCuadrada;
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = valor.nextDouble();

        if (num > 0) {
            cuadrado = num * num;
            raizCuadrada = Math.sqrt (num);
            if (cuadrado > 20) {
                System.out.println("El cuadrado es: " + cuadrado);
            } else
                System.out.println("La raiz es: " + raizCuadrada);
        }
        valor.close();
    }

}
