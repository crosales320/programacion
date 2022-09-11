//Escribir un programa en java que permita ingresar por teclado “N” notas de 0 a 10 
//(debe validar que se cumpla esta condición) y mostrarla de la forma: Insuficiente 
//(0 a 3), Suficiente (4 a 6), Bien (7 a 8) Muy Bien (9) Excelente (10). 
//El programa finaliza cuando se ingrese un (-1). Mostrar Mensaje al Finalizar.
import java.util.Scanner;

public class Aut_Eva_Ejercicio2 {
    public static void main(String[] args) {

        Scanner valor = new Scanner (System.in);
        System.out.println("Ingrese la nota: ");
        String nota = valor.nextLine();

        switch (nota){
            case "0":
            System.out.println("La nota del alumno es: Insuficiente");
            break;
            case "1":
            System.out.println("La nota del alumno es: Insuficiente");
            break;
            case "2":
            System.out.println("La nota del alumno es: Insuficiente");
            break;
            case "3":
            System.out.println("La nota del alumno es: Insuficiente");
            break;
            case "4":
            System.out.println("La nota del alumno es: Suficiente");
            break;
            case "5":
            System.out.println("La nota del alumno es: Suficiente");
            break;
            case "6":
            System.out.println("La nota del alumno es: Suficiente");
            break;
            case "7":
            System.out.println("La nota del alumno es: Bien");
            break;
            case "8":
            System.out.println("La nota del alumno es: Bien");
            break;
            case "9":
            System.out.println("La nota del alumno es: Muy Bien");
            break;
            case "10":
            System.out.println("La nota del alumno es: Excelente");
            break;
            default:
                System.out.println("Nota Invalida");
                break;
        
    } valor.close();

    }
}
