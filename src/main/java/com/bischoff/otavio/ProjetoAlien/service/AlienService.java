package com.bischoff.otavio.ProjetoAlien.service;

import com.bischoff.otavio.ProjetoAlien.repository.AlienRepository;
import model.AlienModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {
    //declara a dependencia do repositorio
    private final AlienRepository alienRepository;

    //construtor(injecoa de dependencia via construtor)
    public AlienService(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }
    //listar aliens
    public List<AlienModel> ListarAliens(){
        return this.alienRepository.lerAliensArquivo();
    }
}
