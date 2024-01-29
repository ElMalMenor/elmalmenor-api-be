package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface DistritoRepository extends JpaRepository<Distrito, Integer>, PagingAndSortingRepository<Distrito, Integer> {

    Optional<Distrito> findDistritoByDescripcion(String descripcion);

}
