package com.infy.wildcard;

import java.util.ArrayList;
import java.util.List;

class Record<E>{
	List<E> record = new ArrayList<>();
	
	public String toString() {
		return "Record[ record"+record+"]";
	}
	
	public void add(E e) {
		record.add(e);
	}
	
	public void display() {
		System.out.println(record);
	}
}

class Student{
	String name;
	int id;
	
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "ID = "+id+", Name = "+name;
	}
}

class DayScholar extends Student{
	float stipend;
	
	public DayScholar(String name,int id,float stipend) {
		super(name,id);
		this.stipend = stipend;
	}
	
	public String toString() {
		return "ID = "+id+", Name = "+name+", Stipend = "+stipend;
	}
}

public class WildCardDemo {

	public static void main(String[] args) {
		Record<Student> studentRecord = new Record<>();
		Student student = new Student("Navin",179);
		
		Record<DayScholar> dayScholarRecord = new Record<>();
		DayScholar dayScolar = new DayScholar("Vinu", 110, 1000f);
		
		studentRecord.add(student);
		dayScholarRecord.add(dayScolar);
		
		studentRecord.display();
		dayScholarRecord.display();

	}

}
