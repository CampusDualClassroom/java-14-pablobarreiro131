package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"area='" + area + '\'' +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
