package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PartidoRepository extends JpaRepository<Partido, Integer>, PagingAndSortingRepository<Partido, Integer> {
}
