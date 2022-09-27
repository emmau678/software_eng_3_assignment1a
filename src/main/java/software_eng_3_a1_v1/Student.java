package software_eng_3_a1_v1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Student {
	private String name;
	private int age;
	private Date dob;
	private long id;
	private ArrayList<Course_Programme> courses;
	private ArrayList<Module> modules;
	private static int counter = 0; 	//static variable for assigning IDs to students,
										//increments each time a Student object is created
	
	/**
	 * Constructor for instantiating Student objects
	 * @param name a String representing the student's name
	 * @param age an int representing the student's age
	 * @param dob a String representing the student's date of birth
	 */
	public Student(String name, int age, String dob) {
		this.name = name;
		this.age = age;
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dob = s1.parse(dob);
		} catch (ParseException e) {
			System.out.println("Unexpected format of date string for date of birth. Enter date of format dd/MM/yyyy");
			e.printStackTrace();
		}
		courses = new ArrayList<Course_Programme>();
		modules = new ArrayList<Module>();
		counter++;
		id = counter;
	}
	
	/**
	 * public accessor method for the student's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * public mutator method for the student's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * public accessor method for the student's age
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * public mutator method for the student's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * public accessor method for the student's date of birth
	 * @return dob
	 */
	public Date getDob() {
		return dob;
	}
	
	/**
	 * public mutator method for the student's date of birth
	 * @param: date in a string format dd/MM/yyyy
	 */
	public void setDob(String dobString) {
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyy");
		try {
			dob = s1.parse(dobString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * public accessor method for the student's ID
	 * @return id
	 */
	public long getID() {
		return id;
	}
	
	/**
	 * public accessor method for the student's user name
	 * @return username
	 */
	public String getUsername() {
		return name + String.valueOf(age);
	}
	
	/**
	 * public mutator method for the student's courses
	 */
	public void setCourses(ArrayList<Course_Programme> courses) {
		this.courses = courses;
	}
	
	/**
	 * public method to add a course to the student's list
	 */
	public void addCourse(Course_Programme course) {
		courses.add(course);
	}
	
	/**
	 * public method to remove a course from the student's list
	 */
	public void removeCourse(Course_Programme course) {
		courses.remove(course);
	}
	
	/**
	 * public accessor method for the student's courses
	 * @return courses
	 */
	public ArrayList<Course_Programme> getCourses() {
		return courses;
	}
	
	/**
	 * public mutator method for the student's modules
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	/**
	 * public method to add a module to the student's list
	 */
	public void addModule(Module module) {
		modules.add(module);
	}
	
	/**
	 * public method to remove a module from the student's list
	 */
	public void removeModule(Module module) {
		modules.remove(module);
	}
	
	/**
	 * public accessor method for the student's modules
	 * @return modules
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}
	
}
