class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triángulo");
    }

    public double calcularArea() {
        
        return 0.5 * angulo * angulo;
    }
}
