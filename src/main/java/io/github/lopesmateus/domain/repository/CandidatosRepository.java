package io.github.lopesmateus.domain.repository;

import io.github.lopesmateus.domain.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CandidatosRepository extends JpaRepository<Candidato, Integer> {

   public Candidato findById(int id);

   public Collection<Candidato> findByVagaId(int id);
}
