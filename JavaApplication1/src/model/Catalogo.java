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
public class Catalogo extends Maquinaria {
	private int idCatalogo;
	private LocalDate fechaVigencia;
	private int maquinaria;
	public Catalogo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catalogo(int codigo, int modelo, String imagen, String descripcion, String estado, String tipo,
			String disponibilidad, String marca, LocalDate fechaAdquisicion, float precio) {
		super(codigo, modelo, imagen, descripcion, estado, tipo, disponibilidad, marca, fechaAdquisicion, precio);
		// TODO Auto-generated constructor stub
	}
	public Catalogo(int idCatalogo, LocalDate fechaVigencia, int maquinaria) {
		super();
		this.idCatalogo = idCatalogo;
		this.fechaVigencia = fechaVigencia;
		this.maquinaria = maquinaria;
	}
	public int getIdCatalogo() {
		return idCatalogo;
	}
	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}
	public LocalDate getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(LocalDate fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public int getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(int maquinaria) {
		this.maquinaria = maquinaria;
	}
	@Override
	public String toString() {
		return "Catalogo [idCatalogo=" + idCatalogo + ", fechaVigencia=" + fechaVigencia + ", maquinaria=" + maquinaria
				+ ", getIdCatalogo()=" + getIdCatalogo() + ", getFechaVigencia()=" + getFechaVigencia()
				+ ", getMaquinaria()=" + getMaquinaria() + ", getCodigo()=" + getCodigo() + ", getModelo()="
				+ getModelo() + ", getImagen()=" + getImagen() + ", getDescripcion()=" + getDescripcion()
				+ ", getEstado()=" + getEstado() + ", getTipo()=" + getTipo() + ", getDisponibilidad()="
				+ getDisponibilidad() + ", getMarca()=" + getMarca() + ", getFechaAdquisicion()="
				+ getFechaAdquisicion() + ", getPrecio()=" + getPrecio() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
	
	
}
