package io.github.lopesmateus;

import io.github.lopesmateus.domain.entity.Candidato;
import io.github.lopesmateus.domain.entity.Vaga;
import io.github.lopesmateus.domain.repository.CandidatosRepository;
import io.github.lopesmateus.domain.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VagasApplication {

//    @Bean
//    public CommandLineRunner init(
//            @Autowired CandidatosRepository candidatosRepository,
//            @Autowired VagasRepository vagasRepository
//            ) {
//      return args -> {
//          System.out.println("Salvando Candidato");
//          Candidato candidato = new Candidato();
//          candidato.setNome("Mateus");
//          candidato.setCpf("325135903413");
//          candidato.setEmail("mateus@gmail.com");
//          candidato.setAreaAtual("TI");
//          candidato.setCargoAtual("Desenvolvedor Jr.");
//
//          candidatosRepository.save(candidato);
//
//          System.out.println("Salvando Vaga");
//          Vaga vaga = new Vaga();
//          vaga.setCargo("Analista Jr.");
//          vaga.setDescricaoVaga("Descricao da vaga vai aqui");
//          vaga.setLocacaoVaga("Matriz");
//          vaga.setTipoVaga("Interna");
//          vaga.setDtVencimentoVaga("27-07-2020");
//          vaga.setSituacaoVaga("Aberta");
//
//          vagasRepository.save(vaga);
//
//          System.out.println("Completo");
//      };
//    }

    public static void main(String[] args) {
        SpringApplication.run(VagasApplication.class, args);
    }
}

