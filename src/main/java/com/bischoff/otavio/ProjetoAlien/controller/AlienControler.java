package com.bischoff.otavio.ProjetoAlien.controller;
import com.bischoff.otavio.ProjetoAlien.service.AlienService;
import model.AlienModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//classe controlada rest
@RestController
@RequestMapping("/aliens")
public class AlienControler {

    private final AlienService alienService;

    //construtor
    public AlienControler(AlienService alienService) {
        this.alienService = alienService;
    }

    //mapeia o metodo para requisicao
    @GetMapping
    public List<AlienModel> getAliens(){
        //chama o servico e retorna a lista de aliens
        return  alienService.ListarAliens();
    }


}
