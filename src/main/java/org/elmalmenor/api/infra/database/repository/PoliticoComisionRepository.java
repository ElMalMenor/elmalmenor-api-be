package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.PoliticoComision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PoliticoComisionRepository extends JpaRepository<PoliticoComision, Integer>, PagingAndSortingRepository<PoliticoComision, Integer> {
}
