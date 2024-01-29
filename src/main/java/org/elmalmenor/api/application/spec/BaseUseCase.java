package org.elmalmenor.api.application.spec;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseUseCase<T, E> {

    Page<T> getAll(Pageable pageable);
    T getById(E id);


}
