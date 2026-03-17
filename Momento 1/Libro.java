public class Libro {
    String titulo;
    String autor;
    String ISBN;
    int numeroPaginas;
    boolean disponible = true; //Por defecto se crea disponible

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
        if (!disponible){
            disponible = true;
            System.out.println("Has devuelto " + titulo + " Gracias! ");
        }else {
            System.out.println("Libro ya estaba en biblioteca ");
        }
    }

    //metodo para verificar disponibilidad
    public void mostrarInfo(){
            String estado = disponible ? "Disponible " : "Prestado ";
            System.out.println("[" + estado +"] " + titulo + " - Autor " + autor + "-ISBN: " + ISBN + "-Paginas: " + numeroPaginas );
        
            
        }
    }
    

