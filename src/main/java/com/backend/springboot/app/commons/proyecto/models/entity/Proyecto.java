package com.backend.springboot.app.commons.proyecto.models.entity;

// import com.backend.springboot.app.commons.sedes.models.entity.Facultad;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name ="tma_proyecto")
public class Proyecto implements Serializable {

	@Id
    @Column(name = "id_proyecto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;

    @Column(name = "no_proyecto")
    private String nombre;

    @Column(name = "re_proyecto")
    private String resenia;

    @Column(name = "og_proyecto")
    private String objetivoGeneral;

    @Column(name = "oe_proyecto")
    private String objetivoEspecifico;

	@ManyToOne
	@JoinColumn(name = "id_departamento")
	// @JsonBackReference
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name = "id_provincia")
	// @JsonBackReference
	private Provincia provincia;

	@ManyToOne
	@JoinColumn(name = "id_distrito")
	// @JsonBackReference
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "id_comunidad")
	// @JsonBackReference
	private Comunidad comunidad;

	// @Column(name = "id_facultad")
	// private Long facultad;

	public Long getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Long idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}


	public String getObjetivoGeneral() {
		return objetivoGeneral;
	}

	public void setObjetivoGeneral(String objetivoGeneral) {
		this.objetivoGeneral = objetivoGeneral;
	}

	public String getObjetivoEspecifico() {
		return objetivoEspecifico;
	}

	public void setObjetivoEspecifico(String objetivoEspecifico) {
		this.objetivoEspecifico = objetivoEspecifico;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Comunidad getComunidad() {
		return comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

/* public Long getFacultad() {
		return facultad;
	}

	public void setFacultad(Long facultad) {
		this.facultad = facultad;
	}
	 */

	private static final long serialVersionUID = 1L;

}
