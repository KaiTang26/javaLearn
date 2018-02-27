package controler;

import java.util.ArrayList;

import model.Adminstrator;
import model.Student;
import model.User;

public class UserController {
	
	private static ArrayList<User> studentList = new ArrayList<User>();
	private static ArrayList<User> AdminList = new ArrayList<User>();
	
	
	public static boolean checkStudentList(User st) {
		
		return studentList.contains(st);
	}
	
	public static boolean checkAdminList(Adminstrator ad) {
		return AdminList.contains(ad);
	}
	
	public static void addUser(User user) {
		if(user instanceof Student){
			
			studentList.add(user);
			
		}else if(user instanceof Adminstrator){
			AdminList.add(user);
		}
	}
	
	
	

}
