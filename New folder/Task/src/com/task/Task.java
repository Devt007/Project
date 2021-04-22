package com.task;

public class Task {

	private int id;
	private String description;
	private String assignedto;
	private String status;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(int id, String description, String assignedto, String status) {
		super();
		this.id = id;
		this.description = description;
		this.assignedto = assignedto;
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

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
