import java.util.Scanner;

public class avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Determinar precio

        double distancia = 0;
        int dias = 0;
        double precio =0;

        System.out.print("Digite la distancia en km:");
        distancia = sc.nextDouble();

        System.out.print("Digite los dias de estancia:");
        dias = sc.nextInt();

        precio = distancia * 2.5;

        if(distancia > 800 && dias > 7){
            precio = precio - (precio * 30/100);
            System.out.println("Tiene descuento del 30%");    
        }else {
            System.out.println("No tiene descuento");
        }

        System.out.println("Precio del billete:" + precio + "euros");

        sc.close();
    }
}
