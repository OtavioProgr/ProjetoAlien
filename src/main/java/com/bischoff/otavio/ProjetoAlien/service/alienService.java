package com.bischoff.otavio.ProjetoAlien.service;

import com.bischoff.otavio.ProjetoAlien.repository.AlienRepository;
import org.springframework.stereotype.Service;

@Service
public class alienService {
    //declara a dependencia do repositorio
    private final AlienRepository alienRepository;

    //construtor(injecoa de dependencia via construtor)
    public alienService(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }
    //listar aliens
    public List<Alien> ListarAliens(){
        return AlienRepository.lerAliensArquivo();
    }
}
