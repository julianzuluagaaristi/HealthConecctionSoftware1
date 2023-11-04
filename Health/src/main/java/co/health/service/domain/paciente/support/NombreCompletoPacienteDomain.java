package co.health.service.domain.paciente.support;

import co.health.crosscutting.util.UtilTexto;

public final class NombreCompletoPacienteDomain {

	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	
	public  NombreCompletoPacienteDomain() {
		setPrimerNombre(UtilTexto.VACIO);
		setSegundoNombre(UtilTexto.VACIO);
		setPrimerApellido(UtilTexto.VACIO);
		setSegundoApellido(UtilTexto.VACIO);
	}
	
	private NombreCompletoPacienteDomain(final String primerNombre, final String segundoNombre, final String primerApellido,
			final String segundoApellido) {
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		
	}
		
	public static final NombreCompletoPacienteDomain crear(final String primerNombre, final String segundoNombre, final String primerApellido,
			final String segundoApellido) {
		return new NombreCompletoPacienteDomain(primerNombre, segundoNombre, primerApellido, segundoApellido);
	}
	
	public static final NombreCompletoPacienteDomain crear() {
		return new NombreCompletoPacienteDomain();
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}


	public final String getSegundoNombre() {
		return segundoNombre;
	}


	public final String getPrimerApellido() {
		return primerApellido;
	}


	public final String getSegundoApellido() {
		return segundoApellido;
	}


	private final void setPrimerNombre(final String primerNombre) {
		this.primerNombre = primerNombre;
	}


	private final void setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}


	private final void setPrimerApellido(final String primerApellido) {
		this.primerApellido = primerApellido;
	}


	private final void setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
}
