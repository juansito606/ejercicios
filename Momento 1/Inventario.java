public class Inventario {
    
    //Atributos

    String nombreProducto;
    String codigo;
    int cantidadStock;
    int precio;

    //metodo para stock
    
    public void masStock (int cantidad){
        if (cantidad > 0){
            cantidadStock += cantidad;
        }
        System.out.println(" El Producto "+ nombreProducto + " Con codigo " + codigo + " Ahora tiene en stock " + cantidadStock + "Y su valor de inventario es: $" + precio);
    }

    //metodo para reducir

    public void menoStock (int cantidad){
        if (cantidad > 0 && cantidad <= cantidadStock){
            cantidadStock -= cantidad;
        System.out.println ( " El producto " + nombreProducto + " Con codigo" + codigo + " Ahora tiene en stock "+ cantidadStock + "Y su valor de inventario es: $" + precio);
        }else{
            System.out.println("Lo sentimos no hay stock suficiente para " + nombreProducto);
        }
    
        
    }


    //metodo calcular inventario 

    public void mostrarInventario (){
        int total = precio * cantidadStock;
        System.out.println("---Verduleria Juanito---  ");
        System.out.println("Producto " + nombreProducto);
        System.out.println("Codigo  " + codigo );
        System.out.println("Stock " + cantidadStock);
        System.out.println("Su valor total es de " + total);

        
    }


}
