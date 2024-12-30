package br.com.ebac.meme.services;

import br.com.ebac.meme.entities.Meme;
import br.com.ebac.meme.repositories.IRepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemeServico {
    @Autowired
    private IRepositorioMeme IRepositorioMeme;

    public Meme novoMeme(Meme meme) {
        return IRepositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return IRepositorioMeme.findAll();
    }
}
