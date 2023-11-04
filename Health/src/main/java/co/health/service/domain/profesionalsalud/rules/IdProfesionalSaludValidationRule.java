package co.health.service.domain.profesionalsalud.rules;

import java.util.UUID;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.util.UtilUuid;
import co.health.service.domain.ValidationRule;

public class IdProfesionalSaludValidationRule implements ValidationRule<UUID> {
private static final ValidationRule<UUID> instancia = new IdProfesionalSaludValidationRule();
	
	private IdProfesionalSaludValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final UUID dato) {
		instancia.validar(dato);
	}

	@Override
	public void validar(UUID dato) {
		validarIdPorDefecto(dato);
		
	}
	private final void validarIdPorDefecto(final UUID id) {
		if(UtilUuid.valorDefecto(id)) {
			var mensajeUsuario = "El id del profesional de la salud es el valor por defecto";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
	}	
}
