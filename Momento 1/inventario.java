public class inventario {
    
    //Atributos

    String nombreProducto;
    String codigo;
    int cantidadStock;
    int precio;

    //metodo para stock
    
    public void masStock (int cantidad){
        cantidadStock = cantidadStock + cantidad;
        System.out.println(" El Producto "+ nombreProducto + " Con codigo " + codigo + " Ahora tiene en stock " + cantidadStock);

    }

    //metodo para reducir

    public void menoStock (int cantidad){
        cantidadStock = cantidadStock - cantidad;
        System.out.println ( " El producto " + nombreProducto + " Con codigo" + codigo + " Ahora tiene en stock "+ cantidadStock);
    }


    //metodo calcular inventario 

    public void calcularInventario (){
        int valor = precio*cantidadStock;
        System.out.println( "El producto " + nombreProducto + " Con codigo " + codigo + " tiene en stock " + cantidadStock + " y su valor es de " + valor);
        
    }


}
