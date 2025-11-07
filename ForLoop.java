public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Conteo del 1 al 5 con for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Suma de los primeros 10 números
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("Suma 1..10 = " + suma);

        // Tabla de multiplicar del 3
        System.out.println("Tabla de multiplicar del 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}