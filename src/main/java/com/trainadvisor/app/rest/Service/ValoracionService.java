package com.trainadvisor.app.rest.Service;

import com.trainadvisor.app.rest.Model.Valoracion;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface ValoracionService {

    public String welcome();

    public List<Valoracion> getValoraciones();

    public Valoracion getValoracion(@PathVariable long id);

    public String saveValoraciones(@RequestBody Valoracion valoracion);

    public String udpateValoracion(@PathVariable long id, @RequestBody Valoracion valoracion);

    public String deleteValoracion(@PathVariable long id);

}
