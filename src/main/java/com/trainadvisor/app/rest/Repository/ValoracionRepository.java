package com.trainadvisor.app.rest.Repository;

import com.trainadvisor.app.rest.Model.Usuario;
import com.trainadvisor.app.rest.Model.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ValoracionRepository extends JpaRepository<Valoracion, Long> {

    public List<Valoracion> findByUsuario(Usuario usuario);

}
