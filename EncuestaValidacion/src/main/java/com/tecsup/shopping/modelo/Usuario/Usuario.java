package com.tecsup.shopping.modelo.Usuario;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
public class Usuario {
	String id;
	@NotEmpty
	String cuenta;
	@NotEmpty
	String clave;
	@Range(min = 1, max = 100)
	Integer edad = 0;
	String direccion;
	boolean suscripcionRevista;
	String[] favoritoFrameworks;
	String genero;
	String favoritoNumero;
	String pais;
	String[] habilidades;
	public Usuario() {
		super();
	}
	public Usuario(String id, String cuenta, String clave, Integer edad, String direccion, boolean suscripcionRevista,
			String[] favoritoFrameworks, String genero, String favoritoNumero, String pais, String[] habilidades) {
		super();
		this.id = id;
		this.cuenta = cuenta;
		this.clave = clave;
		this.edad = edad;
		this.direccion = direccion;
		this.suscripcionRevista = suscripcionRevista;
		this.favoritoFrameworks = favoritoFrameworks;
		this.genero = genero;
		this.favoritoNumero = favoritoNumero;
		this.pais = pais;
		this.habilidades = habilidades;
	}
	public String getId() {
		return id;
	}
	public String getCuenta() {
		return cuenta;
	}
	public String getClave() {
		return clave;
	}
	public Integer getEdad() {
		return edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public boolean isSuscripcionRevista() {
		return suscripcionRevista;
	}
	public String[] getFavoritoFrameworks() {
		return favoritoFrameworks;
	}
	public String getGenero() {
		return genero;
	}
	public String getFavoritoNumero() {
		return favoritoNumero;
	}
	public String getPais() {
		return pais;
	}
	public String[] getHabilidades() {
		return habilidades;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setSuscripcionRevista(boolean suscripcionRevista) {
		this.suscripcionRevista = suscripcionRevista;
	}
	public void setFavoritoFrameworks(String[] favoritoFrameworks) {
		this.favoritoFrameworks = favoritoFrameworks;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setFavoritoNumero(String favoritoNumero) {
		this.favoritoNumero = favoritoNumero;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}

}
