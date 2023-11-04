package co.health.service.domain.agenda;

import java.util.Date;
import java.util.UUID;

public class AgendaDomain {
	private UUID id; 
	private String nombreProfesionalSalud;
	private String nombreServicio;
	private float precioServicio;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	
	private AgendaDomain(final UUID id, final String nombreProfesionalSalud, final String nombreServicio, final float precioServicio,
			final Date fechaInicio, final Date fechaFin) {
		setId(id);
		setNombreProfesionalSalud(nombreProfesionalSalud);
		setNombreServicio(nombreServicio);
		setPrecioServicio(precioServicio);
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
	}
	
	public static final AgendaDomain crear(final UUID id, final String nombreProfesionalSalud, final String nombreServicio, final float precioServicio,
			final Date fechaInicio, final Date fechaFin) {
		return new AgendaDomain(id, nombreProfesionalSalud, nombreServicio, precioServicio, fechaInicio, fechaFin);
	}

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setNombreProfesionalSalud(final String nombreProfesionalSalud) {
		this.nombreProfesionalSalud = nombreProfesionalSalud;
	}

	private final void setNombreServicio(final String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	private final void setPrecioServicio(final float precioServicio) {
		this.precioServicio = precioServicio;
	}

	private final void setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	private final void setFechaFin(final Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public final UUID getId() {
		return id;
	}

	public final String getNombreProfesionalSalud() {
		return nombreProfesionalSalud;
	}

	public final String getNombreServicio() {
		return nombreServicio;
	}

	public final float getPrecioServicio() {
		return precioServicio;
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}

	public final Date getFechaFin() {
		return fechaFin;
	}

	public final String getDescripcion() {
		return descripcion;
	}

}
