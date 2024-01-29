package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.TipoComision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TipoComisionRepository extends JpaRepository<TipoComision, Integer>, PagingAndSortingRepository<TipoComision, Integer> {

    Optional<TipoComision> findTipoComisionByDescripcion(String descripcion);

}
