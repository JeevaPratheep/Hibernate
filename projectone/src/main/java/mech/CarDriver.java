package mech;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
//		Car c= new Car();
//		c.setBrand("Audi");
//		c.setCost(1000000);
//		
//		Engine e= new Engine();
//		e.setNoofCylenders(8);
//		e.setType("V type");
//		
//		e.setCar(c);
//		c.setE(e);
//		
//		et.begin();
//		em.persist(e);
//		et.commit();
//	
//		Car c1=em.find(Car.class, 2);
//		Engine e1=c1.getE();
//		c1.setE(null);
//		e1.setCar(null);
//		
//		et.begin();
//		em.merge(e1);
//		em.merge(c1);
//		em.remove(e1);
//		et.commit();
		
//		Engine e= new Engine();
//		e.setNoofCylenders(8);
//		e.setType("V type");
//		
//		et.begin();
//		em.persist(e);
//		et.commit();
		
		
		Car c1=em.find(Car.class, 2);
//		Engine e2=em.find(Engine.class, 3);
//		c1.setE(e2);
//		e2.setCar(c1);
//		
//		et.begin();
//		em.merge(e2);
//		et.commit();

		System.out.println(c1);
	}

}
