package eom.emp;

public class Employee 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String designation;
	
	

	public Employee(int id, String name, int age, String gender, String designation) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}

//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public String getDesignation() {
//		return designation;
//	}
	@Override
	public String toString()
	{
		return "id="+id+"name="+name+"age="+age+"gender="+gender+"designation="+designation;
	}

}
