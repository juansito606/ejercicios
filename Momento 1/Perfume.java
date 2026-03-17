public class Perfume {

    //Atributos

    String nombre;
    String marca;
    double capacidad;
    double precio;

    //Metodo para reducir cantidad(usar perfume)

    public void aplicarPerfume (double cantidad){
        if (cantidad > 0 && cantidad <= capacidad) {
            capacidad -= cantidad;
            System.out.println("Has usado  " + cantidad + " ml de " + nombre);
        }else {
            System.out.println("ERROR: no hay perfume suficiente");
        }
    }

    //Metodo para consultar
    public void consultarCantidadRestante() {
        System.out.println("[" + nombre + "de " + marca + "] - Quedan " + capacidad + " ml - Precio: $" + precio);

    }

    // Método para cambiar precio (Ajustar)
     public void ajustarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
            System.out.println(" Precio actualizado de " + nombre + ": $" + precio);
        }
     }    
  
}
