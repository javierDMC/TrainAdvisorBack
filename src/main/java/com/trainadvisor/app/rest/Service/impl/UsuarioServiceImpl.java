package com.trainadvisor.app.rest.Service.impl;


import com.trainadvisor.app.rest.Model.Usuario;
import com.trainadvisor.app.rest.Repository.UsuarioRepository;
import com.trainadvisor.app.rest.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> getUsuario(long id) {
        return usuarioRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public String saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "save usuario";
    }

    @Override
    public String getPassword(String usuario) {
        return null;
    }

    @Override
    public String savePassword(String password) {
        return "save password";
    }

    @Override
    public String updatePassword(@PathVariable long id, @RequestBody String password) {
        Usuario updatePassword = usuarioRepository.findById(id).get();
        updatePassword.setPassword(password);
        usuarioRepository.save(updatePassword);
        return "Update password";
    }

    @Override
    public String deleteUsuario(long id) {
        Usuario deleteUsuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(deleteUsuario);
        return "Delete user";
    }
}
