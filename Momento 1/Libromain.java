import java.util.Scanner;

public class Libromain {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Libro miLibro= new Libro();

        //configuracion inicial

        System.out.println("---Nuevo registro de libro");
        System.out.println("Titulo ");
        miLibro.titulo = sc.nextLine();
        System.out.println("Autor ");
        miLibro.autor = sc.nextLine();
        System.out.println("ISBN: ");
        miLibro.ISBN = sc.nextLine();

        int opcion;
        do{
            System.out.println("Sistema de biblioteca");
            System.out.println("1. Verificar disponibilidad");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    miLibro.estaDisponible();
                    break;
                case 2:
                    miLibro.prestar();
                    break;
                case 3:
                    miLibro.devolver();
                    break;
                case 4:
                    System.out.println("Cerrando sistema... ¡Buen día!");
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

        
    
        