package com.dev.contacts;

public class Contact {
	 private String name;
	 private long phoneno;
	 private String message;
	 private String group;
	 public String getGroup() {
		 return group;
		 
	 }
	public void setGroup (String group) {
		this.group= group;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name = name;	
	}
	@Override
	public String toString() {
		return "Contact[name= "+ name +",phoneno =" +phoneno+",message="+ message+",group="+group+"]";
				
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setphoneno(long Phoneno) {
		this .phoneno=phoneno;
		
}
	public String getMessage() {
		return message;
		
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void contact(Contact a) {
		// TODO Auto-generated method stub
		
	}
}