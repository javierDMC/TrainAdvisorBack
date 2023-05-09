package com.trainadvisor.app.rest.Controller;

import com.trainadvisor.app.rest.Model.Valoracion;
import com.trainadvisor.app.rest.Repository.ValoracionRepository;
import com.trainadvisor.app.rest.Service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ValoracionController {
    @Autowired
    private ValoracionRepository valoracionRepository;

    @Autowired
    private ValoracionService valoracionService;

    @GetMapping(value = "/")
    public String welcome(){
        return this.valoracionService.welcome();
    }

    @GetMapping(value = "/valoraciones")
    public List<Valoracion> getValoraciones(){
        return valoracionService.getValoraciones();
    }

    @GetMapping(value = "/valoracion")
    public Valoracion getValoracion(@PathVariable long id){
        return valoracionService.getValoracion(id);
    }

    @PostMapping(value = "/savevaloracion")
    public String saveValoraciones(@RequestBody Valoracion valoracion){
         return valoracionService.saveValoraciones(valoracion);
    }

    @PutMapping(value = "/updatevaloracion/{id}")
    public String udpateValoracion(@PathVariable long id, @RequestBody Valoracion valoracion){
         return valoracionService.udpateValoracion(id, valoracion);
    }

    @DeleteMapping(value = "/deletevaloracion/{id}")
    public String deleteValoracion(@PathVariable long id){
        return valoracionService.deleteValoracion(id);
    }
}
