package REST_API_CRUD_Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="mydb")
public class stud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleno;
	@Column(name="Stu_name")
	private String name;
	@Column(name="Stu_bach")
	private String bach;
	@Column(name="Stu_persent")
	private float persent;
	
	public stud() {
	}
	
	public stud(String name, String bach, float persent) {
		super();
		this.name = name;
		this.bach = bach;
		this.persent = persent;
	}

	public int getRoleno() {
		return roleno;
	}
	public void setRoleno(int roleno) {
		this.roleno = roleno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBach() {
		return bach;
	}
	public void setBach(String bach) {
		this.bach = bach;
	}
	public float getPersent() {
		return persent;
	}
	public void setPersent(float persent) {
		this.persent = persent;
	}
	@Override
	public String toString() {
		return "stud [roleno=" + roleno + ", name=" + name + ", bach=" + bach + ", persent=" + persent + "]";

		
		//	System.out.println(" These is Live server ... ");
	}
	
}
