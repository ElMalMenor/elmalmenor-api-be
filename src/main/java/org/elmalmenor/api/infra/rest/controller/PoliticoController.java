package org.elmalmenor.api.infra.rest.controller;

import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.application.service.PoliticoUseCaseService;
import org.elmalmenor.api.application.spec.PoliticoUseCase;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1/politicos")
@RequiredArgsConstructor
public class PoliticoController {

    private final PoliticoUseCase politicoUseCase;

    @GetMapping()
    public ResponseEntity<?> getAllPoliticos(Pageable pageable) {
        return new ResponseEntity<>(politicoUseCase.getAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getAllPoliticos(@PathVariable Integer id) {
        return new ResponseEntity<>(politicoUseCase.getById(id), HttpStatus.OK);
    }

}
