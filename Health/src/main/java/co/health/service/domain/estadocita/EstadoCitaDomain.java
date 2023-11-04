package co.health.service.domain.estadocita;

import java.util.UUID;

public class EstadoCitaDomain {
	private UUID id;
	private String nombre;
	
	private EstadoCitaDomain(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public static final EstadoCitaDomain crear(final UUID id, final String nombre) {
		return new EstadoCitaDomain(id, nombre);
	}

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public final UUID getId() {
		return id;
	}

	public final String getNombre() {
		return nombre;
	}
}
