package io.github.lopesmateus.domain.controller;

import io.github.lopesmateus.domain.entity.Vaga;
import io.github.lopesmateus.domain.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Collection;

@RestController
@RequestMapping("/vagas")
public class vagaController {

    @Autowired
    VagaService vagaService;

    @GetMapping
    public ResponseEntity<Collection<Vaga>> buscatTodos() throws ServletException {

        try {
            Collection<Vaga> todasVagas = vagaService.consultar();

            if (todasVagas.size() > 0) {
                return new ResponseEntity<>(todasVagas, HttpStatus.OK);
            }else {
                return new
                        ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            throw new ServletException("Sistema indisponível, tente mais tarde.");
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Vaga> buscarId(@PathVariable int id) throws ServletException {

        try {
            Vaga vagaEncontrada = vagaService.consultarId(id);

            if (vagaEncontrada == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(vagaEncontrada, HttpStatus.OK);
            }
        } catch (Exception e) {
            throw new ServletException("Sistema indisponível, tente mais tarde.");
        }
    }

    @GetMapping(value = "/cargo/{cargo}")
    public ResponseEntity<Collection<Vaga>> buscarPorCargo(@PathVariable String cargo) throws ServletException {

        try {
            System.out.println(cargo);
            Collection<Vaga> todasVagas = vagaService.consultarPorCargo(cargo);

            if (todasVagas.size() > 0) {
                return new ResponseEntity<>(todasVagas,HttpStatus.OK);
            } else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            throw new ServletException("Sistema indisponível, tente mais tarde.");
        }
    }

    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> incluir(@RequestBody Vaga vaga) throws ServletException {

        try {
            Vaga vagaIncluida = vagaService.incluir(vaga);
            return new ResponseEntity<>(vagaIncluida,HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ServletException("Sistema indisponível, tente mais tarde.");
        }
    }

//    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> alterar(@RequestBody Vaga vaga) throws ServletException {
//
//        try {
//            Vaga vagaAlterada = vagaService.alterar(vaga);
//            return new ResponseEntity<>(vagaAlterada,HttpStatus.CREATED);
//        } catch (Exception e) {
//            throw new ServletException("Sistema indisponível, tente mais tarde.");
//        }
//    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Vaga> excluir (@PathVariable int id) throws ServletException {
        try {
            Vaga vagaEncontrada = vagaService.consultarId(id);
            if (vagaEncontrada == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                vagaService.excluir(vagaEncontrada);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (Exception e) {
            throw new ServletException("Sistema indisponível, tente mais tarde.");
        }
    }

}
