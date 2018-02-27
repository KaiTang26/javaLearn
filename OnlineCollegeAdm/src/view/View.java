package view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import controler.MajorController;
import controler.UserController;
import model.Adminstrator;
import model.Major;
import model.Student;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		
		MajorController.addMap(1, new Major("Engineering", "Very hard"));
		MajorController.addMap(2, new Major("Arts", "Not very hard"));
		MajorController.addMap(3, new Major("Science", "hard"));
		MajorController.addMap(4, new Major("Business", "Make lots of money"));
		
		UserController.addUser(new Student("Tim", "123", 3.4));
		UserController.addUser(new Adminstrator("Kai", "123"));
		
		
		
		
		System.out.println("--------------------------------");
		System.out.println("Welcome to Queen's University");
		System.out.println("The major list show as following");
		System.out.println("--------------------------------");
		
		for(Major i : MajorController.getMajorMap().values()){
			System.out.println("Major: "+ i.getObject()+"    "+" Description: "+i.getDescription());	
		}
		
		
		System.out.println("--------------------------------");
		System.out.println("Are you guest/adminstrator/student?  please input \"g\" or \"a\" or \"s\"");
		String status=sc.next(); 
		
		
		if(status.equals("g")){
			
			System.out.println("this guest");
			
		}else if(status.equals("a")){
			
			System.out.println("this adminstrator");
			System.out.println("Please login by useing name and password");
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("password:");
			String password=sc.next();
			
			login("a", name, password,0);
			System.out.println(login("a", name, password, 0));
			
			
			
			
			
			
			
			
			
			
			
		}else if(status.equals("s")){
			System.out.println("--------------------------------");
			System.out.println("Student Channel");
			System.out.println("singup(s) or login(l) ?");
			String action1=sc.next();
			String name=null;
			String password =null;
			double GPA = 0;
			
			if(action1.equals("s")){
				System.out.println("Please login by useing name and password");
				System.out.println("Name:");
				name=sc.next();
				System.out.println("password:");
				password=sc.next();
				System.out.println("GPA:");
				GPA=sc.nextDouble();
				UserController.addUser(new Student(name, password, GPA));
				
			}else if(action1.equals("l")){
				System.out.println("Please login by useing name and password");
				System.out.println("Name:");
				name=sc.next();
				System.out.println("password:");
				password=sc.next();
				System.out.println("GPA:");
				GPA=sc.nextDouble();
				System.out.println(login("s", name, password, GPA));
				if(!login("s", name, password,GPA)){
					System.out.println("name or password or GPA wrong");
					System.exit(0);
				}
				System.out.println("hello");
				
			}else{
				System.out.println("wrong action");
				System.exit(0);
			}
			
			
			System.out.println("--------------------------------");
			System.out.println("-----------Profile--------------");
			System.out.println("name: "+ name);
			System.out.println("GPA: "+ GPA);
			System.out.println("--------------------------------");

			System.out.println("Check next action");
			
			boolean next = true;
			
			while(next){
				System.out.println("apply(a) or view history(h) or accept offer(o) ?");
				String action2=sc.next();
				
				if(action2.equals("a")){
					System.out.println("--------------------------------");
					System.out.println("Apply:");
					HashMap<Integer, Major> majorMap = MajorController.getMajorMap();
					Set entrySet = majorMap.entrySet();
					Iterator it = entrySet.iterator();
					while(it.hasNext()){
					       Map.Entry me = (Map.Entry)it.next();
					       System.out.println("Major index: "+me.getKey() + 
					       " & " +me.getValue());
					   }
					
					System.out.println(majorMap.get(2));
					
						
				}else if(action2.equals("h")){
					
					System.out.println("history");
					
					
				}else if(action2.equals("o")){
					
					System.out.println("offer");
					
				}else{
					System.out.println("wrong action");
					System.exit(0);
				}
				
				System.out.println("continue(c) or exit(e)");
				String action3=sc.next();
					if(action3.equals("e")){
						System.out.println("Thanks bye");
						System.exit(0);
					}
			}		
		}else{
			
			System.out.println("wrong input");
			System.exit(0);
			
		}
		
		
		
		sc.close();

	}
	
	public static boolean login(String status, String name, String password, double GPA){
		
		if(status.equals("a")){
			Adminstrator checkAdm = new Adminstrator(name,password);
			return UserController.checkAdminList(checkAdm);	
		}else{
			Student checkSt = new Student(name,password,3.4);
			
			return UserController.checkStudentList(checkSt);
		}
		
	}

}
