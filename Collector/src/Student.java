
public class Student implements Comparable<Student>{
	private String name;
	private int student_id;
	private double gpa;
	private String major;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Student(String name, int student_id, double gpa, String major) {
		super();
		this.name = name;
		this.student_id = student_id;
		this.gpa = gpa;
		this.major = major;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.gpa > o.gpa){
			return 1;
		} else if(this.gpa < o.gpa){
			return -1;
		} else{
			return 0;
		}
	
	}

}
