import java.util.Scanner;

public class PasoDiez {

    static Scanner scanner = new Scanner(System.in);

    //Capacidad inventario
    static String[] nombres = new String[5];
    static int[] cantidades = new int[5];

    //numero de registros
    static int cantidadProductos = 0;

    static void main() {
        int opcion;
        do {

            System.out.println("\n*** SISTEMA DE INVENTARIO ***");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Modificar artículo");
            System.out.println("3. Organizar inventario");
            System.out.println("4. Eliminar artículo");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Finalizar programa");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    agregarArticulo();
                    break;

                case 2:
                    modificarArticulo();
                    break;

                case 3:
                    organizarInventario();
                    break;

                case 4:
                    eliminarArticulo();
                    break;

                case 5:
                    mostrarInventario();
                    break;

                case 6:
                    System.out.println("\nPrograma finalizado.");
                    break;

                default:
                    System.out.println("\nOpción no válida.");
            }

            if (opcion != 6) {
                System.out.println("\nPresione ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 6);

        scanner.close();
    }



    // FUNCIONES:

    //Case 1:
    // Agregar articulos
    static void agregarArticulo() {

        //comprobacion (Hay espacio?)
        if (cantidadProductos >= nombres.length) {
            System.out.println("\nEl inventario está lleno.");
            return;
        }

        System.out.println("\n*** AGREGAR ARTÍCULO ***");

        //pedimos los datos
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        //guardamos los datos
        nombres[cantidadProductos] = nombre;
        cantidades[cantidadProductos] = cantidad;

        //+1 registro, pasa al siguiente arreglo
        cantidadProductos++;

        System.out.println("\nArtículo agregado correctamente.");
    }

    //Case 2:
    //Modificar articulos

    static void modificarArticulo() {

        //Comprobacion (Hay datos?)
        if (cantidadProductos == 0) {
            System.out.println("\nEl inventario está vacío.");
            return;
        }

        mostrarInventario();

        System.out.print("\nSeleccione el número del artículo que desea modificar: ");
        int posicion = scanner.nextInt() - 1;
        scanner.nextLine();

        //Comprobacion (posicion valida?)
        if (posicion < 0 || posicion >= cantidadProductos) {
            System.out.println("\nArtículo no válido.");
            return;
        }

        System.out.println("\nArtículo seleccionado:");
        System.out.println("Nombre: " + nombres[posicion]);
        System.out.println("Cantidad: " + cantidades[posicion]);

        System.out.print("\nIngrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        System.out.print("Ingrese la nueva cantidad: ");
        int nuevaCantidad = scanner.nextInt();
        scanner.nextLine();

        //Guardamos la nueva info
        nombres[posicion] = nuevoNombre;
        cantidades[posicion] = nuevaCantidad;

        System.out.println("\nArtículo modificado correctamente.");
    }

    //Case 3
    //Organizar inventario

    static void organizarInventario() {

        //comprobacion (min 2 articulos)
        if (cantidadProductos < 2) {
            System.out.println("\nNo hay suficientes artículos para organizar.");
            return;
        }

        System.out.println("\n*** ORGANIZAR INVENTARIO ***");
        System.out.println("1. Orden alfabético");
        System.out.println("2. Orden por cantidad (de menor a mayor)");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {

            case 1:
                ordenarAlfabeticamente();
                System.out.println("\nInventario ordenado alfabéticamente.");
                break;

            case 2:
                ordenarPorCantidad();
                System.out.println("\nInventario ordenado por cantidad.");
                break;

            default:
                System.out.println("\nOpción no válida.");
        }
    }

    //SUB funciones case 3
    //Orden alfabetico

    static void ordenarAlfabeticamente() {

        for (int i = 0; i < cantidadProductos - 1; i++) {

            for (int j = 0; j < cantidadProductos - 1 - i; j++) {

                //Comparacion alfabetica
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {

                    //Cambio de datos
                    String temporalNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temporalNombre;

                    int temporalCantidad = cantidades[j];
                    cantidades[j] = cantidades[j + 1];
                    cantidades[j + 1] = temporalCantidad;
                }
            }
        }
    }

    //Ordenar por cantidad (de menor a mayor)

    static void ordenarPorCantidad() {

        for (int i = 0; i < cantidadProductos - 1; i++) {

            for (int j = 0; j < cantidadProductos - 1 - i; j++) {

                //Comparacion numerica
                if (cantidades[j] > cantidades[j + 1]) {

                    //Cambio de datos
                    int temporalCantidad = cantidades[j];
                    cantidades[j] = cantidades[j + 1];
                    cantidades[j + 1] = temporalCantidad;

                    String temporalNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temporalNombre;
                }
            }
        }
    }

    //Eliminar articulo

    static void eliminarArticulo() {

        //Comprobacion (Hay articulos?)
        if (cantidadProductos == 0) {
            System.out.println("\nEl inventario está vacío.");
            return;
        }

        mostrarInventario();

        System.out.print("\nSeleccione el número del artículo que desea eliminar: ");
        int posicion = scanner.nextInt() -1;
        scanner.nextLine();

        //Comprobacion (Posicion valida?)
        if (posicion < 0 || posicion >= cantidadProductos) {
            System.out.println("\nArtículo no válido.");
            return;
        }

        //Movemos los articulos a la izquierda a partir del articulo siguiente al que queremos eliminar
        for (int i = posicion; i < cantidadProductos - 1; i++) {

            nombres[i] = nombres[i + 1];
            cantidades[i] = cantidades[i + 1];
        }

        //Convertimos El ultimo dato en un dato nulo
        nombres[cantidadProductos - 1] = null;
        cantidades[cantidadProductos - 1] = 0;

        //-1 registro
        cantidadProductos--;

        System.out.println("\nArtículo eliminado correctamente.");
    }

    //Mostrar inventario

    static void mostrarInventario() {

        //Conprobacion (Hay productos?)
        if (cantidadProductos == 0) {
            System.out.println("\nEl inventario está vacío.");
            return;
        }

        System.out.println("\n********* INVENTARIO *********\n");

        //Imprime los articulos
        for (int i = 0; i < cantidadProductos; i++) {

            System.out.println(
                    (i + 1) + ". " + nombres[i] + " | Cantidad: " + cantidades[i]
            );
        }

        System.out.println("\n******************************");
    }
}