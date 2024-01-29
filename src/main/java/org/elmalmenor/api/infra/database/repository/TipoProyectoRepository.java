package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.TipoProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TipoProyectoRepository extends JpaRepository<TipoProyecto, Integer>, PagingAndSortingRepository<TipoProyecto, Integer> {

    Optional<TipoProyecto> findTipoProyectoByDescripcion(String descripcion);

}
