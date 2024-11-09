
class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una Línea");
    }

    public double getLargo() {
        return largo;
    }
}
