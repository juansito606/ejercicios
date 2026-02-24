import java.util.Scanner;


public class semana {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int dia = 0;
        System.out.println("Digite un numero del 1 al 7");
        dia=sc.nextInt();

        if (dia == 1) {
            System.out.println("Es lunes");
        }else {
            if(dia==2){
                System.out.println("Es martes");
            }else{
                if(dia ==3) {
                    System.out.println("Es miercoles");
                }else{
                    if (dia ==4){
                        System.out.println("Es jueves");
                    }else{
                        if(dia==5){
                            System.out.println("Es viernes");
                        }else{
                            if(dia==6){
                                System.out.println("Es sabado");
                            }else{
                                if(dia==7){
                                    System.out.println("Es domingo");
                                }else{
                                    System.out.println("error, el rango es de 1 a 77");
                                }
                            }
                        }
                    }
                }
            }
            sc.close();
        }
    }
    
}
