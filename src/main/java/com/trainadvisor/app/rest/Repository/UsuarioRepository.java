package com.trainadvisor.app.rest.Repository;

import com.trainadvisor.app.rest.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
