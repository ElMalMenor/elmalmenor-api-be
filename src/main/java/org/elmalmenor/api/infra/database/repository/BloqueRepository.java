package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Bloque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface BloqueRepository extends JpaRepository<Bloque, Integer>, PagingAndSortingRepository<Bloque, Integer> {

    Optional<Bloque> findBloqueByDescripcion(String descripcion);

}
