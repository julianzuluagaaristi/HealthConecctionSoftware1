package co.health.service.businesslogic.validator.concrete.paciente;

import co.health.service.businesslogic.validator.Validator;
import co.health.service.domain.paciente.PacienteDomain;
import co.health.service.domain.paciente.rules.ContactoPacienteValidationRule;
import co.health.service.domain.paciente.rules.FechaNacimientoPacienteValidationRule;
import co.health.service.domain.paciente.rules.InformacionAfiliacionPacienteValidationRule;
import co.health.service.domain.paciente.rules.NombreCompletoPacienteValidationRule;
import co.health.service.domain.paciente.rules.NumeroIdentificacionPacienteValidationRule;
import co.health.service.domain.paciente.rules.PacienteValidationRule;
import co.health.service.domain.tipoidentificacion.rules.TipoIdentificacionValidationRule;

public final class RegistrarPacienteValidator implements Validator<PacienteDomain>{

	private static final Validator<PacienteDomain> instancia = new RegistrarPacienteValidator();
	
	private  RegistrarPacienteValidator() {
		super();
	}
	
	public static final void ejecutarValidacion(final PacienteDomain data) {
		instancia.execute(data);
	}

	@Override
	public void execute(PacienteDomain dato) {
		PacienteValidationRule.ejecutarValidacion(dato);
		NumeroIdentificacionPacienteValidationRule.ejecutarValidacion(dato.getNumeroIdentificacion());
		NombreCompletoPacienteValidationRule.ejecutarValidacion(dato.getNombreCompletoPaciente());
		ContactoPacienteValidationRule.ejecutarValidacion(dato.getContactoPaciente());
		FechaNacimientoPacienteValidationRule.ejecutarValidacion(dato.getFechaNacimiento());
		TipoIdentificacionValidationRule.ejecutarValidacion(dato.getTipoIdentificacion());
		InformacionAfiliacionPacienteValidationRule.ejecutarValidacion(dato.getInformacionAfiliacionPaciente());
	}

}
