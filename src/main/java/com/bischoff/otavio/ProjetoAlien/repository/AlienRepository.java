package com.bischoff.otavio.ProjetoAlien.repository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class AlienRepository {


    public List<Alien> lerAliensArquivo(){
        //to criando um try cath pois ao ler o arquivo pode dar exception logo, precaver e uma boa opcao
        try {
            //Files.lines (algo do Stream) que me permite ler cada lines(linha) do Files(arquivo) citado como se fosse uma String para que eu possa tratar
            return Files.lines(Paths.get("/Users/aluno/Downloads/ProjetoAlien/src/main/java/com/bischoff/otavio/ProjetoAlien/repository/Aliens.txt"))
                    .map(ALien::new)//para cada linha, cria um novo alien
                    .collect(Collectors.toList());//junta todos os objetos Alien em uma lista

        } catch (Exception e) {
            //em caso de exception, faca isso
            throw new RuntimeException("Erro ao ler o arquivo");
        }
    }

}
