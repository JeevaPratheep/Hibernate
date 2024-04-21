package package2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Brand;
	private int ram;
	private int Storage;
	public int getId() {
		return id;
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
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", Brand=" + Brand + ", ram=" + ram + ", Storage=" + Storage + "]";
	}
	
}
