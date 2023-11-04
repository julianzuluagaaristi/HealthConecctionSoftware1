package co.health.service.businesslogic.concrete.paciente;

import java.util.UUID;

import co.health.crosscutting.exception.concrete.ServiceHealthException;
import co.health.crosscutting.util.UtilObjeto;
import co.health.data.dao.PacienteDAO;
import co.health.data.dao.daofactory.DAOFactory;
import co.health.data.entity.PacienteEntity;
import co.health.service.businesslogic.UseCase;
import co.health.service.domain.paciente.PacienteDomain;
import co.health.service.mapper.entity.concrete.PacienteEntityMapper;

public final class EliminarPacienteUseCase implements UseCase<PacienteDomain>{

	private DAOFactory factoria;

	public EliminarPacienteUseCase(final DAOFactory factoria) {
		setFactoria(factoria);
	}
	
	@Override
	public void execute(PacienteDomain domain) {
		
		validarExistenciaPacienteAEliminar(domain.getId());
		
		eliminarCliente(domain);
		
	}
	
	private void eliminarCliente(final PacienteDomain domain) {
		var entity = PacienteEntityMapper.convertToEntity(domain);
		getPacienteDAO().eliminar(entity.getId());
	}

	private final void validarExistenciaPacienteAEliminar(final UUID id) {
	    var entity = crearPacienteEntityIdAEliminar(id);
	    var resultados = getPacienteDAO().consultarPorId(entity.getId());
	    if (resultados.isEmpty()) {
	        String mensajeUsuario = "No existe el Paciente que se desea eliminar";
	        throw ServiceHealthException.crear(mensajeUsuario);
	    }
	}

	private PacienteEntity crearPacienteEntityIdAEliminar(final UUID id) {
	    var domain = PacienteDomain.crear(id, null, null, null, null, null, null);
	    return PacienteEntityMapper.convertToEntity(domain);
	}

	private final DAOFactory getFactoria() {
		return factoria;
	}
	
	private final PacienteDAO getPacienteDAO() {
		return getFactoria().obtenerPacienteDAO();
	}

	private final void setFactoria(final DAOFactory factoria) {
		if(UtilObjeto.esNulo(factoria)) {
			var mensajeUsuario = "Se ha presentado un problema tratando de llevar a cabo la "
					+ "eliminacion de la información del  cliente";//CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000029);
			var mensajeTecnico = "Se ha presentado un problema en el metodo setFactoria de la clase"
					+ " RegistrarPacienteUseCase debido a que la factoria con la cual se desea crear esta nula.";//CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000030);
			throw ServiceHealthException.crear(mensajeUsuario, mensajeTecnico);
		}
		this.factoria = factoria;
	}
}
