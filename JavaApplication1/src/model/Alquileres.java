/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.print.DocFlavor;

/**
 *
 * @author 2022
 */
public class Alquileres {
	private int id;
	private LocalDate fechaVencimeinto;
	private int cliente;
	private int devolucion;
	private String estadoPago;
	private Usuario usuario;
	private Maquinaria maquinaria;
	private Cliente clietne;
	public Alquileres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alquileres(int id, LocalDate fechaVencimeinto, int cliente, int devolucion, String estadoPago,
			Usuario usuario, Maquinaria maquinaria, Cliente clietne) {
		super();
		this.id = id;
		this.fechaVencimeinto = fechaVencimeinto;
		this.cliente = cliente;
		this.devolucion = devolucion;
		this.estadoPago = estadoPago;
		this.usuario = usuario;
		this.maquinaria = maquinaria;
		this.clietne = clietne;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechaVencimeinto() {
		return fechaVencimeinto;
	}
	public void setFechaVencimeinto(LocalDate fechaVencimeinto) {
		this.fechaVencimeinto = fechaVencimeinto;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getDevolucion() {
		return devolucion;
	}
	public void setDevolucion(int devolucion) {
		this.devolucion = devolucion;
	}
	public String getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Maquinaria getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(Maquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}
	public Cliente getClietne() {
		return clietne;
	}
	public void setClietne(Cliente clietne) {
		this.clietne = clietne;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}