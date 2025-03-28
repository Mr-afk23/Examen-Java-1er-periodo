import java.util.Scanner;
public class ExamenJava {
    public static void main(String[] args) {
        int opcion;
        Scanner menu = new Scanner(System.in);
        // Ejercicio 1 
        
        int numero1= 3;
        
        System.out.print("Ingrese el primer numero: ");
        int num2 = menu.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num3 = menu.nextInt();

        int operacion = num2 + (num3*numero1);
        System.out.println("La operacion es:"+ operacion);
System.out.println("---------------------------------");

        // Ejercicio 2 

        int numero2= 5;
        int numero4= 2;
        System.out.print("Ingrese el primer numero: ");
        int num4 = menu.nextInt();

        int operacion2 = (num4*numero4)+ numero2;
        System.out.println("La operacion es:"+ operacion2);
System.out.println("---------------------------------");

// Ejercicio 3

        int numero3= 2;

        System.out.print("Ingrese el primer numero:");
        int num5 = menu.nextInt();
        System.out.print("Ingrese el segundo numero:");
        int num6 = menu.nextInt();

        int operacion3 = (numero3/num5)+(num6*num6);
        System.out.println("La operacion es:"+ operacion3);
System.out.println("---------------------------------");

//Ejercicio 4 

        int numero5=3;

        int numero6=2;
        System.out.print("Ingrese el primer numero:");
       int num7 = menu.nextInt();
        System.out.print("Ingrese el segundo numero:");
       int num8 = menu.nextInt();
       System.out.print("Ingrese el tercer numero:");
       int num9 = menu.nextInt();

       int operacion4 = num7 + (numero6*num8)+ (numero5*num9);
       System.out.println("La operacion es:"+ operacion4);
System.out.println("---------------------------------");
    }
}


