import java.util.Scanner;


public class MainPerfume {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Creacion perfumes

        Perfume perfume1 = new Perfume();
        perfume1.nombre = "Light Blue";
        perfume1.marca = "Dolce & Gabbana";
        perfume1.capacidad = 100;
        perfume1.precio = 120000;

        Perfume perfume2 = new Perfume();
        perfume2.nombre = "La Vie Est Belle";
        perfume2.marca = "Lancôme";
        perfume2.capacidad = 75;
        perfume2.precio = 150000;

        int opcion;
        do {
            System.out.println("--- PERFUMERÍA ---");
            System.out.println("1. Ver catálogo de perfumes");
            System.out.println("2. Usar 'Light Blue'");
            System.out.println("3. Usar 'La Vie Est Belle'");
            System.out.println("4. Ajustar precio 'Light Blue'");
            System.out.println("5. Ajustar precio 'La Vie Est Belle'");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    perfume1.consultarCantidadRestante();
                    perfume2.consultarCantidadRestante();
                    break;
                case 2:
                    System.out.print("Cantidad a usar de 'Light Blue' (ml): ");
                    double cantidad1 = sc.nextDouble();
                    perfume1.aplicarPerfume(cantidad1);
                    break;
                case 3:
                    System.out.print("Cantidad a usar de 'La Vie Est Belle' (ml): ");
                    double cantidad2 = sc.nextDouble();
                    perfume2.aplicarPerfume(cantidad2);
                    break;
                case 4:
                    System.out.print("Nuevo precio para 'Light Blue': $");
                    double nuevoPrecio1 = sc.nextDouble();
                    perfume1.ajustarPrecio(nuevoPrecio1);
                    break;
                case 5:
                    System.out.print("Nuevo precio para 'La Vie Est Belle': $");
                    double nuevoPrecio2 = sc.nextDouble();
                    perfume2.ajustarPrecio(nuevoPrecio2);
                    break;
                case 6:
                    System.out.println("Gracias por visitar nuestra perfumería. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
        sc.close();
       
    }
    
}
