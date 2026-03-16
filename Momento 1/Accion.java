public class Accion {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.numeroCuenta="001";
        cuenta1.titular="Juan";

        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.consultarSaldo();
    }
}
