package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.CargoComision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface CargoComisionRepository extends JpaRepository<CargoComision, Integer>, PagingAndSortingRepository<CargoComision, Integer> {

    Optional<CargoComision> findCargoComisionByDescripcion(String descripcion);

}
