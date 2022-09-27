package software_eng_3_a1_v1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCourseProgramme {

	Course_Programme compsci;
	
	@BeforeEach
	public void setup() {
		compsci = new Course_Programme("BCT", "2022-09-10 09:00:00", "2023-06-10 09:00:00");
	}
	
	@Test
	void testGetCourseName() {
		assertEquals(compsci.getCourseName(), "BCT");
	}
	
	@Test
	void testGetStartDate() {
		assertEquals(compsci.getStartDate(), DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime("2022-09-10 09:00:00"));
	}
	
	@Test
	void testGetEndDate() {
		assertEquals(compsci.getEndDate(), DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime("2023-06-10 09:00:00"));
	}
	
	@Test
	void testGetModules() {
		assertEquals(compsci.getModules(), new ArrayList<Module>());
	}
	
	@Test
	void testGetStudents() {
		assertEquals(compsci.getStudents(), new ArrayList<Student>());
	}
	
	@Test
	void testSetCourseName() {
		String name = "BP";
		compsci.setCourseName(name);
		assertEquals(compsci.getCourseName(), name);
	}
	
	@Test
	void testSetStudents() {
		ArrayList<Student> studentArrayList = new ArrayList<Student>(Arrays.asList(
													new Student("studentA", 19, "03/03/2003"),
													new Student("studentB", 20, "04/04/2002"),
													new Student("studentC", 21, "05/05/2001")));
		compsci.setStudents(studentArrayList);
		assertEquals(compsci.getStudents(), studentArrayList);
	}
	
	@Test
	void testAddStudent() {
		Student student = new Student("studentD", 22, "06/06/2000");
		ArrayList<Student> currentStudents = compsci.getStudents();
		compsci.addStudent(student);
		currentStudents.add(student);
		assertEquals(compsci.getStudents(), currentStudents);
	}
	
	@Test
	void testRemoveStudent() {
		Student student = new Student("studentB", 20, "04/04/2002");
		ArrayList<Student> currentStudents = compsci.getStudents();
		compsci.removeStudent(student);
		currentStudents.remove(student);
		assertEquals(compsci.getStudents(), currentStudents);
	}
	
	@Test
	void testSetModules() {
		ArrayList<Module> moduleArrayList = new ArrayList<Module>(Arrays.asList(
												new Module("moduleA", "CS123", "lecturer1"),
												new Module("moduleB", "CS234", "lecturer2"),
												new Module("moduleC", "CS345", "lecturer3")));
		compsci.setModules(moduleArrayList);
		assertEquals(compsci.getModules(), moduleArrayList);
	}
	
	@Test
	void testAddModule() {
		Module module = new Module("moduleD", "CS456", "lecturer4");
		ArrayList<Module> currentModules = compsci.getModules();
		compsci.addModule(module);
		currentModules.add(module);
		assertEquals(compsci.getModules(), currentModules);
	}
	
	@Test
	void testRemoveModule() {
		Module module = new Module("moduleB", "CS234", "lecturer2");
		ArrayList<Module> currentModules = compsci.getModules();
		compsci.removeModule(module);
		currentModules.remove(module);
		assertEquals(compsci.getModules(), currentModules);
	}
	
	@Test
	void testSetStartDate() {
		String dateString = "2022-09-10 09:00:00";
		DateTime date = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(dateString);
		compsci.setStartDate(dateString);
		assertEquals(compsci.getStartDate(), date);
	}
	
	@Test
	void testSetEndDate() {
		String dateString = "2023-06-10 09:00:00";
		DateTime date = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(dateString);
		compsci.setStartDate(dateString);
		assertEquals(compsci.getEndDate(), date);
	}

}
