package co.health.service.mapper.entity.concrete.support;
import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.messages.CatalogoMensajes;
import co.health.crosscutting.messages.enumerator.CodigoMensaje;
import co.health.crosscutting.util.UtilObjeto;
import co.health.data.entity.support.NombreCompletoPacienteEntity;
import co.health.service.domain.paciente.support.NombreCompletoPacienteDomain;
import co.health.service.mapper.entity.EntityMapper;

public final class NombreCompletoPacienteEntityMapper implements EntityMapper<NombreCompletoPacienteEntity, NombreCompletoPacienteDomain> {


	private static final EntityMapper<NombreCompletoPacienteEntity, NombreCompletoPacienteDomain> instancia = new NombreCompletoPacienteEntityMapper();
	
	private NombreCompletoPacienteEntityMapper() {
		super();
	}
	
	@Override
	public final NombreCompletoPacienteDomain toDomain(final NombreCompletoPacienteEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000004);
			var mensajeTecnico = "No se ha presentado un problema en el metodo toDomain de la clase NombreCompletoPacienteEntityMapper "
					+ "por que el nombreCompletoPaciente es nulo ";//CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000041);
			throw ServiceHealthException.crear(mensajeUsuario, mensajeTecnico);
		}
		return NombreCompletoPacienteDomain.crear(entity.getPrimerNombre(), entity.getSegundoNombre(), entity.getPrimerApellido(), entity.getSegundoApellido());
	}

	@Override
	public final NombreCompletoPacienteEntity toEntity(final NombreCompletoPacienteDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000004);
			var mensajeTecnico = "No se ha presentado un problema en el metodo toEntity de la clase NombreCompletoPacienteEntityMapper "
					+ "por que el nombreCompletoPaciente es nulo ";
			throw ServiceHealthException.crear(mensajeUsuario, mensajeTecnico);
		}
		return NombreCompletoPacienteEntity.crear(domain.getPrimerNombre(), domain.getSegundoNombre(), domain.getPrimerApellido(), domain.getSegundoApellido());
	}
	
	public static final NombreCompletoPacienteDomain convertToDomain(final NombreCompletoPacienteEntity entity) {
		return instancia.toDomain(entity);
	}
	
	public static final NombreCompletoPacienteEntity convertToEntity(final NombreCompletoPacienteDomain domain) {
		return instancia.toEntity(domain);
	}

}
