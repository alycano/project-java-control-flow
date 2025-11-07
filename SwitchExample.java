public class SwitchExample {
    public static void main(String[] args) {
        int dia = 3;
        String nombre;
        switch (dia) {
            case 1: nombre = "Lunes"; break;
            case 2: nombre = "Martes"; break;
            case 3: nombre = "Miércoles"; break;
            case 4: nombre = "Jueves"; break;
            case 5: nombre = "Viernes"; break;
            case 6: nombre = "Sábado"; break;
            case 7: nombre = "Domingo"; break;
            default: nombre = "Día inválido"; break;
        }
        System.out.println("Día: " + nombre);

        // Switch con strings (Java 7+)
        String role = "admin";
        switch (role) {
            case "admin" -> System.out.println("Acceso total");
            case "user" -> System.out.println("Acceso limitado");
            default -> System.out.println("Acceso denegado");
        }
    }
}