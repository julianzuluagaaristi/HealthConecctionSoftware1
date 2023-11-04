package co.health.crosscutting.util;

public final class UtilLong {
	public static final Long DEFAULT_LONG = (long) 0;
	
	public static final boolean esNulo( final Long valor) {
		return UtilObjeto.esNulo(valor);
	}
}
