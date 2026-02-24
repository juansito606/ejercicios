import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ejercicio

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Digite numero 1");
        numero1 = sc.nextInt();

        System.out.println("Digite numero 2");
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Numeros iguales");
        } else {
            if (numero1 > numero2) {
                System.out.println("El primer numero es el mayor");
            } else {
                System.out.println("El primer numero es el menor");
            }
        }

        sc.close();

    }

}
