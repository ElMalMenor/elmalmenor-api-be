package org.elmalmenor.api.infra.rest.controller;

import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.application.spec.ProyectoUseCase;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/proyectos")
@RequiredArgsConstructor
public class ProyectoController {

    private final ProyectoUseCase proyectoUseCase;

    @GetMapping()
    public ResponseEntity<?> getAllPoliticos(Pageable pageable) {
        return new ResponseEntity<>(proyectoUseCase.getAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<?> getAllPoliticos(@PathVariable String id) {
        return new ResponseEntity<>(proyectoUseCase.getById(id), HttpStatus.OK);
    }

}
