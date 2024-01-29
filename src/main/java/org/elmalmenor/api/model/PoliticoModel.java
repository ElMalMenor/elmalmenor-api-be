package org.elmalmenor.api.model;

import lombok.Data;

import java.util.Date;

@Data
public class PoliticoModel {

    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String profesion;
    private Date nacimiento;
    private String imagenUrl;

    private String bloque;
    private String distrito;
    private String funcion;

    private Date periodoInicio;
    private Date periodoFin;

    private Integer numeroDeProyectos;
    private Integer numeroDeComisiones;

}
