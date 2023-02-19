package in.ac.famt.PersonCRUD;

public class Person {
	int id;
	String name;
	int age;
	
	public Person() {
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PersonCRUID [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
}