import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Escribe 'si' para repetir o 'no' para terminar.");
        do {
            System.out.println("¿Deseas continuar? (si/no):");
            respuesta = sc.nextLine().trim().toLowerCase();
        } while (respuesta.equals("si"));
        System.out.println("Programa finalizado.");
        sc.close();
    }
}