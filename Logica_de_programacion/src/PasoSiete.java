public class PasoSiete {
    static double calcularIMC(double peso, double altura) {
        //return peso / (altura * altura);
        return peso / Math.pow(altura, 2);
    }
    static void main() {
        //Implementar una función reutilizable que calcule el IMC (Índice de Masa Corporal).
        double imc = calcularIMC(75, 1.85); //altura en Metros
        System.out.printf("IMC: %.2f", imc);
    }
}
