package br.com.ebac.usuario;

import br.com.ebac.usuario.entities.Usuario;
import br.com.ebac.usuario.services.ServiceUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TestUsuario {

    @Autowired
    ServiceUsuario service;

    @Test
    public void novoUsuario_HappyPath(){
        Usuario usuario = new Usuario();
        usuario.setNome("test");
        usuario.setEmail("test@admin.com");
        usuario.setDataCadastro(new Date(2024-12-26));

        Usuario usuarioBD = service.novoUsuario(usuario);

        Assertions.assertEquals(usuario.getNome(), usuarioBD.getNome());
        Assertions.assertEquals(usuario.getEmail(), usuarioBD.getEmail());
        Assertions.assertEquals(usuario.getDataCadastro(), usuarioBD.getDataCadastro());
    }

    @Test
    public void listaTodosUsuarios_HappyPath(){
        Usuario usuario = new Usuario();
        usuario.setNome("test");
        usuario.setEmail("test@admin.com");
        usuario.setDataCadastro(new Date(2024-12-26));
        service.novoUsuario(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("test2");
        usuario2.setEmail("test2@admin.com");
        usuario2.setDataCadastro(new Date(2024-12-26));
        service.novoUsuario(usuario2);

        List<Usuario> usuarios = Arrays.asList(usuario,usuario2);
        List<Usuario> usuariosBD = service.listaTodosUsuarios();

        Assertions.assertEquals(usuarios.get(0).getId(), usuariosBD.get(0).getId());
        Assertions.assertEquals(usuarios.get(1).getId(), usuariosBD.get(1).getId());
    }
}
