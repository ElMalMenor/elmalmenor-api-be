package org.elmalmenor.api.application.service;

import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.application.spec.ComisionUseCase;
import org.elmalmenor.api.infra.database.spec.Crudeable;
import org.elmalmenor.api.model.ComisionModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComisionUseCaseService implements ComisionUseCase {

    private final Crudeable<ComisionModel, Integer> crudeable;

    @Override
    public Page<ComisionModel> getAll(Pageable pageable) {
        return crudeable.getAll(pageable);
    }

    @Override
    public ComisionModel getById(Integer id) {
        return crudeable.findById(id);
    }

}
