package pakageone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int A_id;
private long Number;
private String address;
public int getId() {
	return A_id;
}
public void setId(int id) {
	this.A_id = id;
}
public long getNumber() {
	return Number;
}
public void setNumber(long number) {
	Number = number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Aadhar [id=" + A_id + ", Number=" + Number + ", address=" + address + "]";
}

}
