package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.owner;

public class OwnerHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pets");
	
	public void insertOwner(owner o) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<owner> showAllOwners() {
		EntityManager em = emfactory.createEntityManager();
		List<owner> allOwners = em.createQuery("SELECT o FROM owner o").getResultList();
		return allOwners;
	}
}
