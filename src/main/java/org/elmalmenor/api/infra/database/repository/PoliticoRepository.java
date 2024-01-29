package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Politico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PoliticoRepository extends JpaRepository<Politico, Integer>, PagingAndSortingRepository<Politico, Integer> {

    Optional<Politico> findPoliticoByNombreAndApellido(String nombre, String apellido);

}
