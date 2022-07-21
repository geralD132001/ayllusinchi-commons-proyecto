package com.backend.springboot.app.commons.proyecto.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "tcd_distrito")
public class Distrito {

    @Id
    @Column(name = "id_distrito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDistrito;

    @Column(name = "no_distrito")
    private String nombre;

    @Column(name = "co_distrito")
    private String codigoPostal;

    public Long getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
