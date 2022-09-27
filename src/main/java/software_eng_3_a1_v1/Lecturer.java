package software_eng_3_a1_v1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class Lecturer {
	private String name;
	private int age;
	private Date dob;
	private long id;
	private ArrayList<Module> modulesTeaching;
	static int counter = 0; 	//static variable for assigning IDs to lecturers,
										//increments each time a Lecturer object is created
	
	/**
	 * Constructor for instantiating Lecturer objects
	 * @param name a String representing the lecturer's name
	 * @param age an int representing the lecturer's age
	 * @param dob a String representing the lecturer's date of birth
	 */
	public Lecturer(String name, int age, String dob) {
		this.name = name;
		this.age = age;
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyy");
		try {
			this.dob = s1.parse(dob);
		} catch (ParseException e) {
			System.out.println("Unexpected format of date string for date of birth. Enter date of format dd/MM/yyyy");
			e.printStackTrace();
		}
		modulesTeaching = new ArrayList<Module>();
		counter++;
		id = counter;
	}
	
	/**
	 * public accessor method for the lecturer's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * public mutator method for the lecturer's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * public accessor method for the lecturer's age
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * public mutator method for the lecturer's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * public accessor method for the lecturer's date of birth
	 * @return dob
	 */
	public Date getDob() {
		return dob;
	}
	
	/**
	 * public mutator method for the lecturer's date of birth
	 * @param: date in a string format dd/MM/yyyy
	 */
	public void setDob(String dobString) {
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyy");
		try {
			dob = s1.parse(dobString);
		} catch (ParseException e) {
			System.out.println("Unexpected format of date string for date of birth. Enter date of format dd/MM/yyyy");
			e.printStackTrace();
		}
	}
	
	/**
	 * public accessor method for the lecturer's ID
	 * @return id
	 */
	public long getID() {
		return id;
	}
	
	/**
	 * public accessor method for the lecturer's user name
	 * @return username
	 */
	public String getUsername() {
		return name + String.valueOf(age);
	}
	
	/**
	 * public mutator method for the lecturer's modules
	 */
	public void setModulesTeaching(ArrayList<Module> modulesTeaching) {
		this.modulesTeaching = modulesTeaching;
	}
	
	/**
	 * public method to add a module to the lecturer's list
	 */
	public void addModule(Module module) {
		modulesTeaching.add(module);
	}
	
	/**
	 * public method to remove a module from the lecturer's list
	 */
	public void removeModule(Module module) {
		modulesTeaching.remove(module);
	}
	
	/**
	 * public accessor method for the lecturer's modules
	 * @return modulesTeaching
	 */
	public ArrayList<Module> getModulesTeaching() {
		return modulesTeaching;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (!(o instanceof Lecturer)) {
			return false;
		}

		Lecturer c = (Lecturer) o;

		return Objects.equals(this.name, c.getName())
				&& this.age == c.getAge()
				&& this.dob == c.getDob();
	}
	
}