package br.com.ebac.usuario.controllers;

import br.com.ebac.usuario.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.ebac.usuario.services.ServiceUsuario;

import java.util.List;

@RestController
@RequestMapping("/memelandia/usuarios")
public class ControllerUsuario {
    @Autowired
    private ServiceUsuario serviceUsuario;

    @GetMapping
    public List<Usuario> buscaUsuarios() {
        return serviceUsuario.listaTodosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return serviceUsuario.novoUsuario(usuario);
    }
}
