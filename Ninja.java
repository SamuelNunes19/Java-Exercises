package ie.atu.sw;

import java.time.LocalDate;
import java.util.Objects;

public class Ninja implements Cloneable {
	private long id;
	private String name;
	private LocalDate dob;
	private int level;

	// Generate bean method here from Source menu
	public long getId() {
		return id;
	}

	

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Ninja(long id, String name, LocalDate dob, int level) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.level = level;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		return "Ninja [id=" + id + ", name=" + name + ", dob=" + dob + ", level=" + level + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ninja other = (Ninja) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	

}
