package Models;

public class Person {
	private String Name, JobTitle;
	private int Age;
	
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	
	public Person() {}
	public Person(String Name, int Age, String JobTitle) {
		this.Name = Name;
		this.Age = Age;
		this.JobTitle = JobTitle;
	}
	
}
