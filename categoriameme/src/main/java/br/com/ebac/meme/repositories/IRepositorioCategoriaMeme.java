package br.com.ebac.meme.repositories;

import br.com.ebac.meme.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
