public class Libromain {
    
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.titulo= "Don quijote";
        libro1.autor = "Cervantes";
        libro1.ISBN = "111";
        libro1.numeroPaginas = 500;
        libro1.disponible = true;

        libro2.titulo = "El principito";
        libro2.autor = "Saint Exupery";
        libro2.ISBN = "222";
        libro2.numeroPaginas = 120;
        libro2.disponible = true;

        libro1.estaDisponible();
        libro1.prestar();
        libro1.devolver();
        libro1.estaDisponible();

        
        libro2.estaDisponible();
        libro2.prestar();
        libro2.devolver();
        libro2.estaDisponible();
    }
}
