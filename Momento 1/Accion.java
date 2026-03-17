import java.util.Scanner;

public class Accion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CuentaBancaria cuenta = new CuentaBancaria();

        //Interaccion
        System.out.println("Ingrese nombre del titular:  ");
        cuenta.titular = sc.nextLine();
        System.out.println("Ingrese numero de cuenta: ");
        cuenta.numeroCuenta = sc.nextLine();

        int opcion;
        do {
            System.out.println("MENÚ BANCARIO");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Cantidad a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    break;
                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro banco. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}



      