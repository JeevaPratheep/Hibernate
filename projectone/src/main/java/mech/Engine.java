package mech;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private int noofCylenders;
	private String type;
	@OneToOne(cascade = CascadeType.ALL)
	private Car car;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getNoofCylenders() {
		return noofCylenders;
	}
	public void setNoofCylenders(int noofCylenders) {
		this.noofCylenders = noofCylenders;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", noofCylenders=" + noofCylenders + ", type=" + type + "]";
	}
	
}
