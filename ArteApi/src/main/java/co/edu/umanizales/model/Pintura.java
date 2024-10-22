package co.edu.umanizales.model;

public class Pintura extends ObraDeArte {
    private final String tecnica;
    public Pintura(String nombre, String autor, int anio, double valor, String tecnica) {
        super(nombre, autor, anio, valor);
        this.tecnica = tecnica;
    }
    public String getTecnica() {
        return tecnica;
    }

}
