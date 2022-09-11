//Desarrollar un programa Java que permita el ingreso del radio de un círculo desde el teclado, 
//y determine e imprima el perímetro y la superficie del mismo.
import java.util.Scanner;

public class A2_Ejercicio2_U2 {
    
    public static void main(String[] args) {
        double radio, perimetro, superficie;
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = valor.nextDouble();

        perimetro = 2 * Math.PI * radio;
        superficie = Math.PI * radio * radio;

        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("La superficie del circulo es: "+superficie);

        valor.close();
    }
    
}
