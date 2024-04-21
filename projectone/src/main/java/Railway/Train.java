package Railway;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainID;
	private int TrainNumher;
	private int NoofCoaches;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "train_passengers",
				joinColumns = @JoinColumn(name="train_id"),
				inverseJoinColumns = @JoinColumn(name="pass_id"))
	List<Passenger> passenger;
	public int getTrainID() {
		return trainID;
	}
	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}
	public int getTrainNumher() {
		return TrainNumher;
	}
	public void setTrainNumher(int trainNumher) {
		TrainNumher = trainNumher;
	}
	public int getNoofCoaches() {
		return NoofCoaches;
	}
	public void setNoofCoaches(int noofCoaches) {
		NoofCoaches = noofCoaches;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
	
}
