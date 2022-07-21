package com.backend.springboot.app.commons.proyecto.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="tcd_carrera")
public class Carrera {

    @Id
    @Column(name = "id_carrera")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrera;

    @Column(name = "no_carrera")
    private String nombre;

    @Column(name = "ab_carrera")
    private String abreviacion;

    public Long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

}
