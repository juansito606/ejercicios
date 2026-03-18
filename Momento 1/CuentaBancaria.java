public class CuentaBancaria {
    //Atributos

     String numeroCuenta;
     String titular;
     double saldo;

    //Metodo para depositar
    public void depositar (double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Estimado " + titular + ", se ha depositado $ " + cantidad + "en su numero de cuenta " + numeroCuenta + ".");
            System.out.println("Saldo actual: $" + saldo);
        }
    }

    //metodo para retirar
    public void retirar (double cantidad){
        if(cantidad >0 && cantidad <= saldo){
            saldo -= cantidad; 
            System.out.println("Estimado " + titular + ", se ha retirado $ " + cantidad + "en su numero de cuenta " + numeroCuenta + ".");
            System.out.println("Saldo restante: $ " + saldo);
        }else{
            System.out.println("Lo sentimos " + titular + ", no hay dinero suficiente. ");
        }
    }         
          //metodo para consultar saldo
    public void consultarSaldo(){
        System.out.println("Estado de cuenta");
        System.out.println("Titular: " + titular);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo Actual: $" + saldo);
        System.out.println("-------------");
    }
 }

  