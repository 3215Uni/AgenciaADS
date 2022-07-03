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
public class Cliente {
	 private int IdCliente;
	 private String dirEmpresas;
	 private LocalDate fechaAlta;
	 private String apellido;
	 private int dni;
	 private String nombre;
	 private int telefono;
	 private String empresa;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idCliente, String dirEmpresas, LocalDate fechaAlta, String apellido, int dni, String nombre,
			int telefono, String empresa) {
		super();
		IdCliente = idCliente;
		this.dirEmpresas = dirEmpresas;
		this.fechaAlta = fechaAlta;
		this.apellido = apellido;
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.empresa = empresa;
	}
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getDirEmpresas() {
		return dirEmpresas;
	}
	public void setDirEmpresas(String dirEmpresas) {
		this.dirEmpresas = dirEmpresas;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + ", dirEmpresas=" + dirEmpresas + ", fechaAlta=" + fechaAlta
				+ ", apellido=" + apellido + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", empresa=" + empresa + "]";
	}
	    
	    
}

