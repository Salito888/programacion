package co.edu.umanizales.model;

public class InstalacionInteractiva extends ObraDeArte {
    private final String descripcion;
    public InstalacionInteractiva(String nombre, String autor, int anio, double valor, String descripcion) {
        super(nombre, autor, anio, valor);
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}