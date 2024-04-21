package Railway;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Train t1=new Train();
//		t1.setTrainNumher(1234);
//		t1.setNoofCoaches(4);
//		
//		Passenger p1= new Passenger();
//		p1.setName("murugan");
//		p1.setAge(40);
//		p1.setTrain(t1);
//		
//		Passenger p2= new Passenger();
//		p2.setName("ajay");
//		p2.setAge(32);
//		p2.setTrain(t1);
//	
//		Passenger p3= new Passenger();
//		p3.setName("smith");
//		p3.setAge(20);
//		p3.setTrain(t1);
//		
//		List<Passenger> l1= new ArrayList<Passenger>();
//		l1.add(p1);
//		l1.add(p2);
//		l1.add(p3);
//		
//		t1.setPassenger(l1);
//		
//		
//		et.begin();
//		em.persist(t1);
//		et.commit();
		
//		Train t1=em.find(Train.class,1);
//	
//		Passenger p4= new Passenger();
//		p4.setName("rahul");
//		p4.setAge(50);
//		p4.setTrain(t1);
//		
//		t1.getPassenger().add(p4);
//		
//		et.begin();
//		em.merge(t1);
//		et.commit();

		
//		Train t1= em.find(Train.class,1);
//		List<Passenger> l1=t1.getPassenger();
//		List<Passenger> l2= new ArrayList<Passenger>();
//		
//		for (Passenger passenger : l1) {
//			if(passenger.getPassengerId()!=1) {
//				l2.add(passenger);
//			}
//			else {
//				passenger.setTrain(null);
//				et.begin();
//				em.merge(passenger);
//				et.commit();
//			}
//		}
//		
//		t1.setPassenger(l2);
//		
//		et.begin();
//		em.merge(t1);
//		et.commit();
		
		
//		Train t1= em.find(Train.class, 1);
//		t1.setTrainNumher(98765);
//		
//		et.begin();
//		em.merge(t1);
//		et.commit();
		
		
//		Train t2= new Train();
//		t2.setNoofCoaches(8);
//		t2.setPassenger(null);
//		t2.setTrainNumher(12345);
//		
//		et.begin();
//		em.merge(t2);
//		et.commit();
		
		
		Train t1=em.find(Train.class, 1);
		Train t2=em.find(Train.class, 2);
		
		List<Passenger> l1=t1.getPassenger();
		List<Passenger> l2= new ArrayList<Passenger>();
		List<Passenger> l3= new ArrayList<Passenger>(); 
		
		for (Passenger passenger : l1) {
			if(passenger.getPassengerId()!=2) {
				l2.add(passenger);
			}
			else {
				passenger.setTrain(t2);
				et.begin();
				em.merge(passenger);
				et.commit();
				l3.add(passenger);
			}
		}
		
		t1.setPassenger(l2);
		t2.setPassenger(l3);
		et.begin();
		em.merge(t1);
		em.merge(t2);
		et.commit();

		
	}
}
