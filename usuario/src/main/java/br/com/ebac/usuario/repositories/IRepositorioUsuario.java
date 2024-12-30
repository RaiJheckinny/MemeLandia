package br.com.ebac.usuario.repositories;

import br.com.ebac.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioUsuario extends JpaRepository<Usuario, Long> {
}
