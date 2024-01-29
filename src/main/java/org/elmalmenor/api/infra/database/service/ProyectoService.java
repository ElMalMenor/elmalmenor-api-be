package org.elmalmenor.api.infra.database.service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.infra.database.mapper.ProyectoModelMapper;
import org.elmalmenor.api.infra.database.repository.ProyectoRepository;
import org.elmalmenor.api.infra.database.spec.ProyectoCrudeable;
import org.elmalmenor.api.model.ProyectoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProyectoService implements ProyectoCrudeable {

    private final ProyectoModelMapper proyectoModelMapper;
    private final ProyectoRepository proyectoRepository;

    @Override
    public Page<ProyectoModel> getAll(Pageable pageable) {
        return proyectoRepository.findAll(pageable).map(proyectoModelMapper::map);
    }

    @Override
    public ProyectoModel findById(String id) {
        return proyectoRepository
                .findById(id)
                .map(proyectoModelMapper::map)
                .orElseThrow(EntityNotFoundException::new);
    }
}
