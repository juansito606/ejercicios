import java.util.Scanner;

public class Libromain {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //creacion libros
        Libro libro1 = new Libro();
        libro1.titulo = "Don quijote ";
        libro1.autor ="Cervantes ";
        libro1.ISBN = "978-8424116569";
        libro1.numeroPaginas = 1032;

        Libro libro2 = new Libro();
        libro2.titulo = "El principito ";
        libro2.autor ="Saint-Exupery ";
        libro2.ISBN = "978-0156012196";
        libro2.numeroPaginas= 96;


    

        int opcion;
        do{
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Ver catalogo libros");
            System.out.println("2. Prestar libro 'Don Quijote'");
            System.out.println("3. Prestar libro 'El principito'");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
    
            switch (opcion) {
                case 1:
                    System.out.println("\nNUESTRO CATALOGO: ");
                    libro1.mostrarInfo();
                    libro2.mostrarInfo();
                    break;
                case 2:
                    gestionarLibro(sc, libro1); //llamamos una funcion para no repetir el codigo
                    break;
                case 3:
                    gestionarLibro(sc, libro2);
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
    //Metodo para gestionar libro
    public static void gestionarLibro (Scanner sc, Libro libroElegido) {
        System.out.println("\nElgesite: " + libroElegido.titulo);
        System.out.println("1. Prestar");
        System.out.println("2. Devolver");
        System.out.println("Accion");
        int accion = sc.nextInt();

        if (accion==1){
            libroElegido.prestar();
        } else if (accion == 2) {
            libroElegido.devolver();
        } else {
            System.out.println("Accion cancelada");
        }
    }
}

        
    
        