
public class Task {
	private int id;
	private String description, assignedTask, status;
	
	public Task() {
		
	}
	public Task(int id, String description, String assignedTask, String status) {
		super();
		this.id = id;
		this.description = description;
		this.assignedTask = assignedTask;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssignedTask() {
		return assignedTask;
	}
	public void setAssignedTask(String assignedTask) {
		this.assignedTask = assignedTask;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
