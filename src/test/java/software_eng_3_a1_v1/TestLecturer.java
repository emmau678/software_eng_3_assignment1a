package software_eng_3_a1_v1;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLecturer {

	Lecturer lecturer1;
	
	@BeforeEach
	public void setup() {
		lecturer1 = new Lecturer("Bill_Gates", 60, "01/01/1962");
	}
	
	@Test
	void testGetName() {
		assertEquals(lecturer1.getName(), "Bill_Gates");
	}
	
	@Test
	void testGetID() {
		assertEquals(lecturer1.getID(), Lecturer.counter);
	}
	
	@Test
	void testGetUsername() {
		assertEquals(lecturer1.getUsername(), "Bill_Gates60");
	}
	
	@Test
	void testGetAge() {
		assertEquals(lecturer1.getAge(), 60);
	}
	
	@Test
	void testGetDob() {
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			assertEquals(lecturer1.getDob(), s1.parse("01/01/1962"));
		} catch (ParseException e) {
			fail();
			e.printStackTrace();
		}
	}
	
	@Test
	void testSetDob() {
		String dateString = "24/03/1962";
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			lecturer1.setDob(dateString);
			assertEquals(lecturer1.getDob(), s1.parse(dateString));
		} catch (ParseException e) {
			fail();
			e.printStackTrace();
		}
	}
	
	@Test
	void testGetModulesTeaching() {
		assertEquals(lecturer1.getModulesTeaching(), new ArrayList<Module>());
	}
	
	@Test
	void testSetModulesTeaching() {
		ArrayList<Module> moduleArrayList = new ArrayList<Module>(Arrays.asList(
												new Module("modA", "MA123", lecturer1),
												new Module("modB", "MA234", lecturer1),
												new Module("modC", "MA345", lecturer1)));
		lecturer1.setModulesTeaching(moduleArrayList);
		assertEquals(lecturer1.getModulesTeaching(), moduleArrayList);
	}
	
	@Test
	void testAddModule() {
		Module module = new Module("modD", "MA456", lecturer1);
		ArrayList<Module> currentModules = lecturer1.getModulesTeaching();
		lecturer1.addModule(module);
		currentModules.add(module);
		assertEquals(lecturer1.getModulesTeaching(), currentModules);
	}
	
	@Test
	void testRemoveModule() {
		Module module = new Module("modB", "MA234", lecturer1);
		ArrayList<Module> currentModules = lecturer1.getModulesTeaching();
		lecturer1.removeModule(module);
		currentModules.remove(module);
		assertEquals(lecturer1.getModulesTeaching(), currentModules);
	}
	
	@Test
	void testSetName() {
		String name = "Steve_Jobs";
		lecturer1.setName(name);
		assertEquals(lecturer1.getName(), name);
	}
	
	@Test
	void testSetAge() {
		int age = 65;
		lecturer1.setAge(age);
		assertEquals(lecturer1.getAge(), age);
	}
	
}
