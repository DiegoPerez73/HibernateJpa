package hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Persona {
	/* 
	 * GeneratedValue puede tener distintos strategys.
	 * IDENTITY: una columna de identidad (autoincremental) 
	 * TABLE: utiliza una tabla de la base de datos 
	 * SEQUENCE: utiliza una secuencia 
	 * UUID: utiliza una secuencia 
	 * AUTO: el proveedor de persistencia elige
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long codigo;

	String nombre;

	String apellido;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
