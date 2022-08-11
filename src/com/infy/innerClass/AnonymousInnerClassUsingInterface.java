package com.infy.innerClass;

interface Grades{
	char grade  ='A';
	char calculateGrade(String employeeId,int points);
}
class ProjectManager{
	Grades grade1 = new Grades(){
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
		return grade1.calculateGrade(employeeId,points);
	}	
}

public class AnonymousInnerClassUsingInterface {
	public static void main(String[] args) {
		ProjectManager emp1 = new ProjectManager();
		char grade = emp1.checkEmployeeGrade("101", 70);
		System.out.println("Grade:"+grade);
	}
}
