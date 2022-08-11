package com.infy.innerClass;

class Grade{
	private char grade;
	public char calculateGrade(String employeeId,int points) {
		return grade;
	}
}

class Managers{
	Grade grade = new Grade(){
		private char grade;
		
		public char calculateGrade(String employeeId,int points) {
		if(points<=100 && points>=90) {
				grade = 'A';
		}
		else if(points<90 && points>70) {
				grade = 'B';
			}
		else {
				grade = 'C';
			}
		return grade;
		}
	};
	
	public char checkEmployeeGrade(String employeeId,int points) {
		return grade.calculateGrade(employeeId,points);
	}

		
}


public class AnonymousInnerClass {
	public static void main(String[] args) {
		Managers emp1 = new Managers();
		char grade = emp1.checkEmployeeGrade("101", 90);
		System.out.println("Grade :"+grade);
	}
}
