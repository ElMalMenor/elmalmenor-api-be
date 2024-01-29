package org.elmalmenor.api.infra.database.mapper;

import org.elmalmenor.api.infra.database.model.Comision;
import org.elmalmenor.api.model.ComisionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
@Service
public abstract class ComisionModelMapper {

    @Mapping(target = "id", source = "idComision")
    @Mapping(target = "nombre", source = "nombre")
    public abstract ComisionModel map(Comision comision);
    protected Page<ComisionModel> map(Page<Comision> comision) {
        return comision.map(this::map);
    }

}
