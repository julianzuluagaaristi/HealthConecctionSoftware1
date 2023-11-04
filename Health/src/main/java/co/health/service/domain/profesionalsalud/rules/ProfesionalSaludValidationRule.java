package co.health.service.domain.profesionalsalud.rules;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.util.UtilObjeto;
import co.health.service.domain.ValidationRule;
import co.health.service.domain.profesionalsalud.ProfesionalSaludDomain;

public class ProfesionalSaludValidationRule implements ValidationRule<ProfesionalSaludDomain> {
private static final ValidationRule<ProfesionalSaludDomain> instancia = new ProfesionalSaludValidationRule();
	
	private  ProfesionalSaludValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final ProfesionalSaludDomain dato) {
		instancia.validar(dato);
	}

	@Override
	public void validar(ProfesionalSaludDomain dato) {
		if(UtilObjeto.esNulo(dato)) {
			var mensajeUsuario = "No es posible realizar la operacion con un cliente Nulo";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
	}
}
