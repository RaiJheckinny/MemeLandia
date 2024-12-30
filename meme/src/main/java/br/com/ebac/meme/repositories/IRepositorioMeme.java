package br.com.ebac.meme.repositories;

import br.com.ebac.meme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioMeme extends JpaRepository<Meme, Long> {
}
