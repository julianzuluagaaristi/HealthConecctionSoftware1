package co.health.data.entity;

import java.util.UUID;

import co.health.data.entity.support.FechaCitaEntity;
import co.health.data.entity.support.NombreCompletoPacienteEntity;
import co.health.data.entity.support.DatosServicioCitaEntity;


public class CitaEntity {
	
	private UUID id;
	private DatosServicioCitaEntity datosServicioCita;
	private FechaCitaEntity fecha;
	private EstadoCitaEntity estadoCita;
	private NombreCompletoPacienteEntity nombrePaciente;
	
	
	private CitaEntity(final UUID id, final DatosServicioCitaEntity datosServicioCita, final FechaCitaEntity fecha,
		 final EstadoCitaEntity estadoCita, final NombreCompletoPacienteEntity nombrePaciente) {
		setId(id);
		setDatosServicioCita(datosServicioCita);
		setFecha(fecha);
		setEstadoCita(estadoCita);
		setNombrePaciente(nombrePaciente);
		}

	public static final CitaEntity crear(final UUID id, final DatosServicioCitaEntity datosServicioCita, 
			final FechaCitaEntity fecha, final EstadoCitaEntity estadoCita, final NombreCompletoPacienteEntity
			nombrePaciente) {
		return new CitaEntity(id, datosServicioCita,fecha,estadoCita,nombrePaciente);
	}

	public final UUID getId() {
		return id;
	}

	public final DatosServicioCitaEntity getDatosServicioCita() {
		return datosServicioCita;
	}

	public final FechaCitaEntity getFecha() {
		return fecha;
	}

	public final EstadoCitaEntity getEstadoCita() {
		return estadoCita;
	}

	public final NombreCompletoPacienteEntity getNombrePaciente() {
		return nombrePaciente;
	}

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setDatosServicioCita(final DatosServicioCitaEntity datosServicioCita) {
		this.datosServicioCita = datosServicioCita;
	}

	private final void setFecha(final FechaCitaEntity fecha) {
		this.fecha = fecha;
	}


	private final void setEstadoCita(final EstadoCitaEntity estadoCita) {
		this.estadoCita = estadoCita;
	}
	
	private final void setNombrePaciente(final NombreCompletoPacienteEntity nombrePaciente) {
		this.nombrePaciente=nombrePaciente;
	}

}
