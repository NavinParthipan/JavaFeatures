package com.infy.comparators;

import java.util.ArrayList;
import java.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;

class CoursesIdCompartor implements Comparator<Courses>{
	public int compare(Courses c1,Courses c2) {
		return c1.courseId - c2.courseId;
	}
}

class Courses implements Comparable<Courses>{
	public int courseId;
	public String courseName;
	
	Courses(int courseId,String courseName){
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return courseId+" "+courseName;
	}
	
	@Override
	public int compareTo(Courses otherCourse) {
		return this.courseName.compareTo(otherCourse.courseName);
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Courses> coursesList = new ArrayList<>();
		coursesList.add(new Courses(103,"Java"));
		coursesList.add(new Courses(102,"Python"));
		coursesList.add(new Courses(101,"C++"));
		coursesList.add(new Courses(104,"C"));
		
		Collections.sort(coursesList, new CoursesIdCompartor());
		System.out.println(coursesList);
		
	}
}
