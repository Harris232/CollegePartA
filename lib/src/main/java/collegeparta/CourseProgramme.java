package collegeparta;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class CourseProgramme {

private String name;
private List<Object> modules = new ArrayList<Object>();
private List<Object> students = new ArrayList<Object>();
private DateTime start, finish;

	public CourseProgramme(String name, List<Object> modules, List<Object> students, DateTime start, DateTime finsih) {
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.start = start;
		this.finish = finsih;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void addModules(Object m) {
		modules.add(m);
	}
	
	public List<Object> getModules() {
		return modules;
	}
	
	public void addStudents(Object s) {
		students.add(s);
	}
	
	public List<Object> getStudents(){
		return students;
	}
	
	public void setStart(DateTime s) {
		start = s;
	}
	
	public DateTime getStart() {
		return start;
	}
	
	public void setFinsih(DateTime f) {
		finish = f;
	}

	public DateTime getFinish() {
		return finish;
	}
	
	
	

	
}
