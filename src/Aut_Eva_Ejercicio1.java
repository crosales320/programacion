
//Escribir un programa en java que permita ingresar por teclado “N” temperaturas 
//(utilice tipos de datos double o float). Determinar y mostrar el Mayor. 
//Al inicio del programa se debe solicitar la cantidad de temperaturas a ingresar. Realizar Diagrama de flujo.
import java.util.Scanner;

public class Aut_Eva_Ejercicio1 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double num = 0, aux = 0, cantidad;
        System.out.print("Introduzca la cantidad de temperaturas: ");
        cantidad = valor.nextDouble();
        System.out.println("Introduzca las temperaturas: ");
        for (int i = 0; i < cantidad; i++) {
            num = valor.nextDouble();
            if (aux == 0) {
                aux = num;
            }
        if (num > aux) {
            aux = num;
        }
        } System.out.println("La Mayor temperatura es" + " " + aux);
        valor.close();
    }
}
