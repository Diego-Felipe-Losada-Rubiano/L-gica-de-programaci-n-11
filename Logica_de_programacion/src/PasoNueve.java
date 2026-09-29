public class PasoNueve {

    static void ordenar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }
    }

    static void main(){
        int[] numeros = {5, 2, 8, 1, 3};
        System.out.println("Arreglo original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        ordenar(numeros);

        System.out.println("\nArreglo ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}