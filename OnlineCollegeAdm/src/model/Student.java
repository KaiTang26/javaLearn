package model;

public class Student extends User{
	
	private double GPA;

	public Student(String name, String password, double GPA) {
		super(name, password);
		// TODO Auto-generated constructor stub
		this.GPA = GPA;
	}

	public double getGPA() {
		return GPA;
	}



}
