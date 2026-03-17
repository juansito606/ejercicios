public class Hotel {

    //Atributos

    String nombreCliente;
    String fechaEntrada;
    String fechaSalida;
    int numeroHabitacion;
    boolean activa;

    //Metodo para reservar
    public void nuevaReserva () {
        activa = true;
        System.out.println(nombreCliente + " ha reservado la habitacion " + numeroHabitacion);
        System.out.println(" con fecha de entrada: " + fechaEntrada + " y fecha de salida: " + fechaSalida  );
    }

    //Metodo para cancelar reserva
    public void cancelarReserva () {
        if (activa == true){
            activa = false;
            System.out.println("RESERVA DE " + nombreCliente + "CANCELADA " );
        }else {
            System.out.println("No hay reserva activa para " + nombreCliente);
    
        }
    }
    // Metodo para consultar (Igual que todos los anteriores)
    public void consultarReserva() {
        System.out.println("\n=====================================");
        if (activa == true) {
            System.out.println("CLIENTE:    " + nombreCliente);
            System.out.println("HABITACION: #" + numeroHabitacion);
            System.out.println("ENTRADA:    " + fechaEntrada);
            System.out.println("SALIDA:     " + fechaSalida);
        } else {
            System.out.println("HABITACION #" + numeroHabitacion + " ESTA VACIA");
        }
        System.out.println("=====================================");   
  }

}  
