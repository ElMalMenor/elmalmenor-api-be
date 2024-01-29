package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Comision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ComisionRepository extends JpaRepository<Comision, Integer>, PagingAndSortingRepository<Comision, Integer> {

    Optional<Comision> findComisionByDescripcion(String descripcion);

}
