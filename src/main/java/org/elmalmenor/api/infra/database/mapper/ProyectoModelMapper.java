package org.elmalmenor.api.infra.database.mapper;

import org.elmalmenor.api.infra.database.model.Proyecto;
import org.elmalmenor.api.model.ProyectoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
@Service
public abstract class ProyectoModelMapper {

    @Mapping(target = "id", source = "idProyecto")
    @Mapping(target = "sumario", source = "sumario")
    @Mapping(target = "fecha", source = "fecha")
    @Mapping(target = "tipoProyecto", source = "tipoProyecto.descripcion")
    public abstract ProyectoModel map(Proyecto proyecto);
    protected Page<ProyectoModel> map(Page<Proyecto> politico) {
        return politico.map(this::map);
    }

}
