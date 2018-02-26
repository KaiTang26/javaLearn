import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Tester {
	public static void main(String[] args){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=1; i<11; i++){
			al.add(rand.nextInt(100));
		}
		
		for(Integer x : al){
			System.out.println(x);;
		}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=1; i<11; i++){
			hm.put(i,rand.nextInt(100));
		}
		
		for(Integer x : hm.keySet()){
			System.out.println(x);
		}
		
//		for(Integer x : hm.values()){
//			System.out.print(x);
//		}
		
		HashMap<Integer, Student> student = new HashMap<Integer, Student>();
		
		student.put(0, new Student("Kai", 0, 4.0, "CS"));
		
		ArrayList<Student> sortStudent = new ArrayList<Student>();
		sortStudent.add(new Student("hah", 1, 5.0, "lala"));
		sortStudent.add(new Student("hah", 1, 2.0, "lala"));
		sortStudent.add(new Student("hah", 1, 3.0, "lala"));
		sortStudent.add(new Student("hah", 1, 4.0, "lala"));
		
		Collections.sort(sortStudent);
		
		System.out.println(sortStudent.get(3).getGpa());
		
		
	}

}
