package co.health.service.domain.cita.support;

import java.sql.Date;

public class FechaCitaDomain {
	private Date fechaInicio;
	private Date fechaFin;
	
	
	private FechaCitaDomain(final Date fechaInicio, final Date fechaFin) {
		setFechaInicio(fechaInicio);
		setFechaFin(fechaFin);
	}
	
	public static final FechaCitaDomain crear(final Date fechaInicio, final Date fechaFin) {
		return new FechaCitaDomain(fechaInicio, fechaFin);
	}

	public final Date getFechaInicio() {
		return fechaInicio;
	}


	public final Date getFechaFin() {
		return fechaFin;
	}


	private final void setFechaInicio(final Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	private final void setFechaFin(final Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}
