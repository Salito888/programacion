package co.edu.umanizales.controller;
import co.edu.umanizales.model.ObraDeArte;
import co.edu.umanizales.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/obras")
public class ObraController {

    @Autowired
    private ObraService obraService;
    @GetMapping
    public List<ObraDeArte> getObras() {
        return obraService.getObras();
    }


    @GetMapping("/artista/{nombreAutor}")
    public List<ObraDeArte> getObrasPorArtista(@PathVariable String nombreAutor) {
        return obraService.getObrasPorArtista(nombreAutor);
    }
    @GetMapping("/anio/{anio}")
    public List<ObraDeArte> getObrasPorAnio(@PathVariable int anio) {
        return obraService.getObrasPorAnio(anio);
    }
    @GetMapping("/tipo/{tipo}")
    public List<ObraDeArte> getObrasPorTipo(@PathVariable String tipo) {
        return obraService.getObrasPorTipo(tipo);

    }
    @GetMapping("/valor-total")
    public double getValorTotal() {
        return obraService.getValorTotal();
    }
}

