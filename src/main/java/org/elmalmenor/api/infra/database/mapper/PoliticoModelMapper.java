package org.elmalmenor.api.infra.database.mapper;

import jakarta.persistence.EntityNotFoundException;
import org.elmalmenor.api.infra.database.model.Politico;
import org.elmalmenor.api.infra.database.model.PoliticoFuncion;
import org.elmalmenor.api.model.PoliticoModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring")
@Service
public abstract class PoliticoModelMapper {

    @Mapping(target = "id", source = "idLegislador")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "apellido", source = "apellido")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "profesion", source = "profesion")
    @Mapping(target = "nacimiento", source = "nacimiento")
    @Mapping(target = "imagenUrl", source = "imagenUrl")
    @Mapping(target = "bloque", source = "bloque.descripcion")
    @Mapping(target = "distrito", source = "distrito.descripcion")
    @Mapping(target = "funcion", expression = "java(getActiveFuncion(politico).getFuncion().getDescripcion())")
    @Mapping(target = "periodoInicio", expression = "java(getActiveFuncion(politico).getPeriodoInicio())")
    @Mapping(target = "periodoFin", expression = "java(getActiveFuncion(politico).getPeriodoFin())")
    @Mapping(target = "numeroDeProyectos", expression = "java(politico.getProyectos().size())")
    @Mapping(target = "numeroDeComisiones", expression = "java(politico.getComisiones().size())")
    public abstract PoliticoModel map(Politico politico);

    protected Page<PoliticoModel> map(Page<Politico> politico) {
        return politico.map(this::map);
    }
    public abstract List<PoliticoModel> map(List<Politico> politicos);

    protected PoliticoFuncion getActiveFuncion(Politico politico) {

        return politico.getFunciones().stream()
                .filter(PoliticoFuncion::getActiva)
                .findFirst()
                .orElseThrow(EntityNotFoundException::new);

    }

}
