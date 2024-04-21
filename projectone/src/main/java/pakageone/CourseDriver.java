package pakageone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Courses c1= new Courses();
//		c1.setName("Java");
//		
//		Courses c2= new Courses();
//		c2.setName("SQL");
//		
//		Courses c3= new Courses();
//		c3.setName("WebTech");
//		
//		Courses c4= new Courses();
//		c4.setName("C");
//		
//		
//		List<Courses> courses1= new ArrayList<Courses>();
//		courses1.add(c1);
//		courses1.add(c3);
//		
//
//		List<Courses> courses2= new ArrayList<Courses>();
//		courses2.add(c1);
//		courses2.add(c2);
//		courses2.add(c3);
//		
//		Students s1= new Students();
//		s1.setEmail("arun@gmail.com");
//		s1.setName("arun");
//		s1.setCourses(courses1);
//		
//		Students s2= new Students();
//		s2.setEmail("smith@gmail.com");
//		s2.setName("smith");
//		s2.setCourses(courses2);
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(c4);
//		et.commit();
		
//		Students s=em.find(Students.class, 2);
//
//		List<Courses> courses1=s.getCourses();
//		List<Courses> courses2=new ArrayList<Courses>();
//		for (Courses curs : courses1) {
//			if(curs.getCid()!=2) {
//					courses2.add(curs);
//			}
//		}
//		s.setCourses(courses2);
//		et.begin();
//		em.merge(s);
//		et.commit();

//		Students s=em.find(Students.class, 1);
//		Courses c=em.find(Courses.class, 4);
//		s.getCourses().add(c);
//		et.begin();
//		em.merge(s);
//		et.commit();
		
//		Courses c1=em.find(Courses.class, 1);
//		List<Students> students1=new ArrayList<Students>();
//		students1.add(em.find(Students.class, 1));
//		students1.add(em.find(Students.class, 2));
//		c1.setStudents(students1);
//		
//		Courses c2=em.find(Courses.class, 2);
//		List<Students> students2=new ArrayList<Students>();
//		students2.add(em.find(Students.class, 1));
//		c2.setStudents(students2);
//		
//		Courses c3=em.find(Courses.class, 3);
//		List<Students> students3=new ArrayList<Students>();
////		students3.add(em.find(Students.class, 1));
//		students3.add(em.find(Students.class, 2));
//		c3.setStudents(students3);
//		
//		Courses c=em.find(Courses.class, 4);
//		List<Students> students=new ArrayList<Students>();
//		students.add(em.find(Students.class, 1));
////		students.add(em.find(Students.class, 2));
//		c.setStudents(students);
//		
//		et.begin();
//		em.merge(c1);
//		em.merge(c2);
//		em.merge(c3);
//		em.merge(c);
//		et.commit();
//		
		
//		Students s2= em.find(Students.class, 2);
//		List<Courses> curs=s2.getCourses();
//		List<Courses> updated=new ArrayList<Courses>();
//		for(Courses c : curs) {
//			if(c.getCid()!=1)
//				{
//					updated.add(c);
//				}
//		}
//		Courses c1= em.find(Courses.class, 1);
//		List<Students> st1=c1.getStudents();
//		List<Students> st2=new ArrayList<Students>();
//		for (Students students : st1) {
//			if(students.getSid()!=2) {
//				st2.add(students);
//			}
//		}
//		
//		c1.setStudents(st2);
//		s2.setCourses(updated);
//		et.begin();
//		em.merge(c1);
//		em.merge(s2);
//		et.commit();
		
//		Students s3= new Students();
//		s3.setEmail("vijay@gmail.com");
//		s3.setName("vijay");
//		List<Courses> l1=new ArrayList<Courses>();
//		l1.add(em.find(Courses.class,2));
//		s3.setCourses(l1);
//		
//		Students s4= new Students();
//		s4.setEmail("rahul@gmail.com");
//		s4.setName("Rahul");
//		List<Courses> l2= new ArrayList<Courses>();
//		l2.add(em.find(Courses.class, 1));
//		l2.add(em.find(Courses.class, 2));
//		l2.add(em.find(Courses.class, 3));
//		s4.setCourses(l2);
//		
//		et.begin();
//		em.persist(s3);
//		em.persist(s4);
//		et.commit();
		Courses c2= em.find(Courses.class, 2);
		c2.getStudents().add(em.find(Students.class, 3));
		c2.getStudents().add(em.find(Students.class, 4));
		Courses c1= em.find(Courses.class, 1);
		c1.getStudents().add(em.find(Students.class, 4));
		Courses c3= em.find(Courses.class, 3);
		c3.getStudents().add(em.find(Students.class, 4));
		
		et.begin();
		em.merge(c1);
		em.merge(c2);
		em.merge(c3);
		et.commit();
		
	}
}
