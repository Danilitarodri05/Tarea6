class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo");
    }

    public double calcularRadio() {
        return radio;
    }
}
