package io.github.lopesmateus.domain.controller;

import io.github.lopesmateus.domain.entity.Candidato;
import io.github.lopesmateus.domain.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Collection;

@RestController
public class CandidadtoController {

    @Autowired
    CandidatoService candidatoService;

    @RequestMapping(method = RequestMethod.GET, value = "/candidatos")
    public ResponseEntity<Collection<Candidato>> buscarTodos() throws ServletException {
        try {
            Collection<Candidato> todosCandidatos = candidatoService.consultar();
                if (todosCandidatos.size() > 0) {
                    return new ResponseEntity<>(todosCandidatos, HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
            throw new ServletException("Sistema indiponível. tente mais tarde.");
        }
    }


    @RequestMapping(method = RequestMethod.GET, value = "/candidatos/{id}")
    public ResponseEntity<Candidato> buscarId(@PathVariable int id) throws ServletException {
        try {
            Candidato candidatoEncontrado = candidatoService.consultarId(id);
            if (candidatoEncontrado == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(candidatoEncontrado, HttpStatus.OK);
            }
        } catch (Exception e) {
            throw new ServletException("Sistema indiponível. tente mais tarde.");
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "vagas/{id}/candidatos")
    public ResponseEntity<Collection<Candidato>> buscarPorVaga(@PathVariable int id) throws ServletException {
        try {
            Collection<Candidato> todosCandidatos = candidatoService.consultarPorVaga(id);
            if (todosCandidatos.size() > 0) {
                return new ResponseEntity<>(todosCandidatos, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            throw new ServletException("Sistema indiponível. tente mais tarde.");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/candidatos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> candidatar (@RequestBody Candidato candidato) throws ServletException {
        try {
            Candidato candidatoIncluido = candidatoService.incluir((candidato));
            return new ResponseEntity<>(candidatoIncluido, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ServletException("Sistema indiponível. tente mais tarde.");
        }
    }
}
