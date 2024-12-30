package br.com.ebac.meme.controllers;

import br.com.ebac.meme.entities.Meme;
import br.com.ebac.meme.services.MemeServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/memelandia/memes")
public class MemeController {
    @Autowired
    private MemeServico memeServico;

    @GetMapping
    public List<Meme> buscaMemes() {
        return memeServico.listaTodosMemes();
    }

    @PostMapping
    public Meme novoMeme(@RequestBody Meme meme) {
        return memeServico.novoMeme(meme);
    }

    @GetMapping("/memedodia")
    public Meme memeDoDia(){
        return memeServico.memeDoDia();
    }
}
