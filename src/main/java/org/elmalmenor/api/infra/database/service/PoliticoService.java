package org.elmalmenor.api.infra.database.service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.elmalmenor.api.infra.database.mapper.PoliticoModelMapper;
import org.elmalmenor.api.infra.database.repository.PoliticoRepository;
import org.elmalmenor.api.infra.database.spec.PoliticoCrudeable;
import org.elmalmenor.api.model.PoliticoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PoliticoService implements PoliticoCrudeable {

    private final PoliticoModelMapper politicoModelMapper;
    private final PoliticoRepository politicoRepository;

    @Override
    public Page<PoliticoModel> getAll(Pageable pageable) {
        return politicoRepository.findAll(pageable).map(politicoModelMapper::map);
    }

    @Override
    public PoliticoModel findById(Integer id) {
        return politicoRepository.findById(id)
                .map(politicoModelMapper::map)
                .orElseThrow(EntityNotFoundException::new);
    }
}
