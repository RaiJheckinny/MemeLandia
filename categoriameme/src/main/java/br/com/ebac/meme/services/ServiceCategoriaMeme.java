package br.com.ebac.meme.services;

import br.com.ebac.meme.entities.CategoriaMeme;
import br.com.ebac.meme.repositories.IRepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceCategoriaMeme {

    @Autowired
    private IRepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
