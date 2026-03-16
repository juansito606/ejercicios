public class CuentaBancaria {
    //Atributos

     String numeroCuenta;
     String titular;
     double saldo;

    //Metodo para depositar
    public void depositar (double cantidad){
        saldo = saldo + cantidad;
        System.out.println("El titular " + titular + " deposito " + cantidad);
    }

    //metodo para retirar
    public void retirar (double cantidad){
        if(cantidad <= saldo){
            saldo= saldo - cantidad;
            System.out.println("El titular " + titular + " retiro: " + cantidad);
        }else{
            System.out.println("No hay dinero suficiente para retirar");
        }
    }         
          //metodo para consultar saldo
    public void consultarSaldo(){
        System.out.println("El saldo actual de " + titular + " es: " + saldo);
    }
 }

  