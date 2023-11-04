package co.health.service.domain.agenda.rules;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.util.UtilTexto;
import co.health.service.domain.ValidationRule;

public class DescripcionAgendaValidationRule implements ValidationRule<String> {
private static final ValidationRule<String> instancia = new DescripcionAgendaValidationRule();
	
	private DescripcionAgendaValidationRule() {
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
		if(!UtilTexto.longitudMaximaValida(dato,100)) {
			var mensajeUsuario = "La longitud de la descripcion de la agenda no es valida.La longitud maxima es 100 caracteres";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
	}
	
	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = "La descripcion de la agenda es obligatorio";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
		
		
	}
	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetrasDigitosEspacios(dato)) {
			var mensajeUsuario = "La descripcion de la agenda solo debe contener letras, digitos y espacios";
			throw ServiceHealthException.crear(mensajeUsuario);
		}
		
	}
}
