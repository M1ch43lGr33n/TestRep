package readingFromFileAndEdit;

public class Person {
	
	String name;
	String dob;
	String occ;
	int salary;
	Animal pet;
	
	public Person(String name, String dob, String occ, int salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.occ = occ;
		this.salary = salary;
	}
	
	public void setAnimal(Animal animal){
		this.pet = animal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getOcc() {
		return occ;
	}

	public void setOcc(String occ) {
		this.occ = occ;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Animal getPet(){
		return this.pet;
	}
}
