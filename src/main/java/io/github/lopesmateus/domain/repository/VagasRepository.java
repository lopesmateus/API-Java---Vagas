package io.github.lopesmateus.domain.repository;

import io.github.lopesmateus.domain.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VagasRepository extends JpaRepository<Vaga, Integer> {

    public Vaga findById(int id);

    @Query(" select v from Vaga v where v.cargo = :cargo")
    List<Vaga> buscarPorCargo(@Param("cargo") String cargo);

}
