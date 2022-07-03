/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2022
 */
public class Multa {
	private int multa_id;
	private float monto;
	private int tipo;
	private String detalle;
	public Multa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Multa(int multa_id, float monto, int tipo, String detalle) {
		super();
		this.multa_id = multa_id;
		this.monto = monto;
		this.tipo = tipo;
		this.detalle = detalle;
	}
	public int getMulta_id() {
		return multa_id;
	}
	public void setMulta_id(int multa_id) {
		this.multa_id = multa_id;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "Multa [multa_id=" + multa_id + ", monto=" + monto + ", tipo=" + tipo + ", detalle=" + detalle
				+ ", getMulta_id()=" + getMulta_id() + ", getMonto()=" + getMonto() + ", getTipo()=" + getTipo()
				+ ", getDetalle()=" + getDetalle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
