public class CuentaBancaria {
    //Atributos

     String numeroCuenta;
     String titular;
     double saldo;

    //Metodo para depositar
    public void depositar (double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Deposito aprobado. Nuevo saldo: $" + saldo);
        }
    }

    //metodo para retirar
    public void retirar (double cantidad){
        if(cantidad >0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo Restante: $" + saldo);
        }else{
            System.out.println("No hay dinero suficiente para retirar");
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

  