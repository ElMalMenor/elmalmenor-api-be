package org.elmalmenor.api.infra.database.spec;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Crudeable<T, E> {

    Page<T> getAll(Pageable pageable);
    T findById(E id);

}
