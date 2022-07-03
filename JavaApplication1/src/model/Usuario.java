/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2022
 */
public class Usuario {
	private int id;
	private String apellido;
	private String nombre;
	private int dni;
	private int telefono;
	private String tipo;
	private String nombreUsuario;
	private String password;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int id, String apellido, String nombre, int dni, int telefono, String tipo, String nombreUsuario,
			String password) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", telefono="
				+ telefono + ", tipo=" + tipo + ", nombreUsuario=" + nombreUsuario + ", password=" + password
				+ ", getId()=" + getId() + ", getApellido()=" + getApellido() + ", getNombre()=" + getNombre()
				+ ", getDni()=" + getDni() + ", getTelefono()=" + getTelefono() + ", getTipo()=" + getTipo()
				+ ", getNombreUsuario()=" + getNombreUsuario() + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}