package imutable;

//To make Object as imutable the rule is :- 
// 1 Make class as final
//2 Make all Variable as private final
// 3 provide only getter not setter(3So no one will set)
public final class Student {

	private final int id;
	private final String name;
	private final String city;

	Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
