public class Personaje {

    // Atributos
    String nombre;
    int nivel;

    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1; // Todos empiezan en nivel 1 por defecto
    }

    // Método para mostrar los datos
    public void mostrarInfo() {
        System.out.println("Heroe: " + nombre + " | Nivel: " + nivel);
    }
}