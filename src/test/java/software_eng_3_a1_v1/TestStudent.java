package software_eng_3_a1_v1;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStudent {

	Student student1;
	
	@BeforeEach
	public void setup() {
		student1 = new Student("Emma_Whyte", 20, "01/01/2002");
	}
	
	@Test
	void testGetName() {
		assertEquals(student1.getName(), "Emma_Whyte");
	}
	
	@Test
	void testGetID() {
		assertEquals(student1.getID(), Student.counter);
	}
	
	@Test
	void testGetUsername() {
		assertEquals(student1.getUsername(), "Emma_Whyte20");
	}
	
	@Test
	void testGetAge() {
		assertEquals(student1.getAge(), 20);
	}
	
	@Test
	void testGetCourses() {
		assertEquals(student1.getCourses(), new ArrayList<Course_Programme>());
	}
	
	@Test
	void testGetModules() {
		assertEquals(student1.getModules(), new ArrayList<Module>());
	}
	
	@Test
	void testGetDob() {
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			assertEquals(student1.getDob(), s1.parse("01/01/2002"));
		} catch (ParseException e) {
			fail();
			e.printStackTrace();
		}
	}
	
	@Test
	void testSetName() {
		String name = "Emily_Bell";
		student1.setName(name);
		assertEquals(student1.getName(), name);
	}
	
	@Test
	void testSetAge() {
		int age = 23;
		student1.setAge(age);
		assertEquals(student1.getAge(), age);
	}
	
	@Test
	void testSetDob() {
		String dateString = "21/09/2002";
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			student1.setDob(dateString);
			assertEquals(student1.getDob(), s1.parse(dateString));
		} catch (ParseException e) {
			fail();
			e.printStackTrace();
		}
	}
	
	@Test
	void testSetCourses() {
		ArrayList<Course_Programme> courseArrayList = new ArrayList<Course_Programme>(Arrays.asList(
															new Course_Programme("CourseA", "2022-01-01 09:00:00", "2023-07-01 09:00:00"),
															new Course_Programme("CourseB", "2022-01-02 09:00:00", "2023-07-02 09:00:00"),
															new Course_Programme("CourseC", "2022-01-03 09:00:00", "2023-07-03 09:00:00")));
		student1.setCourses(courseArrayList);
		assertEquals(student1.getCourses(), courseArrayList);
	}
	
	@Test
	void testAddCourse() {
		Course_Programme course = new Course_Programme("CourseD", "2022-01-04 09:00:00", "2023-07-04 09:00:00");
		ArrayList<Course_Programme> currentCourses = student1.getCourses();
		student1.addCourse(course);
		currentCourses.add(course);
		assertEquals(student1.getCourses(), currentCourses);
	}
	
	@Test
	void testRemoveCourse() {
		Course_Programme course = new Course_Programme("CourseB", "2022-01-02 09:00:00", "2023-07-02 09:00:00");
		ArrayList<Course_Programme> currentCourses = student1.getCourses();
		student1.removeCourse(course);
		currentCourses.remove(course);
		assertEquals(student1.getCourses(), currentCourses);
	}
	
	@Test
	void testSetModules() {
		ArrayList<Module> moduleArrayList = new ArrayList<Module>(Arrays.asList(
												new Module("modA", "CT123", new Lecturer("dr1", 30, "29/08/1992")),
												new Module("modB", "CT234", new Lecturer("dr2", 35, "02/02/1987")),
												new Module("modC", "CT345", new Lecturer("dr3", 40, "13/05/1982"))));
		student1.setModules(moduleArrayList);
		assertEquals(student1.getModules(), moduleArrayList);
	}
	
	@Test
	void testAddModule() {
		Module module = new Module("modD", "CT456", new Lecturer("dr4", 60, "20/09/1962"));
		ArrayList<Module> currentModules = student1.getModules();
		student1.addModule(module);
		currentModules.add(module);
		assertEquals(student1.getModules(), currentModules);
	}
	
	@Test
	void testRemoveModule() {
		Module module = new Module("modB", "CT234", new Lecturer("dr2", 35, "02/02/1987"));
		ArrayList<Module> currentModules = student1.getModules();
		student1.removeModule(module);
		currentModules.remove(module);
		assertEquals(student1.getModules(), currentModules);
	}

}
