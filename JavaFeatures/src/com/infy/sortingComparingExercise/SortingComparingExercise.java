package com.infy.sortingComparingExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class StudentMarksComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.marks - s2.marks;
	}
}

class Student implements Comparable<Student>{
	public String name;
	public int marks;
	Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student otherStudent) {
		return this.name.compareTo(otherStudent.name);
	}
	
	@Override
	public String toString() {
		return name+": "+marks;
	}
}


public class SortingComparingExercise {
	public static void main(String[] args) {
		
		TreeSet<Student> studentMarks = new TreeSet<>();
		studentMarks.add(new Student("Navin", 97));
		studentMarks.add(new Student("Raja",88));
		studentMarks.add(new Student("Vinu", 100));
		studentMarks.add(new Student("Karthi",70));
		studentMarks.add(new Student("Mani",65));
		System.out.println(studentMarks);
		
		List<Student> studentList = new ArrayList<Student>(studentMarks);
		Collections.sort(studentList,new StudentMarksComparator());
		System.out.println(studentList);
	}
	
}
