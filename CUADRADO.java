class Cuadrado extends Formas {
    private double area;

    public Cuadrado(double area) {
        this.area = area;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }

    public double calcularArea() {
        return area;
    }
}
