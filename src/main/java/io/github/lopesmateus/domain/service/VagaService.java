package io.github.lopesmateus.domain.service;


import io.github.lopesmateus.domain.entity.Vaga;
import io.github.lopesmateus.domain.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VagaService {

    @Autowired
    VagasRepository vagasRepository;

    public Collection<Vaga> consultar() {
        return vagasRepository.findAll();
    }

    public Vaga consultarId(int id) {
        return vagasRepository.findById(id);
    }

    public Vaga incluir(Vaga vaga) {
        return vagasRepository.save(vaga);
    }

    public Vaga alterar (Vaga vaga) {
        return vagasRepository.save(vaga);
    }

    public void excluir (Vaga vaga) {
        vagasRepository.delete(vaga);
    }

    public Collection<Vaga> consultarPorCargo(String cargo) {
        return vagasRepository.buscarPorCargo(cargo);
    }


}
