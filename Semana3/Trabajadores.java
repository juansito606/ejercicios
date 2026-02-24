import java.util.Scanner;


public class Trabajadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Determinar valor jornada laboral
        double precio= 0;
        double jd = 5;
        double jn = 8;
        int dias = 0;
        int horas = 0;
        int jornada=0;

        //operaciones

        System.out.print("Digite que numero de la semana es ");
        dias= sc.nextInt();

        System.out.print("Digite cuantas horas trabajo");
        horas= sc.nextInt();

        System.out.print("Digite la jornada sea 1 diurno y 2 nocturno");
        jornada= sc.nextInt();

    

        if(dias== 7){
            if (jornada==1) {
                precio= (jd+2)*horas;
            } else {
                precio = (jn+3)*horas;
            }
    }else {
        if (jornada == 1) {
            precio= jd * horas;
        }else {
            precio = jn * horas;
        }
    }

    System.out.println("El valor de su jornada es:"+ precio);

    sc.close();
 }  
}
