public class PasoCinco {
    static void main() {
        //Crear variables para información personal e imprimir un perfil de usuario formateado
        String nombre = "Diego Felipe", apellido = "Losada Rubiano", empresa = "IAS";
        int edad = 20;
        double estatura = 1.85;

        System.out.printf("""
            Hola mi nombre es %s
            Mi aprellido es %s
            Trengo %d años y mido %.2f
            Y me gusta estar en %s
            """, nombre,  apellido, edad, estatura,  empresa);


    }
}
