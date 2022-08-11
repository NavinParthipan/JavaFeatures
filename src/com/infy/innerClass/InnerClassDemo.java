package com.infy.innerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Manager{
	class Grade{
		private char grade;
		
		public char calculateGrade(String employeeId,int points) {
			if(validateEmployee(employeeId)) {
				if(points<=100 && points>=90) {
					grade = 'A';
				}
				else if(points<90 && points>70) {
					grade = 'B';
				}
				else {
					grade = 'C';
				}
			}
			return grade;
		}
		
		public boolean validateEmployee(String employeeId){
			List<String> empList = new ArrayList<>(Arrays.asList("101","103"));
			
			if(empList.contains(employeeId)){
				return true;
			}
			return false;
		}
	}
	
	public char checkEmployeeGrade(String employeeId,int points) {
		Grade grade = new Grade();
		return grade.calculateGrade(employeeId,points);
	}

		
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager emp1 = new Manager();
		char grade = emp1.checkEmployeeGrade("101", 80);
		System.out.println("Grade:"+grade);
		

	}

}
