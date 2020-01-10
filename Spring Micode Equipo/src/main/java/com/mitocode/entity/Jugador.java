package com.mitocode.entity;

public class Jugador {
private int id;
private String nombre;
private Equipo equipo;
private Camiseta camiseta;
public Jugador() {
	super();
	// TODO Auto-generated constructor stub
}
public Jugador(int id, String nombre, Equipo equipo, Camiseta camiseta) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.equipo = equipo;
	this.camiseta = camiseta;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Equipo getEquipo() {
	return equipo;
}
public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}
public Camiseta getCamiseta() {
	return camiseta;
}
public void setCamiseta(Camiseta camiseta) {
	this.camiseta = camiseta;
}
@Override
public String toString() {
	return "Jugador [id=" + id + ", nombre=" + nombre + ", equipo=" + equipo + ", camiseta=" + camiseta + "]";
}

}
