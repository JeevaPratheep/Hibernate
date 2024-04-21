package pakageone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Students> students;
	
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
