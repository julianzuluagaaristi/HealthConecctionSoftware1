package co.health.service.dto;

import java.util.UUID;

import co.health.crosscutting.util.UtilTexto;
import co.health.crosscutting.util.UtilUuid;

public class EstadoCitaDTO {
	private UUID id;
	private String nombre;
	
	public EstadoCitaDTO() {
		setId(UtilUuid.DEFAULT_UUID);
		setNombre(UtilTexto.VACIO);
	}
	public EstadoCitaDTO(final UUID id,final String nombre) {
		setId(id);
		setNombre(nombre);
		
	}
	public static final EstadoCitaDTO crear(final UUID id, final String nombre) {
		return new EstadoCitaDTO(id, nombre);
	}
	public static final EstadoCitaDTO crear() {
		return new EstadoCitaDTO();
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
