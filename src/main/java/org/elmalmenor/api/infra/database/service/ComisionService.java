package org.elmalmenor.api.infra.database.service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.infra.database.mapper.ComisionModelMapper;
import org.elmalmenor.api.infra.database.repository.ComisionRepository;
import org.elmalmenor.api.infra.database.spec.ComisionCrudeable;
import org.elmalmenor.api.model.ComisionModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ComisionService implements ComisionCrudeable {

    private final ComisionModelMapper comisionModelMapper;
    private final ComisionRepository comisionRepository;

    @Override
    public Page<ComisionModel> getAll(Pageable pageable) {
        return comisionRepository.findAll(pageable).map(comisionModelMapper::map);
    }

    @Override
    public ComisionModel findById(Integer id) {
        return comisionRepository
                .findById(id)
                .map(comisionModelMapper::map)
                .orElseThrow(EntityNotFoundException::new);
    }
}
