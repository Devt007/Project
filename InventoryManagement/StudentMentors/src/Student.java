 
public class Student {

	private int id;
	private String name;
	private int standard;
	private int age;
	private String address;
	public Student(){
		
	}

	public Student(int id, String name,int standard, int age, String address) {
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.age = age;
		this.address = address;
		System.out.println("----------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddres(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
