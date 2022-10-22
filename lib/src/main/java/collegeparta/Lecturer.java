package collegeparta;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {
	
private String name, age, dob, id, username;
private List<Object> modules = new ArrayList<Object>();

	public Lecturer(String name, String age, String dob, String id, List<Object> modules) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.modules = modules;
		username = name + age;
	}
	
	public String getUsername() {
		username = name + age;
		return username;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(String a) {
		age =a;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setDOB(String d) {
		dob = d;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public void setID(String i) {
		id = i;
	}
	
	public String getID() {
		return id;
	}
	
	public void setModules(List<Object> m) {
		modules = m;
	}
	
	public List<Object> getModules() {
		return modules;
	}
	
}