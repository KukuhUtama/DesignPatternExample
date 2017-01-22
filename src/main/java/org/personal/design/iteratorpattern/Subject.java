package org.personal.design.iteratorpattern;

public class Subject {

	private String name;
	private String lecturer;
	private SubjectType type;
	
	public Subject(){
		
	}
	public Subject(String name, String lecturer, SubjectType type) {
		super();
		this.name = name;
		this.lecturer = lecturer;
		this.type = type;
	}
	public String getName() {
		return name;
	}

	public String getLecturer() {
		return lecturer;
	}

	public SubjectType getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", lecturer=" + lecturer + ", type=" + type + "]";
	}

}
