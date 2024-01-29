package org.elmalmenor.api.infra.database.repository;

import org.elmalmenor.api.infra.database.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, String>, PagingAndSortingRepository<Proyecto, String> {


}
