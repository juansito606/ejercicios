import java.util.Scanner;

public class Inventario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Creacion productos

        Inventario producto1 = new Inventario();
        producto1.nombreProducto = "Banano";
        producto1.codigo = "123";
        producto1.precio = 500;

        Inventario producto2 = new Inventario();
        producto2.nombreProducto = "Pera";
        producto2.codigo = "456";
        producto2.precio = 600;


        int opcion;
        do{
            System.out.println("---Verduleria Juanito Bienvenido");
            System.out.println("1. Ver inventario");
            System.out.println("2. Meter stock Banano");
            System.out.println("3. Meter stock Pera");
            System.out.println("4. Sacar Stock Banano");
            System.out.println("5. Sacar Stock Pera");
            System.out.println("6. Salir");
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    producto1.mostrarInventario();
                    producto2.mostrarInventario();
                    break;
                
                case 2:
                    ejecutarMasStock (sc, producto1);
                    break;

                case 3:
                    ejecutarMasStock (sc, producto2);
                    break;

                case 4:
                    ejecutarMenosStock (sc, producto1);
                    break;

                case 5:
                    ejecutarMenosStock(sc, producto2);

                case 6:
                    System.out.println("Saliendo del sistema....");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                
            }
        } while (opcion != 6);

        sc.close();
     }

     // Métodos auxiliares para que el switch funcione
    public static void ejecutarMasStock(Scanner sc, Inventario p) {
        System.out.print("¿Cuanto desea ingresar?: ");
        int cant = sc.nextInt();
        p.masStock(cant);
    }

    public static void ejecutarMenosStock(Scanner sc, Inventario p) {
        System.out.print("¿Cuanto desea sacar?: ");
        int cant = sc.nextInt();
        p.menoStock(cant);
    }
}
     
     
        
              

                
            
  