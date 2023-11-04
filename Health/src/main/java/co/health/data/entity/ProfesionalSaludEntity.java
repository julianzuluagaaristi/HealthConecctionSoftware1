package co.health.data.entity;

import java.util.UUID;

import co.health.data.entity.support.NombreCompletoProfesionalSaludEntity;

public class ProfesionalSaludEntity {

	private UUID id;
	private String numeroIdentificacion;
	private NombreCompletoProfesionalSaludEntity nombreCompletoProfesionalSalud;
	private String cargo;
	private TipoIdentificacionEntity tipoIdentificacion;

	
	private ProfesionalSaludEntity(final UUID id, final String numeroIdentificacion,
			final NombreCompletoProfesionalSaludEntity nombreCompletoProfesionalSalud, final String cargo,
			final TipoIdentificacionEntity tipoIdentificacion) {
		setId(id);
		setNumeroIdentificacion(numeroIdentificacion);
		setNombreCompletoProfesionalSalud(nombreCompletoProfesionalSalud);
		setCargo(cargo);
		setTipoIdentificacion(tipoIdentificacion);
	}

	public static final ProfesionalSaludEntity crear(final UUID id, final String numeroIdentificacion,
			final NombreCompletoProfesionalSaludEntity nombreCompletoProfesionalSalud, final String cargo,
			final TipoIdentificacionEntity tipoIdentificacion) {
		return new ProfesionalSaludEntity(id, numeroIdentificacion, nombreCompletoProfesionalSalud, cargo, tipoIdentificacion);
	}

	public final UUID getId() {
		return id;
	}


	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public final NombreCompletoProfesionalSaludEntity getNombreCompletoProfesionalSalud() {
		return nombreCompletoProfesionalSalud;
	}

	public final String getCargo() {
		return cargo;
	}


	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	private final void setId(final UUID id) {
		this.id = id;
	}


	private final void setNumeroIdentificacion(final String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}


	private final void setNombreCompletoProfesionalSalud(
			final NombreCompletoProfesionalSaludEntity nombreCompletoProfesionalSalud) {
		this.nombreCompletoProfesionalSalud = nombreCompletoProfesionalSalud;
	}

	private final void setCargo(final String cargo) {
		this.cargo = cargo;
	}


	private final void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	
}
