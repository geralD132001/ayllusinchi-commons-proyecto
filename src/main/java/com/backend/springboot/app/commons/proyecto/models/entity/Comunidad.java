package com.backend.springboot.app.commons.proyecto.models.entity;


import javax.persistence.*;


@Entity
@Table(name = "tcd_comunidad")
public class Comunidad {

    @Id
    @Column(name = "id_comunidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComunidad;

    @Column(name = "no_comunidad")
    private String nombre;


    public Long getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(Long idComunidad) {
        this.idComunidad = idComunidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
