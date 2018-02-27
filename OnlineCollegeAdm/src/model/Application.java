package model;

import exceptions.StatusException;

public class Application {
	
	private Student student;
	
	private Major major;
	
	private String status;

	public Application(Student student, Major major) {
		super();
		this.student = student;
		this.major = major;
		this.status = "processing";
	}
	
	public Application(Student student, Major major, String status) {
		super();
		this.student = student;
		this.major = major;
		this.status = "approved";
	}
	
	private boolean checkStatus(String status){
		if(status == "processing" || status == "approved" || status =="accepted"){
			return true;
		}else{
			return false;
		}
	}

	public Student getStudent() {
		return student;
	}


	public Major getMajor() {
		return major;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws StatusException {
		
		if(!checkStatus(status)){
			throw new StatusException("status input is wrong");
		}
		this.status = status;
	}
	
	

}
