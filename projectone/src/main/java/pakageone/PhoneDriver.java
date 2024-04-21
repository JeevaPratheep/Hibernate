package pakageone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PhoneDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		sim s1=new sim();
//		s1.setType("prepaid");
//		s1.setCost(500);
//		
//		sim s2=new sim();
//		s2.setType("prepaid");
//		s2.setCost(300);
//		
//		sim s3=new sim();
//		s3.setType("postpaid");
//		s3.setCost(1000);
//		
//		List<sim> sims=new ArrayList<sim>();
//		sims.add(s1);
//		sims.add(s2);
//		sims.add(s3);
//		
//		Phone ph= new Phone();
//		ph.setBrand("Asus");
//		ph.setRam(8);
//		ph.setStorage(128);
//		ph.setSims(sims);
//		
//		et.begin();
//		em.persist(ph);
//		et.commit();
//		
//		sim s4= new sim();
//		s4.setCost(500);
//		s4.setType("5g");
//		
//		sim s5= new sim();
//		s5.setCost(100);
//		s5.setType("4g");
//		
//		Phone ph1= new Phone();
//		ph1.setBrand("Redmagic");
//		ph1.setRam(16);
//		ph1.setStorage(512);
//		ph1.setSims(null);
//		
//		
//		et.begin();
//		em.persist(s5);
//		em.persist(s4);
//		em.persist(ph1);
//		et.commit();
		
//		Phone ph=em.find(Phone.class, 2);
//		List<sim> sims= new ArrayList<sim>();
//		sims.add(em.find(sim.class,4));
//		sims.add(em.find(sim.class,5));
//		ph.setSims(sims);
//		et.begin();
//		em.merge(ph);
//		et.commit();
//		
		
//		Phone ph=em.find(Phone.class, 2);
//
//		List<sim> sims=ph.getSims();
//		List<sim> sims2=new ArrayList<sim>();
//		for (sim sim : sims) {
//			if(sim.getSid()!=5) {
//					sims2.add(sim);
//			}
//		}
//		ph.setSims(sims2);
//		et.begin();
//		em.merge(ph);
//		et.commit();
//
//		

		
		Phone ph=em.find(Phone.class, 2);
		List<sim> simList=ph.getSims();
		sim s1= new sim();
		
		s1.setCost(80);
		s1.setType("2G");
		
		simList.add(s1);
		
		et.begin();
		em.merge(ph);
		et.commit();
		
	}

}
