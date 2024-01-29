package org.elmalmenor.api.application.service;

import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.application.spec.PoliticoUseCase;
import org.elmalmenor.api.infra.database.spec.Crudeable;
import org.elmalmenor.api.model.PoliticoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoliticoUseCaseService implements PoliticoUseCase {

    private final Crudeable<PoliticoModel, Integer> crudeable;

    @Override
    public Page<PoliticoModel> getAll(Pageable pageable) {
        return crudeable.getAll(pageable);
    }

    @Override
    public PoliticoModel getById(Integer id) {
        return crudeable.findById(id);
    }

}
