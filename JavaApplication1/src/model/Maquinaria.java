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
public class Maquinaria {
	  private int codigo;
	    private int modelo;
	    private String imagen;
	    private String descripcion;
	    private String estado;
	    private String tipo;
	    private String disponibilidad;
	    private String marca;
	    private LocalDate fechaAdquisicion;
	    private float precio;
		public Maquinaria() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Maquinaria(int codigo, int modelo, String imagen, String descripcion, String estado, String tipo,
				String disponibilidad, String marca, LocalDate fechaAdquisicion, float precio) {
			super();
			this.codigo = codigo;
			this.modelo = modelo;
			this.imagen = imagen;
			this.descripcion = descripcion;
			this.estado = estado;
			this.tipo = tipo;
			this.disponibilidad = disponibilidad;
			this.marca = marca;
			this.fechaAdquisicion = fechaAdquisicion;
			this.precio = precio;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getModelo() {
			return modelo;
		}
		public void setModelo(int modelo) {
			this.modelo = modelo;
		}
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getDisponibilidad() {
			return disponibilidad;
		}
		public void setDisponibilidad(String disponibilidad) {
			this.disponibilidad = disponibilidad;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public LocalDate getFechaAdquisicion() {
			return fechaAdquisicion;
		}
		public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
			this.fechaAdquisicion = fechaAdquisicion;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
	@Override
		public String toString() {
			return "Maquinaria [codigo=" + codigo + ", modelo=" + modelo + ", imagen=" + imagen + ", descripcion="
					+ descripcion + ", estado=" + estado + ", tipo=" + tipo + ", disponibilidad=" + disponibilidad
					+ ", marca=" + marca + ", fechaAdquisicion=" + fechaAdquisicion + ", precio=" + precio
					+ ", getCodigo()=" + getCodigo() + ", getModelo()=" + getModelo() + ", getImagen()=" + getImagen()
					+ ", getDescripcion()=" + getDescripcion() + ", getEstado()=" + getEstado() + ", getTipo()="
					+ getTipo() + ", getDisponibilidad()=" + getDisponibilidad() + ", getMarca()=" + getMarca()
					+ ", getFechaAdquisicion()=" + getFechaAdquisicion() + ", getPrecio()=" + getPrecio()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
			
}

