package io.github.lopesmateus.domain.service;

import io.github.lopesmateus.domain.entity.Candidato;
import io.github.lopesmateus.domain.repository.CandidatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CandidatoService {

    @Autowired
    CandidatosRepository candidatosRepository;

    public Collection<Candidato> consultar() {
        return candidatosRepository.findAll();
    }

    public Candidato consultarId (int id) {
        return candidatosRepository.findById(id);
    }

    public Collection<Candidato> consultarPorVaga(int id) {
        return candidatosRepository.findByVagaId(id);
    }

    public Candidato incluir (Candidato candidato) {
        return candidatosRepository.save(candidato);
    }
}
