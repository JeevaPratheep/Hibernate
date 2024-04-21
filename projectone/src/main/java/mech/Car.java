package mech;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid ;
	private String Brand;
	private double Cost;
	@OneToOne(cascade = CascadeType.ALL)
	private Engine e;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", Brand=" + Brand + ", Cost=" + Cost + ", e=" + e + "]";
	}
	
	
}
