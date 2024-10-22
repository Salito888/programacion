package co.edu.umanizales.model;

public class Escultura extends ObraDeArte {
    private final String material;
    public Escultura(String nombre, String autor, int anio, double valor, String material) {
        super(nombre, autor, anio, valor);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

}
