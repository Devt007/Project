/*
  Add details of a student.
  Sort the students on the base of name
  Display students with pending fees
  Update the submitted-fee for a particular student.
  Display all students of particular class
  Exit
 */
public class Student {

	private int id;
	private String name;
	private int cls;
	private String phonedetails;
	private int totalfee;
	private int feeSubmitted;
	public Student(){
		
	}

	public Student(int id, String name, int cls, String phonedetails, int totalfee, int feesubmitted) {
		this.id = id;
		this.name = name;
		this.cls = cls;
		this.phonedetails = phonedetails;
		this.totalfee = totalfee;
		this.feeSubmitted = feesubmitted;
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

	public int getCls() {
		return cls;
	}

	public void setCls(int cls) {
		this.cls = cls;
	}

	public String getPhonedetails() {
		return phonedetails;
	}

	public void setPhonedetails(String phonedetails) {
		this.phonedetails = phonedetails;
	}

	public int getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(int totalfee) {
		this.totalfee = totalfee;
	}

	public int getFeeSubmitted() {
		return feeSubmitted;
	}

	public void setFeeSubmitted(int feeSubmitted) {
		this.feeSubmitted = feeSubmitted;
	}

	

}
