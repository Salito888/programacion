package co.edu.umanizales.service;
import co.edu.umanizales.model.Escultura;
import co.edu.umanizales.model.InstalacionInteractiva;
import co.edu.umanizales.model.ObraDeArte;
import co.edu.umanizales.model.Pintura;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ObraService {
    private final List<ObraDeArte> obras = new ArrayList<>();
    public ObraService() {
        // Datos de prueba
        obras.add(new Pintura("La Noche Estrellada", "Vicent van Gogh", 1889, 100000, "Óleo"));
        obras.add(new Escultura("David", "Michelangelo", 1501, 200000, "Bronce"));
        obras.add(new InstalacionInteractiva("La Casa de los Espíritus", "Frida Kahlo", 1940, 300000,  "Vida, emoción, memoria"));
    }
    public List<ObraDeArte> getObras() {
        return obras;
    }

    public List<ObraDeArte> getObrasPorArtista(String autor) {
        List<ObraDeArte> resultado = new ArrayList<>();
        for (ObraDeArte obra : obras) {
            if (obra.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(obra);
            }
        }
        return resultado;
    }
    public List<ObraDeArte> getObrasPorAnio(int anio) {
        List<ObraDeArte> resultado = new ArrayList<>();
        for (ObraDeArte obra : obras) {
            if (obra.getAnio() == anio) {
                resultado.add(obra);

            }
            
        }
        return resultado;

    }


    public List<ObraDeArte> getObrasPorTipo(String tipo) {
        List<ObraDeArte> resultado = new ArrayList<>();
        for (ObraDeArte obra : obras) {
            if (obra.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                resultado.add(obra);


            }
        }
        return resultado;
    }
    public double getValorTotal() {
        double total = 0;
        for (ObraDeArte obra: obras) {
            total += obra.getValor();
        }
        return total;
    }


}
