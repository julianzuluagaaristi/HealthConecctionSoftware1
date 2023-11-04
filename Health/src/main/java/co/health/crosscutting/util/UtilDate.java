package co.health.crosscutting.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import co.health.crosscutting.exception.concrete.CrosscuttingHealthException;

public final class UtilDate {
	private static final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	private static final String PATTERN_SOLO_DIGITOS = "\\d{4}-\\d{2}-\\d{2}";
	private static final String FECHA_DEFECTO = "2999-12-31";

    
	private UtilDate() {
		super();
	}

	public static Date crearFechaPorDefecto() {
		try{
        var fechaUtil = formato.parse(FECHA_DEFECTO);
        return new Date(fechaUtil.getTime());
    	
		} catch (final ParseException e) {
	        String mensajeUsuario = "Se ha producido un error al crear la fecha por defecto.";
	        String mensajeTecnico = "Se ha producido un error de formato al analizar la fecha por defecto. Asegúrate de que la cadena tenga el formato 'yyyy-MM-dd'.";
	        throw  CrosscuttingHealthException.crear(mensajeUsuario,mensajeTecnico);
		}
	}
	 
    public static final boolean esFechaNula(final Date fecha) {
        return UtilObjeto.esNulo(fecha);
    }

    public static final boolean cumpleFormatoFecha(final Date fecha) {
        return  Pattern.matches(PATTERN_SOLO_DIGITOS, formato.format(fecha));
	}

    public static final  boolean tieneValorPorDefecto(final Date fecha) {
        return fecha.equals(crearFechaPorDefecto());
    }
		
	}
