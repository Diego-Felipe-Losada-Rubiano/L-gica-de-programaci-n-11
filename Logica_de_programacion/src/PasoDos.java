import java.util.Scanner;

public class PasoDos {
    static void main() {
        //Actividad Práctica, Escribir pseudocódigo para calcular el promedio de cinco números.
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Promedio de 5 numeros ***");
        int num, total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite el numero " + (i + 1) + ": ");
            num = sc.nextInt();
            total += num;
        }
        total /= 5;
        System.out.println("el promedio de los numeros es: " + total);
    }
}