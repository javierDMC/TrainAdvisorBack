package com.trainadvisor.app.rest.Service;

import com.trainadvisor.app.rest.Model.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface UsuarioService {

    public List<Usuario> getUsuarios();

    public List<Usuario> getUsuario(@PathVariable long id);

    public String saveUsuario(@RequestBody Usuario usuario);

    public String getPassword(@RequestBody String usuario);

    public String savePassword(@RequestBody String password);

    public String updatePassword(@PathVariable long id,@RequestBody String password);

    public String deleteUsuario(@PathVariable long id);


}
