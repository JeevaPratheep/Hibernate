package pakageone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Brand;
	private int ram;
	private int Storage;
	@OneToMany(cascade = CascadeType.ALL)
	private List<sim> sims;
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
	public List<sim> getSims() {
		return sims;
	}
	public void setSims(List<sim> sims) {
		this.sims = sims;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", Brand=" + Brand + ", ram=" + ram + ", Storage=" + Storage + ", sims=" + sims
				+ "]";
	}
	
}
