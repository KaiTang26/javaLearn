package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import controler.AppController;
import controler.MajorController;
import controler.UserController;
import exceptions.StatusException;
import model.Adminstrator;
import model.Application;
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
		
		AppController.addApp(new Application(new Student("Tim", "123", 3.4), new Major("Science", "hard"), "approved"));
		AppController.addApp(new Application(new Student("Tim", "123", 3.4), new Major("Arts", "Not very hard")));
		AppController.addApp(new Application(new Student("Tim", "123", 3.4), new Major("Business", "Make lots of money")));
		
		
		
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
			System.out.println("--------------------------------");
			System.out.println("Thank you so much for interested in our University, all of our major listed as above. Have a good day!");
			
		}else if(status.equals("a")){
			System.out.println("--------------------------------");
			System.out.println("Adminstrator Login page");
			System.out.println("Please login by useing name and password");
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("password:");
			String password=sc.next();
			
			login("a", name, password,0);
			
			if(!login("a", name, password,0)){
				System.out.println("name or password wrong");
				System.exit(0);
			}
			
			System.out.println("Adminstrator logged in");
			boolean next = true;
			
			while(next){
				System.out.println("view all application(v) or process application(p)  ?");
				String action4=sc.next();
				
				if(action4.equals("v")){
					System.out.println("--------------------------------");
					System.out.println("View:");
					viewHistory("all");
					
				}else if(action4.equals("p")){
					System.out.println("--------------------------------");
					System.out.println("Process application:");
					ArrayList<Application> appList = AppController.getAppList();
					for(Application i : appList){
						
						if(i.getStatus().equals("processing")){
							System.out.println("Name: "+i.getStudent().getName()+" & GPA: "+i.getStudent().getGPA()+"  & Major applied: "+i.getMajor().getObject());
							System.out.println("Do you want to give offer to this student(y/n):");
							String givOffer=sc.next();
							if(givOffer.equals("y")){
								try {
									i.setStatus("approved");
								} catch (StatusException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									e.getMessage();
								}
							}
						}
						
					}
					
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
			
		}else if(status.equals("s")){
			System.out.println("--------------------------------");
			System.out.println("Student Channel");
			System.out.println("signup(s) or login(l) ?");
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
					System.out.println("--------------------------------");
					System.out.println("Please login by useing name and password");
					System.out.println("major index:");
					int majorIndex=sc.nextInt();
					
					apply(majorIndex, new Student(name, password, GPA));
						
				}else if(action2.equals("h")){
					System.out.println("--------------------------------");
					System.out.println("History of application:");
					viewHistory(name);
					
					
				}else if(action2.equals("o")){
					System.out.println("--------------------------------");
					System.out.println("Accept offer:");
					ArrayList<Application> appList = AppController.getAppList();
					for(Application i : appList){
						
						if(i.getStatus().equals("approved") && i.getStudent().getName().equals(name)){
							System.out.println("Name: "+i.getStudent().getName()+"  & Major applied: "+i.getMajor().getObject()+"  & Current status: "+i.getStatus());
							System.out.println("Do you want to accept this offer(y/n):");
							String accOffer=sc.next();
							if(accOffer.equals("y")){
								try {
									i.setStatus("accepted");
								} catch (StatusException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									e.getMessage();
								}
							}
						}
						
					}
					
					
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
	
	public static void apply(int i, Student student){
		HashMap<Integer, Major> majorMap = MajorController.getMajorMap();
		
		if(!(i==1 || i==2 || i==3 || i==4)){
			System.out.println("please only input existing major index");
			
		}else{
			AppController.addApp(new Application(student, majorMap.get(i)));
			
			System.out.println("Application submited");
			
		}
		
	}
	
	public static void viewHistory(String check){
		ArrayList<Application> appList = AppController.getAppList();
		
		for(Application i : appList){
			
			if(check.equals(i.getStudent().getName())){
				System.out.println("Name: "+i.getStudent().getName()+"  & Major applied: "+i.getMajor().getObject()+"  & Current status: "+i.getStatus());
			}else if(check.equals("all")){
				
				System.out.println("Name: "+i.getStudent().getName()+"  & Major applied: "+i.getMajor().getObject()+"  & Current status: "+i.getStatus());
			}else{
				
			}
			
		}
		
	}
	 


}
