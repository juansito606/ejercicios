public class CuentaBancaria {
    //Atributos
    String numeroCuenta;
    String titular;
    double saldo;

    //Metodo para depositar
    public void depositar (double cantidad){
        saldo = saldo + cantidad;
        System.out.println("Se depositaron:"+ cantidad);
    }

    //metodo para retirar
    public void retirar (double cantidad){
        saldo = saldo - cantidad;
        System.out.println("Se retiraron:"+ cantidad);
    }

    //metodo para consultar saldo
    public void consultarSaldo(){
        System.out.println("El saldo actual es:" + saldo);
    }
}
