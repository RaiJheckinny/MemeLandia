package br.com.ebac.meme.controllers;

import br.com.ebac.meme.entities.CategoriaMeme;
import br.com.ebac.meme.services.ServiceCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia/categorias")
public class ControllerCategoriaMeme {
    @Autowired
    private ServiceCategoriaMeme service;

    @GetMapping
    public List<CategoriaMeme> buscaCategorias() {
        return service.listaTodasCategorias();
    }

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return service.novaCategoriaMeme(categoriaMeme);
    }
}
