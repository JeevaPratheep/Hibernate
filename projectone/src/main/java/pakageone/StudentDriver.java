package pakageone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class StudentDriver {
	public static void main(String[]args){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();


		Student s= new Student();
		s.setName("mohan");
		s.setContact(1234567890);
		s.setEmail("mohan@gmail.com");
		
		//to save data
		et.begin();
		em.persist(s);
		et.commit();
//
//
//		//to get one object from database
//		Student s1 = em.find(Student.class,2);
//		System.out.println(s1);
//
//
//		//delete one object from database
//		// to delete an object u need to find the object first then only we can delete the data from table
//		et.begin();
//		em.remove(s1);
//		et.commit();
//
//
//		//update data 
//		Student s2= em.find(Student.class,1);
//		s2.setEmail("new_email@gmail.com");
//		et.begin();
//		em.merge(s2);
//		et.commit();
	}
}
