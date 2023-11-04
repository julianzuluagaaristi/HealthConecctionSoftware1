package co.health.service.domain.agenda.rules;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.util.UtilTexto;
import co.health.service.domain.ValidationRule;

public class NombreProfesionalSaludAgendaValidationRule implements ValidationRule <String> {
private static final ValidationRule<String> instancia = new NombreProfesionalSaludAgendaValidationRule();
	
	private NombreProfesionalSaludAgendaValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final String dato) {
		instancia.validar(dato);
	}
	
	@Override
	public final void validar(String dato) {
		validarLongitud(dato);
		validarObligatoriedad(dato);
		validarFormato(dato);
		
	}
	
	private final void validarLongitud(final String dato) {
		if(!UtilTexto.longitudMaximaValida(dato,40)) {
			var mensajeUsuario = "La longitud del Nombre del profesional de salud no en valida.La longitud maxima es 40 caracteres";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
	}
	
	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = "El Nombre del profesional de salud es obligatorio";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
		
		
	}
	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetrasDigitosEspacios(dato)) {
			var mensajeUsuario = "El Nombre del profesional de salud solo debe contener letras, digitos y espacios";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
		
	}
}
