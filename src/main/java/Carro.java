public abstract class Carro {
    protected Carroceria carroceria;

    public Carro(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }
}
