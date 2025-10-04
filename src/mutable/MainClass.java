package mutable;

public class MainClass {
	public static void main(String[] args) {

		Student stu = new Student(1, "Prabhakar", "Mumbai");
		System.out.println("Before Modifying The Student Object :- " + stu);

		// Mutating the same object using setter
		stu.setCity("Patna");

		System.out.println("After Modifying The Student Object :- " + stu);
	}
}
