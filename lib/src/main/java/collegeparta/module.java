package collegeparta;

import java.util.ArrayList;
import java.util.List;

public class module {

private String name, id, lecturer;
private List<Object> students = new ArrayList<Object>();
private List<String> courses = new ArrayList<String>();

	public module(String name, String id, String lecturer, List<Object> students, List<String> courses) {
		this.name = name;
		this.id = id;
		this.lecturer = lecturer;
		this.students = students;
		this.courses = courses;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setID(String i) {
		id = i;
	}
	
	public String getID() {
		return id;
	}
	
	public void setLecturer(String l) {
		lecturer = l;
	}
	
	public String getLecturer() {
		return lecturer;
	}
	
	public void addStudents(Object s) {
		students.add(s);
	}
	
	public List<Object> getStudents(){
		return students;
	}
	
	public void addCourse(String s) {
		courses.add(s);
	}
	
	public List<String> getCourses(){
		return courses;
	}
	
	

	
	


}
