package com.faiz;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToMany;

public class Project {
	private int pid;
	private String ptitle;
	
	@ManyToMany(mappedBy="project")
	private List<Emp> project= new ArrayList<Emp>();

	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	
	public Project(int pid, String ptitle) {
		super();
		this.pid = pid;
		this.ptitle = ptitle;
	}

	

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public List<Emp> getProject() {
		return project;
	}

	public void setProject(List<Emp> project) {
		this.project = project;
	}

	public Project(int pid) {
		super();
		this.pid = pid;
	}

	
	

}
