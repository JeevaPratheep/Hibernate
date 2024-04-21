package pakageone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String Brand;
	private int ram;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", Brand=" + Brand + ", ram=" + ram + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
