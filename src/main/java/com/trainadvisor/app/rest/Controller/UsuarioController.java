package com.trainadvisor.app.rest.Controller;

import com.trainadvisor.app.rest.Model.Usuario;
import com.trainadvisor.app.rest.Repository.UsuarioRepository;
import com.trainadvisor.app.rest.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @GetMapping(value = "/usuario/{id}")
    public List<Usuario> getUsuario(@PathVariable long id){
        return usuarioService.getUsuario(id);
    }

    @RequestMapping(value = "/saveusuario", produces = "application/json", method = RequestMethod.POST)
    public String saveUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @RequestMapping(value = "/usuario/{id}/updatepassword", produces = "application/json", method = RequestMethod.PUT)
    public String updatePassword(@PathVariable long id, @RequestBody String password){
        return usuarioService.updatePassword(id, password);
    }

    @RequestMapping(value = "/usuario/{id}/delete", produces = "application/json", method = RequestMethod.DELETE)
    public String deleteUsuario(@PathVariable long id){
        return usuarioService.deleteUsuario(id);
    }
}
