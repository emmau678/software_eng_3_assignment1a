package software_eng_3_a1_v1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestModule {

	Module testmod;
	
	@BeforeEach
	public void setup() {
		testmod = new Module("Networks", "CT123", new Lecturer("prof1", 30, "22/09/1992"));
	}
	
	@Test
	void testGetName() {
		assertEquals(testmod.getName(), "Networks");
	}
	
	@Test
	void testGetID() {
		assertEquals(testmod.getID(), "CT123");
	}
	
	@Test
	void testGetAssociatedCourses() {
		assertEquals(testmod.getAssociatedCourses(), new ArrayList<Course_Programme>());
	}
	
	@Test
	void testGetStudents() {
		assertEquals(testmod.getStudents(), new ArrayList<Student>());
	}
	
	@Test
	void testSetStudents() {
		ArrayList<Student> studentArrayList = new ArrayList<Student>(Arrays.asList(
													new Student("studentA", 19, "03/03/2003"),
													new Student("studentB", 20, "04/04/2002"),
													new Student("studentC", 21, "05/05/2001")));
		testmod.setStudents(studentArrayList);
		assertEquals(testmod.getStudents(), studentArrayList);
	}
	
	@Test
	void testAddStudent() {
		Student student = new Student("studentD", 22, "06/06/2000");
		ArrayList<Student> currentStudents = testmod.getStudents();
		testmod.addStudent(student);
		currentStudents.add(student);
		assertEquals(testmod.getStudents(), currentStudents);
	}
	
	@Test
	void testRemoveStudent() {
		Student student = new Student("studentB", 20, "04/04/2002");
		ArrayList<Student> currentStudents = testmod.getStudents();
		testmod.removeStudent(student);
		currentStudents.remove(student);
		assertEquals(testmod.getStudents(), currentStudents);
	}
	
	@Test
	void testSetAssociatedCourses() {
		ArrayList<Course_Programme> courseArrayList = new ArrayList<Course_Programme>(Arrays.asList(
															new Course_Programme("courseA", "2022-10-01 09:00:00", "2022-08-01 09:00:00"),
															new Course_Programme("courseB", "2022-10-02 09:00:00", "2022-08-02 09:00:00"),
															new Course_Programme("courseC", "2022-10-03 09:00:00", "2022-08-03 09:00:00")));
		testmod.setAssociatedCourses(courseArrayList);
		assertEquals(testmod.getAssociatedCourses(), courseArrayList);
	}
	
	@Test
	void testAddCourse() {
		Course_Programme course = new Course_Programme("courseD", "2022-10-04 09:00:00", "2022-08-04 09:00:00");
		ArrayList<Course_Programme> currentCourses = testmod.getAssociatedCourses();
		testmod.addCourse(course);
		currentCourses.add(course);
		assertEquals(testmod.getAssociatedCourses(), currentCourses);
	}
	
	@Test
	void testRemoveCourse() {
		Course_Programme course = new Course_Programme("courseB", "2022-10-02 09:00:00", "2022-08-02 09:00:00");
		ArrayList<Course_Programme> currentCourses = testmod.getAssociatedCourses();
		testmod.removeCourse(course);
		currentCourses.remove(course);
		assertEquals(testmod.getAssociatedCourses(), currentCourses);
	}
	
	@Test
	void testSetLecturer() {
		Lecturer lecturer = new Lecturer("prof2", 55, "22/09/1967");
		testmod.setLecturer(lecturer);
		assertEquals(testmod.getLecturer(), lecturer);
	}
	
	@Test
	void testSetName() {
		String name = "best-module";
		testmod.setName(name);
		assertEquals(testmod.getName(), name);
	}
	
	@Test
	void testSetID() {
		String id = "XYZ678";
		testmod.setID(id);
		assertEquals(testmod.getID(), id);
	}

}
