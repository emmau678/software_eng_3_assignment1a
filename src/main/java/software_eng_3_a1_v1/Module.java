package software_eng_3_a1_v1;

import java.util.ArrayList;

public class Module {
	private String name;
	private String id;
	private ArrayList<Student> students;
	private ArrayList<Course_Programme> associatedCourses;
	private String lecturer;
	
	/**
	 * Constructor for instantiating Module objects
	 * @param name a String representing the module name
	 * @param id a String representing the module ID
	 * @param lecturer a String representing the module lecturer
	 */
	public Module(String name, String id, String lecturer) {
		this.name = name;
		this.id = id;
		students = new ArrayList<Student>();
		associatedCourses = new ArrayList<Course_Programme>();
		this.lecturer = lecturer;
	}
	
	/**
	 * public accessor method for the module's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * public mutator method for the module's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * public accessor method for the module's ID
	 * @return id
	 */
	public String getID() {
		return id;
	}
	
	/**
	 * public mutator method for the module's ID
	 */
	public void setID(String id) {
		this.id = id;
	}
	
	/**
	 * public mutator method for the module's students
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	/**
	 * public method to add a student to the module's list
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * public method to remove a student from the module's list
	 */
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	/**
	 * public accessor method for the module's students
	 * @return students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	/**
	 * public mutator method for the module's associated courses
	 */
	public void setAssociatedCourses(ArrayList<Course_Programme> associatedCourses) {
		this.associatedCourses = associatedCourses;
	}
	
	/**
	 * public method to add a course to the module's associated courses
	 */
	public void addCourse(Course_Programme course) {
		associatedCourses.add(course);
	}
	
	/**
	 * public method to remove a course from the module's associated courses
	 */
	public void removeCourse(Course_Programme course) {
		associatedCourses.remove(course);
	}
	
	/**
	 * public accessor method for the module's associated courses
	 * @return associatedCourses
	 */
	public ArrayList<Course_Programme> getAssociatedCourses() {
		return associatedCourses;
	}
	
	/**
	 * public accessor method for the module's lecturer
	 * @return lecturer
	 */
	public String getLecturer() {
		return lecturer;
	}
	
	/**
	 * public mutator method for the module's lecturer
	 */
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
}
