package com.infy.comparing;

import java.util.ArrayList;
import java.util.Collections;

public class Course implements Comparable<Course>{
	public int courseId;
	public String courseName;
	
	Course(int courseId,String courseName){
		this.courseId  = courseId;
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return courseId+" "+courseName;
	}
	
	@Override
	public int compareTo(Course otherCourses) {
		return this.courseName.compareTo(otherCourses.courseName);
	}
	
	public static void main(String[] args) {
		ArrayList<Course> courseList = new ArrayList<>();
		courseList.add(new Course(101, "Java"));
		courseList.add(new Course(102,"Python"));
		courseList.add(new Course(103,"C++"));
		courseList.add(new Course(104, "C"));
		
		Collections.sort(courseList);
		System.out.println(courseList);
	}
	
}
