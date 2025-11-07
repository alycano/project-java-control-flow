public class WhileLoop {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("While: intentos hasta 3");
        while (contador <= 3) {
            System.out.println("Intento " + contador);
            contador++;
        }

        // Uso con condición de terminación basada en cálculo
        int n = 2;
        System.out.println("Potencias de 2 hasta superar 50:");
        while (n <= 50) {
            System.out.println(n);
            n *= 2; // se duplica cada vez
        }
    }
}