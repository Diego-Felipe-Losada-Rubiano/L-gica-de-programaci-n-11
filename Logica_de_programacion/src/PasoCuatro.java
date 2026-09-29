import java.util.Scanner;

public class PasoCuatro {
    static void main() {
        //Desarrollar un verificador de inicio de sesión que valide usuario y contraseña
        String usuario = "Diego";
        String logUsuario;

        String key = "qwe123";
        String logKey;

        Scanner sc = new Scanner(System.in);
        System.out.println("*** Inicio de Sesion ***");
        System.out.print("Ingresa tu usuario: ");
        logUsuario  = sc.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        logKey  = sc.nextLine();

        if (logUsuario.equals(usuario) && logKey.equals(key)) {
            System.out.println("Contraseña y usuario correctas.");
        }else {
            System.out.println("Contraseña y usuario incorrectos.");
        }


    }
}
