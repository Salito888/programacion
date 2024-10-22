package co.edu.umanizales.model;

public abstract class ObraDeArte {
    private final String nombre;
    private final String autor;
    private final int anio;
    private final double valor;

    public ObraDeArte(String nombre, String autor, int anio, double valor) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.valor = valor;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnio() {
        return anio;
    }
    public double getValor() {
        return valor;
    }
}
 
