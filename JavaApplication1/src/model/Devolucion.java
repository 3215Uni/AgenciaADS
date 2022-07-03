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
public class Devolucion {
	private int devolucion_id;
	private LocalDate fechaDevolucion;
	private String estado;
	private Multa multa;
	public Devolucion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devolucion(int devolucion_id, LocalDate fechaDevolucion, String estado, Multa multa) {
		super();
		this.devolucion_id = devolucion_id;
		this.fechaDevolucion = fechaDevolucion;
		this.estado = estado;
		this.multa = multa;
	}
	public int getDevolucion_id() {
		return devolucion_id;
	}
	public void setDevolucion_id(int devolucion_id) {
		this.devolucion_id = devolucion_id;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Multa getMulta() {
		return multa;
	}
	public void setMulta(Multa multa) {
		this.multa = multa;
	}
	@Override
	public String toString() {
		return "Devolucion [devolucion_id=" + devolucion_id + ", fechaDevolucion=" + fechaDevolucion + ", estado="
				+ estado + ", multa=" + multa + ", getDevolucion_id()=" + getDevolucion_id() + ", getFechaDevolucion()="
				+ getFechaDevolucion() + ", getEstado()=" + getEstado() + ", getMulta()=" + getMulta() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

