package Railway;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PassengerId;
	private String name;
	private int Age;
	@ManyToOne
	private Train train;
	
	
	
	public int getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	
	
	
}
