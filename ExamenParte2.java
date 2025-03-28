import java.util.Scanner;
public class ExamenParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("[1] Promedio de los numeros");
            System.out.println("[2] Saludar por tu nombre");
            System.out.println("[3] Hola Mundo");
            System.out.println("[4] Salir");
            System.out.print("[?]");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                System.out.print("Ingrese la cantidad de números: ");
                int cantidad = scanner.nextInt();
                double suma = 0;

                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("Ingrese el número " + i + ": ");
                    double numero = scanner.nextDouble();
                    suma = suma + numero;
                }

                double promedio = suma / cantidad;
                System.out.println("El promedio es: " + promedio);
                break;
                case 2:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Hola " + nombre );
                    
                    break;
                case 3:
                    System.out.println("Hola Mundo");

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
