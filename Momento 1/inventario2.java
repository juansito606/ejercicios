public class inventario2 {
    public static void main(String[] args) {
        
        inventario producto1 = new inventario();
        inventario producto2 = new inventario();

        producto1.nombreProducto = "Banano";
        producto1.codigo = "123";
        producto1.cantidadStock = 4;
        producto1.precio = 500;


        producto1.nombreProducto = "Pera";
        producto1.codigo = "456";
        producto1.cantidadStock = 6;
        producto1.precio = 800;


        producto1.masStock(2);
        producto1.menoStock(1);
        producto1.calcularInventario();

        producto2.masStock(3);
        producto2.menoStock(2);
        producto2.calcularInventario();






    }
    
}
;