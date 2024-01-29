package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.PoliticoFuncion;
import org.elmalmenor.api.infra.database.model.embedded.PoliticoFuncionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PoliticoFuncionReposistory extends JpaRepository<PoliticoFuncion, PoliticoFuncionId>, PagingAndSortingRepository<PoliticoFuncion, PoliticoFuncionId> {
}
