package package2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Mobile m1=new Mobile();
//		m1.setBrand("Asus");
//		m1.setRam(16);
//		m1.setStorage(512);
//		
//		SimCard s1= new SimCard();
//		s1.setCost(500);
//		s1.setMobile(m1);
//		s1.setType("5G");
//
//		SimCard s2= new SimCard();
//		s2.setCost(400);
//		s2.setMobile(m1);
//		s2.setType("4G");
//
//		SimCard s3= new SimCard();
//		s3.setCost(100);
//		s3.setMobile(m1);
//		s3.setType("3G");
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		et.commit();
		
		
		
//		SimCard s1= new SimCard();
//		s1.setCost(500);
//		s1.setMobile(null);
//		s1.setType("5G");
//
//		SimCard s2= new SimCard();
//		s2.setCost(400);
//		s2.setMobile(null);
//		s2.setType("4G");
//		
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();

		
//
//		Mobile m1=new Mobile();
//		m1.setBrand("POCO");
//		m1.setRam(8);
//		m1.setStorage(256);
//		
//		et.begin();
//		em.persist(m1);
//		et.commit();
		
//		SimCard s1=em.find(SimCard.class, 4);
//		SimCard s2=em.find(SimCard.class, 5);
//		Mobile m1=em.find(Mobile.class, 2);
//		s1.setMobile(m1);
//		s2.setMobile(m1);
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();
//		
		
		
	}
	
}
