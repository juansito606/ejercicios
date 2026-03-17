import java.util.Scanner;


public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Creacion habitaciones

        Hotel res1 = new Hotel();
        res1.numeroHabitacion = 101;

        Hotel res2 = new Hotel();
        res2.numeroHabitacion = 102;

        int opcion;
        do {
            System.out.println("--- HOTEL ---");
            System.out.println("1. Ver estado de habitaciones");
            System.out.println("2. Reservar habitación 101");
            System.out.println("3. Reservar habitación 102");
            System.out.println("4. Liberar habitación 101");
            System.out.println("5. Liberar habitación 102");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt(); 

            switch (opcion){

                case 1:
                    res1.consultarReserva();
                    res2.consultarReserva();
                    break;
                case 2:
                    System.out.println("Nombre del Cliente: ");
                    res1.nombreCliente = sc.next();
                    System.out.print("Fecha de entrada (D/M/A): ");
                    res1.fechaEntrada = sc.next();
                    System.out.print("Fecha de salida: ");
                    res1.fechaSalida = sc.next();
                    res1.nuevaReserva();
                    break;

                case 3:
                    System.out.print("Nombre del cliente: ");
                    res2.nombreCliente = sc.next();
                    System.out.print("Fecha de entrada: ");
                    res2.fechaEntrada = sc.next();
                    System.out.print("Fecha de salida: ");
                    res2.fechaSalida = sc.next();
                    res2.nuevaReserva();
                    break;

                case 4:
                    res1.cancelarReserva();
                    break;

                case 5:
                    res2.cancelarReserva();
                    break;
                
                case 6:
                    System.out.println("Saliendo del sistema....");    

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
    
        } while (opcion != 6);
        sc.close();
    }
    
}
