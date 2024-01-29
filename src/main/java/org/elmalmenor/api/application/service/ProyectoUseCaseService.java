package org.elmalmenor.api.application.service;

import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.application.spec.ProyectoUseCase;
import org.elmalmenor.api.infra.database.spec.Crudeable;
import org.elmalmenor.api.model.ProyectoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProyectoUseCaseService implements ProyectoUseCase {

    private final Crudeable<ProyectoModel, String> crudeable;

    @Override
    public Page<ProyectoModel> getAll(Pageable pageable) {
        return crudeable.getAll(pageable);
    }

    @Override
    public ProyectoModel getById(String id) {
        return crudeable.findById(id);
    }

}
