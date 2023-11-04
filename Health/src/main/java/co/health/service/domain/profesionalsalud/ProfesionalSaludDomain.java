package co.health.service.domain.profesionalsalud;

import java.util.UUID;

import co.health.service.domain.profesionalsalud.support.NombreCompletoProfesionalSaludDomain;
import co.health.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public class ProfesionalSaludDomain {
	private UUID id;
	private String numeroIdentificacion;
	private NombreCompletoProfesionalSaludDomain nombreCompletoProfesionalSalud;
	private String cargo;
	private TipoIdentificacionDomain tipoIdentificacion;

	
	private ProfesionalSaludDomain(final UUID id, final String numeroIdentificacion,
			final NombreCompletoProfesionalSaludDomain nombreCompletoProfesionalSalud, final String cargo,
			final TipoIdentificacionDomain tipoIdentificacion) {
		setId(id);
		setNumeroIdentificacion(numeroIdentificacion);
		setNombreCompletoProfesionalSalud(nombreCompletoProfesionalSalud);
		setCargo(cargo);
		setTipoIdentificacion(tipoIdentificacion);
	}

	public static final ProfesionalSaludDomain crear(final UUID id, final String numeroIdentificacion,
			final NombreCompletoProfesionalSaludDomain nombreCompletoProfesionalSalud, final String cargo,
			final TipoIdentificacionDomain tipoIdentificacion) {
		return new ProfesionalSaludDomain(id, numeroIdentificacion, nombreCompletoProfesionalSalud, cargo, tipoIdentificacion);
	}

	public final UUID getId() {
		return id;
	}


	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public final NombreCompletoProfesionalSaludDomain getNombreCompletoProfesionalSalud() {
		return nombreCompletoProfesionalSalud;
	}

	public final String getCargo() {
		return cargo;
	}


	public final TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	private final void setId(final UUID id) {
		this.id = id;
	}


	private final void setNumeroIdentificacion(final String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}


	private final void setNombreCompletoProfesionalSalud(
			final NombreCompletoProfesionalSaludDomain nombreCompletoProfesionalSalud) {
		this.nombreCompletoProfesionalSalud = nombreCompletoProfesionalSalud;
	}

	private final void setCargo(final String cargo) {
		this.cargo = cargo;
	}


	private final void setTipoIdentificacion(final TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

}
