/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author 2022
 */
public class Reservacion {
	private int id;
	private LocalDate fecgaReserva;
	private LocalDate fechavencimeinto;
	private int maquinaria;
	private Cliente cliente;
	private Usuario usuario;
	public Reservacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservacion(int id, LocalDate fecgaReserva, LocalDate fechavencimeinto, int maquinaria, Cliente cliente,
			Usuario usuario) {
		super();
		this.id = id;
		this.fecgaReserva = fecgaReserva;
		this.fechavencimeinto = fechavencimeinto;
		this.maquinaria = maquinaria;
		this.cliente = cliente;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFecgaReserva() {
		return fecgaReserva;
	}
	public void setFecgaReserva(LocalDate fecgaReserva) {
		this.fecgaReserva = fecgaReserva;
	}
	public LocalDate getFechavencimeinto() {
		return fechavencimeinto;
	}
	public void setFechavencimeinto(LocalDate fechavencimeinto) {
		this.fechavencimeinto = fechavencimeinto;
	}
	public int getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(int maquinaria) {
		this.maquinaria = maquinaria;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Reservacion [id=" + id + ", fecgaReserva=" + fecgaReserva + ", fechavencimeinto=" + fechavencimeinto
				+ ", maquinaria=" + maquinaria + ", cliente=" + cliente + ", usuario=" + usuario + ", getId()="
				+ getId() + ", getFecgaReserva()=" + getFecgaReserva() + ", getFechavencimeinto()="
				+ getFechavencimeinto() + ", getMaquinaria()=" + getMaquinaria() + ", getCliente()=" + getCliente()
				+ ", getUsuario()=" + getUsuario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
