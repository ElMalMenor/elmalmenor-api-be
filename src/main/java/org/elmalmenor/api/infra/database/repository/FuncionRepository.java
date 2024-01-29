package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface FuncionRepository extends JpaRepository<Funcion, Integer>, PagingAndSortingRepository<Funcion, Integer> {

    Optional<Funcion> findFuncionByDescripcion(String descripcion);

}
