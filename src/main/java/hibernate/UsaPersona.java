package hibernate;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.EntityManager;

public class UsaPersona {

	public static void main(String[] args) {
		// Genero la conexion con EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidadDiego");

		// Abrir la transaccion (Para que persistan los datos. Sin esto no persiste)
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		// Creo una instancia
		Persona unaPersona = new Persona();
		unaPersona.nombre = "Pepe";
		unaPersona.apellido = "Perez";

		Persona otraPersona = new Persona();
		otraPersona.nombre = "Roberto";
		otraPersona.apellido = "Gimenez";

		tx.begin();	//Abro la transaccion
		em.persist(unaPersona); //Persisto la instancia 1
		tx.commit(); //Cierro la transaccion

		tx.begin();	//Abro la transaccion
		em.persist(otraPersona); //Persisto la instancia 2
		tx.commit(); //Cierro la transaccion
		
		em.close();
		emf.close();
	}

}
