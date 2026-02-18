import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer dos números y deducir si están en orden creciente.
        int a = 0, b = 0;
        System.out.print("Digite a:");
        a = sc.nextInt();
        System.out.print("Digite b :");
        b = sc. nextInt();
        if(a<=b){
            System.out.println("Orden Creciente");

        }else {
            System.out.println("Orden decreciente");
        }
        sc.close();
    }
}
