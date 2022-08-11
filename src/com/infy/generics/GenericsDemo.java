package com.infy.generics;

class Record<E>{
	public void display(E item) {
		System.out.println(item);
	}
}

class Student{
	private String studentName;
	private int regNo;
	public Student(int regNo, String studentName) {
		this.regNo = regNo;
		this.studentName = studentName;
	}
	public String toString() {
		return studentName+" "+regNo;
	}
}

class GenericsDemo {
	public static void main(String args[]) {
		Student s1 = new Student(101,"Navin");
		Record<Integer> integerRecord = new Record<Integer>();
		integerRecord.display(104);
		
		Record<Student> studentRecord = new Record<Student>();
		studentRecord.display(s1);
	}
	

}
