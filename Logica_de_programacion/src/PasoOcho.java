public class PasoOcho {
    static void main() {
        String[] lista = {"Papa", "Leche", "Huevos", "Azucar"};
        System.out.println("*** Lista de compras ***");
        for (String compra : lista) {
            System.out.println(compra);
        }

        //Alternativa (Con i puedo saber la posicion del elemento):
//        for (int i = 0; i < lista.length; i++) {
//            System.out.println(lista[i]);
//        }
    }
}
