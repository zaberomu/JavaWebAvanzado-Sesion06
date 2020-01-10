package com.mitocode.entity;

public class Camiseta {
private int id;
private String numero;
private Marca marca;
public Camiseta() {
	super();
	// TODO Auto-generated constructor stub
}
public Camiseta(int id, String numero, Marca marca) {
	super();
	this.id = id;
	this.numero = numero;
	this.marca = marca;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public Marca getMarca() {
	return marca;
}
public void setMarca(Marca marca) {
	this.marca = marca;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

}
