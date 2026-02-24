import java.util.Scanner;

public class sentencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // a)
        int angulo = 0;
        System.out.println("Digite el angulo: ");
        angulo = sc.nextInt();

        if(angulo==90){
            System.out.println("El Angulo es recto");
        } else {
            System.out.println("El angulo no es recto");
        }

        //b)
        double temperatura = 0;
        System.out.println("Digite la temperatura: ");
        temperatura = sc.nextDouble();

        if (temperatura > 100){
            System.out.println("Por encima del punto de ebullicion del agua");
        } else {
            System.out.println("Por debajo del punto de ebullicion del agua");
        }

        // c)

        int numero = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;

        System.out.println("Digite un numero:");
        numero = sc.nextInt();

        if (numero>0){
            totalPositivos= totalPositivos + numero;
        } else {
            totalNegativos=totalNegativos + numero;
        }

        System.out.println("Total positivos:"+ totalPositivos);
        System.out.println("Total negativos:"+ totalNegativos);

        //d) 

        int x = 0, y = 0, z = 0, p = 0;
        System.out.println("Digite x:  ");
        x = sc.nextInt();

         System.out.println("Digite y:  ");
        y = sc.nextInt();

         System.out.println("Digite z:  ");
        z = sc.nextInt();

        if (x>y&&z<20){
            System.out.println("Digite p: ");
            p= sc.nextInt();
        }

        System.out.println("Valor de p: "+p);


        //e)

        int distancia = 0, tiempo = 0;

        System.out.println("Digite la distancia:  ");
        distancia=sc.nextInt();

        if (distancia>20 && distancia <35) {
            System.out.println("Digite el tiempo: ");
            tiempo = sc.nextInt();
        }

        System.out.println("Tiempo:" + tiempo);

        sc.close();
    }
}
