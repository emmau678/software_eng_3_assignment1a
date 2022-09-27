package software_eng_3_a1_v1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Course_Programme {
	private String courseName;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;
	private DateTime startDate;
	private DateTime endDate;
	
	/**
	 * Constructor for instantiating Course Programme objects
	 * @param name a String representing the course name
	 * @param start a String representing the start date
	 * @param end a String representing the end date
	 */
	public Course_Programme(String courseName, String start, String end) {
		this.courseName = courseName;
		modules = new ArrayList<Module>();
		students = new ArrayList<Student>();
		try {
			startDate = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(start);
		} catch(IllegalArgumentException e) {
			System.out.println("Unexpected format of date-time string for start date. Enter date of format yyyy-MM-dd HH:mm:ss");
			e.printStackTrace();
		}
		try {
			endDate = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(end);
		} catch(IllegalArgumentException e) {
			System.out.println("Unexpected format of date-time string for end date. Enter date of format yyyy-MM-dd HH:mm:ss");
			e.printStackTrace();
		}
	}
	
	/**
	 * public accessor method for the course's name
	 * @return courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * public mutator method for the course's name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/**
	 * public mutator method for the course's students
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	/**
	 * public accessor method for the course's students
	 * @return students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	/**
	 * public method to add a student to the course's list
	 */
	public void addStudent(Student studentName) {
		students.add(studentName);
	}
	
	/**
	 * public method to remove a student from the course's list
	 */
	public void removeStudent(Student std1) {
		students.remove(std1);
	}
	
	/**
	 * public mutator method for the course's modules
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	/**
	 * public accessor method for the course's modules
	 * @return modules
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	/**
	 * public method to add a module to the course's list
	 */
	public void addModule(Module module) {
		modules.add(module);
	}
	
	/**
	 * public method to remove a module from the course's list
	 */
	public void removeModule(Module module) {
		modules.remove(module);
	}
	
	/**
	 * public accessor method for the course's start date
	 * @return startDate
	 */
	public DateTime getStartDate() {
		return startDate;
	}
	
	/**
	 * public mutator method for the course's start date
	 * @param: date in format "yyyy-MM-dd HH:mm:ss"
	 */
	public void setStartDate(String date) {
		try {
			startDate = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(date);
		} catch(IllegalArgumentException e) {
			System.out.println("Unexpected format of date-time string for start date. Enter date of format yyyy-MM-dd HH:mm:ss");
			e.printStackTrace();
		}
	}
	
	/**
	 * public accessor method for the course's end date
	 * @return endDate
	 */
	public DateTime getEndDate() {
		return endDate;
	}
	
	/**
	 * public mutator method for the course's end date
	 * @param: date in format "yyyy-MM-dd HH:mm:ss"
	 */
	public void setEndDate(String date) {
		try {
			endDate = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(date);
		} catch(IllegalArgumentException e) {
			System.out.println("Unexpected format of date-time string for end date. Enter date of format yyyy-MM-dd HH:mm:ss");
			e.printStackTrace();
		}
	}
}
