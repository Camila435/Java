class Rectangulo extends Figura implements Dibujable {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("🖼️ Dibujando un Rectángulo de " + base + "x" + altura);
    }
}