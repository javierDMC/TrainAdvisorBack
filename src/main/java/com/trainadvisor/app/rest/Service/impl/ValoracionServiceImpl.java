package com.trainadvisor.app.rest.Service.impl;

import com.trainadvisor.app.rest.Model.Valoracion;
import com.trainadvisor.app.rest.Repository.ValoracionRepository;
import com.trainadvisor.app.rest.Service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ValoracionServiceImpl implements ValoracionService {

    @Autowired
    private ValoracionRepository valoracionRepository;

    @Override
    public String welcome() {
        return "BIENVENIDO A TRAIN ADVISOR";
    }

    @Override
    public List<Valoracion> getValoraciones(){
        return valoracionRepository.findAll();
    }

    @Override
    public Valoracion getValoracion(@PathVariable long id) {
        return valoracionRepository.getReferenceById(id);
    }

    @Override
    public String saveValoraciones(@RequestBody Valoracion valoracion){
        valoracionRepository.save(valoracion);
        return "Save Valoracion";
    }

    @Override
    public String udpateValoracion(@PathVariable long id, @RequestBody Valoracion valoracion){
        Valoracion updatedValoracion = valoracionRepository.findById(id).get();
        updatedValoracion.setOrigen(valoracion.getOrigen());
        updatedValoracion.setDestino(valoracion.getDestino());
        updatedValoracion.setCompania(valoracion.getCompania());
        updatedValoracion.setServicio(valoracion.getServicio());
        updatedValoracion.setFecha(valoracion.getFecha());
        updatedValoracion.setHoraSalida(valoracion.getHoraSalida());
        updatedValoracion.setHoraLlegada(valoracion.getHoraLlegada());
        updatedValoracion.setPuntuacion(valoracion.getPuntuacion());
        updatedValoracion.setComentario(valoracion.getComentario());
        valoracionRepository.save(updatedValoracion);
        return "Updated valoracion";
    }

    @Override
    public String deleteValoracion(@PathVariable long id){
        Valoracion deleteValoracion = valoracionRepository.findById(id).get();
        valoracionRepository.delete(deleteValoracion);
        return "Delete valoracion";
    }
}
