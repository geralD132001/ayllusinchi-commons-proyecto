package com.backend.springboot.app.commons.proyecto.models.entity;
import javax.persistence.*;

@Entity
@Table(name = "tcd_programa")
public class Programa {

    @Id
    @Column(name = "id_programa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrograma;

    @Column(name = "no_programa")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_proyecto")
    // @JsonBackReference
    private Proyecto proyecto;


    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
