package pakageone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserManager {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Aadhar a=new Aadhar();
//		a.setNumber(987654321);
//		a.setAddress("123,abc,abc");
//		
//		User u= new User();
//		u.setA(a);
//		u.setContact(887456781);
//		u.setName("arun");
//		
//		
//		et.begin();
//		em.persist(a);
//		em.persist(u);
//		et.commit();
//		
//		User u=em.find(User.class, 2);
//		Aadhar a=u.getA();
//		a.setAddress("234,qwwe,qe,wqe");
//		
//		
//		et.begin();
//		em.merge(u);
//		et.commit();
//		
//		User u1=em.find(User.class, 1);
//		Aadhar a1=u1.getA();
//		u.setA(null);
//		et.begin();
//		em.merge(u1);
//		em.remove(u1);
//		em.remove(a1);
//		et.commit();
		
//		Aadhar a= new Aadhar();
//		a.setAddress("00,hji,abc,ng");
//		a.setNumber(123456);
//		User u= new User();
//		u.setA(a);
//		u.setContact(3456789);
//		u.setName("vinoth");
//		et.begin();
//		em.persist(u);
//		et.commit();
		
		User u1=em.find(User.class, 5);
		User u2=em.find(User.class, 3);
		
		u1.getA().setAddress("abc,123,abc,567");
		et.begin();
		em.merge(u1);
		em.remove(u2);
		et.commit();
		
	
		
		
	}

}
