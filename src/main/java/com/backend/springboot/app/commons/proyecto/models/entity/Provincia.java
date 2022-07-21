package com.backend.springboot.app.commons.proyecto.models.entity;



import javax.persistence.*;


@Entity
@Table(name = "tcd_provincia")
public class Provincia {

    @Id
    @Column(name = "id_provincia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvincia;

    @Column(name = "no_provincia")
    private String nombre;

    public Long getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Long idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
