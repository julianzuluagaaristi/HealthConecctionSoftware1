package co.health.service.domain.cita;

import java.util.UUID;

import co.health.service.domain.cita.support.DatosServicioCitaDomain;
import co.health.service.domain.cita.support.FechaCitaDomain;
import co.health.service.domain.estadocita.EstadoCitaDomain;
import co.health.service.domain.paciente.support.NombreCompletoPacienteDomain;

public class CitaDomain {
	private UUID id;
	private DatosServicioCitaDomain datosServicioCita;
	private FechaCitaDomain fecha;
	private EstadoCitaDomain estadoCita;
	private NombreCompletoPacienteDomain nombrePaciente; 
	
	
	private CitaDomain(final UUID id, final DatosServicioCitaDomain datosServicioCita, final FechaCitaDomain fecha,
			 final EstadoCitaDomain estadoCita, final NombreCompletoPacienteDomain nombrePaciente) {
		setId(id);
		setDatosServicioCita(datosServicioCita);
		setFecha(fecha);
		setEstadoCita(estadoCita);
		setNombrePaciente(nombrePaciente);
		
		}

	public static final CitaDomain crear(final UUID id, final DatosServicioCitaDomain datosServicioCita, final FechaCitaDomain fecha, 
			 final EstadoCitaDomain estadoCita, final NombreCompletoPacienteDomain nombrePaciente) {
		return new CitaDomain(id, datosServicioCita, fecha ,estadoCita, nombrePaciente);
	}

	public final UUID getId() {
		return id;
	}

	public final DatosServicioCitaDomain getDatosServicioCita() {
		return datosServicioCita;
	}

	public final FechaCitaDomain getFecha() {
		return fecha;
	}


	public final EstadoCitaDomain getEstadoCita() {
		return estadoCita;
	}

	
	public final NombreCompletoPacienteDomain getNombrePaciente() {
		return nombrePaciente;
	}
	
	

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setDatosServicioCita(final DatosServicioCitaDomain datosServicioCita) {
		this.datosServicioCita = datosServicioCita;
	}

	private final void setFecha(final FechaCitaDomain fecha) {
		this.fecha = fecha;
	}

	
	private final void setEstadoCita(final EstadoCitaDomain estadoCita) {
		this.estadoCita = estadoCita;
	}

	private final void setNombrePaciente(NombreCompletoPacienteDomain nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	
}
	