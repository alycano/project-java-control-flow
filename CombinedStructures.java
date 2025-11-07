public class CombinedStructures {
    public static void main(String[] args) {
        // Usar bucle y condicionales para simular un control sencillo
        int[] edades = {15, 18, 23, 12, 30};
        for (int edad : edades) {
            if (edad < 18) {
                System.out.println(edad + " -> Menor de edad");
            } else if (edad <= 25) {
                System.out.println(edad + " -> Joven adulto");
            } else {
                System.out.println(edad + " -> Adulto");
            }
        }
        // Contar cuántos son mayores de 18
        int count = 0;
        int i = 0;
        while (i < edades.length) {
            if (edades[i] >= 18) count++;
            i++;
        }
        System.out.println("Mayores de 18: " + count);
    }
}