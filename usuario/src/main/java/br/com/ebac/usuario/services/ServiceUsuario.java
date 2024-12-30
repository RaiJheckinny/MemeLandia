package br.com.ebac.usuario.services;

import br.com.ebac.usuario.entities.Usuario;
import br.com.ebac.usuario.repositories.IRepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceUsuario {

    @Autowired
    private IRepositorioUsuario repositorioUsuario;

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }
}
