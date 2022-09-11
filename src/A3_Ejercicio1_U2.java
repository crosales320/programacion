//Desarrollar un programa en java que permita el ingreso de la calificación de un alumno en una evaluación y
// muestre el concepto de la misma.
//Se supone que la calificación puede ser una letra, en el rango de la ´A´ a la ´E´, con los siguientes conceptos:
// ‘A’ : ‘Excelente’, ‘B’ : ‘Notable’, ‘C’: ‘Aprobado’, ‘D’ y ‘E’: ‘Suspendido’.
//En caso de ingresar una letra fuera del rango. Mostrar Mensaje de error.
//Nota: Utilizar la sentencia switch.
import java.util.Scanner;

public class A3_Ejercicio1_U2 {
    
    public static void main(String[] args) {
        Scanner valor = new Scanner (System.in);
        System.out.println("Ingrese la letra correspondiente a la nota: ");
        String nota = valor.nextLine();

        switch (nota){
            case "A":
            System.out.println("La nota del alumno es: Excelente");
            break;
            case "B":
            System.out.println("La nota del alumno es: Notable");
            break;
            case "C":
            System.out.println("La nota del alumno es: Aprobado");
            break;
            case "D":
            System.out.println("La nota del alumno es: Suspendido");
            break;
            case "E":
            System.out.println("La nota del alumno es: Suspendido");
            break;
            default:
                System.out.println("Letra Invalida");
                break;
        }
        valor.close();
    }
}
