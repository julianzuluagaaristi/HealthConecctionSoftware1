package co.health.service.domain.paciente.rules;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.messages.CatalogoMensajes;
import co.health.crosscutting.messages.enumerator.CodigoMensaje;
import co.health.crosscutting.util.UtilTexto;
import co.health.service.domain.ValidationRule;
import co.health.service.domain.paciente.support.NombreCompletoPacienteDomain;

public final class NombreCompletoPacienteValidationRule implements ValidationRule<NombreCompletoPacienteDomain>{
	
private static final ValidationRule<NombreCompletoPacienteDomain> instancia = new NombreCompletoPacienteValidationRule();
	
	public NombreCompletoPacienteValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final NombreCompletoPacienteDomain dato) {
		instancia.validar(dato);
	}
	

	@Override
	public final void validar(final NombreCompletoPacienteDomain dato) {
		validarObligatoriedad(dato);
		validarLongitud(dato);
		validarFormato(dato);
	}

	
	public final void validarLongitud(final NombreCompletoPacienteDomain dato) {
		validarLongitudPrimerNombre(dato);
		validarLongitudSegundoNombre(dato);
		validarLongitudPrimerApellido(dato);
		validadLongitudSegundoApellido(dato);
		
	}
	private final void validarLongitudPrimerNombre(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.longitudMaximaValida(dato.getPrimerNombre(),10)) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000072));
		}
	}

	private final void validarLongitudSegundoNombre(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.longitudMaximaValida(dato.getSegundoNombre(),10)) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000073));
		}
	}

	private final void validarLongitudPrimerApellido(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.longitudMaximaValida(dato.getPrimerApellido(),10)) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000074));
		}
		
	}

	private final void validadLongitudSegundoApellido(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.longitudMaximaValida(dato.getSegundoApellido(),10)) {
			var mensajeUsuario = "La longitud maxima del segundo apellido es de 10 caracteres";
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000075));
		}
	}
		
	
	private final void validarFormato(final NombreCompletoPacienteDomain dato) {
		validarFormatoPrimerNombre(dato);
		validarFormatoSegundoNombre(dato);
		validarFormatoPrimerApellido(dato);
		validarFormatoSegundoApellido(dato);
	}

	private final void validarFormatoPrimerNombre(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.contieneSoloLetrasDigitos(dato.getPrimerNombre())) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000076));
		}
		
	}

	private final void validarFormatoSegundoNombre(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.contieneSoloLetrasDigitos(dato.getSegundoNombre())) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000077));
		}
	}

	private final void validarFormatoPrimerApellido(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.contieneSoloLetrasDigitos(dato.getPrimerApellido())) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000078));
		}
	}

	private final void validarFormatoSegundoApellido(final NombreCompletoPacienteDomain dato) {
		if(!UtilTexto.contieneSoloLetrasDigitos(dato.getSegundoApellido())) {
			throw ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000079));
		}
	}

	private final void validarObligatoriedad(final NombreCompletoPacienteDomain dato) {
		validarObligatoriedadPrimerNombre(dato);
		validarObligatoriedadPrimerApellido(dato);
		
	}

	private final void validarObligatoriedadPrimerNombre(final NombreCompletoPacienteDomain dato) {
		if(UtilTexto.estaVacio(dato.getPrimerNombre())) {
			ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000080));
		}
		
	}

	private final void validarObligatoriedadPrimerApellido(final NombreCompletoPacienteDomain dato) {
		if(UtilTexto.estaVacio(dato.getPrimerApellido())) {
			ServiceHealthException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000081));
		}
	}

}
