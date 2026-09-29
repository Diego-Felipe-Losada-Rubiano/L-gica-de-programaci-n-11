public class PasoTres {
    static void main() {
        //Crear un bucle que imprima números del 1 al 20, destacando los números pares.
        int par;
        for (int i = 1; i <= 20; i++) {
            par = i % 2;
            if (par == 1) {
                System.out.println(i + " impar");
            }else  {
                System.out.println(i + " par");
            }
        }
    }
}
