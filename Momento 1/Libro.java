public class Libro {
    String titulo;
    String autor;
    String ISBN;
    int numeroPaginas;
    boolean disponible;

    // metodo para prestar

    public void prestar (){
        if(disponible){
            disponible = false;
            System.out.println(" El libro " + titulo + " fue prestado ");
        }else{ 
            System.out.println(" El libro " + titulo + " no esta disponible ");
        }
    }

    // metodo para devolver
    public void devolver (){
        disponible = true;
        System.out.println(" El libro " + titulo + " fue devuelto ");
    }

    //metodo para verificar disponibilidad
    public void estaDisponible(){
        if(disponible){
            System.out.println(" El libro " + titulo + " esta disponible ");
        }else{
            System.out.println(" El libro " + titulo + " no esta disponible ");
        }
    }
    
}
