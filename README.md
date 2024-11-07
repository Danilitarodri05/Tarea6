# Tarea6
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

