package org.elmalmenor.api.model;

import lombok.Data;

import java.util.Date;

@Data
public class ProyectoModel {

    private String id;
    private String tipoProyecto;
    private String sumario;
    private Date fecha;

}
