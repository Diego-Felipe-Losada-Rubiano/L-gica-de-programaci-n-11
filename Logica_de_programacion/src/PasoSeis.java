import java.util.Scanner;

public class PasoSeis {
    static void main() {
        //Escribir un programa que calcule y muestre el área de un rectángulo.
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Area de un rectangulo ***");
        System.out.print("Escribe la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.print("Escribe la altura del rectangulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura);
        System.out.println("El area del rectangulo es: " + area);
    }
}
