package student;
public class Student {
// mod
	
	private String name;
	private int id;
	
	// construct a new student with given fields
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//set methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// get methods
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	// return a string representation of the invoking object
	public String toString() {
		return "[" + name + ", " + id +  "]";
	}
}
	 
