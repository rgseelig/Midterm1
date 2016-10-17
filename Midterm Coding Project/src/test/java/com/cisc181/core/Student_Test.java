package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.UUID.*;


import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {
	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
}
	Course Cisc181 = new Course("Cisc181", UUID.randomUUID(), 1);
	Course Chem221 = new Course("Chem221", UUID.randomUUID(), 2);
	Course Physics101 = new Course("Physics101", UUID.randomUUID(), 3);
ArrayList<Course> Courses = new ArrayList<Course>(Arrays.asList(Cisc181, Chem221, Physics101));
	
Semester Fall = new Semester(UUID.randomUUID(), Date(2016, 8, 20), Date(2016, 12, 20));
Semester Spring = new Semester(UUID.randomUUID(), Date(2016, 1, 25), Date(2017, 5, 21));
ArrayList<Semester> Semesters = new ArrayList<Semester>(Arrays.asList(Fall,Spring));


		Student Jane = new Student("Jane", null, "Quin", Date(1996, 2, 7), eMajor.BUSINESS,
				null,"121-121-1212", "email@email.com");
		Student Albert = new Student("Albert", null, "Einstein", Date(1996, 2, 7), eMajor.COMPSI, null,"121-121-1212",
				"email@email.com");
		Student Cooper = new Student("Cooper", null, "Cod", Date(1996, 2, 7), eMajor.CHEM, null,"121-121-1212",
				"email@email.com");
		Student Steven = new Student("Steven", null, "Louis", Date(1996, 2, 7), eMajor.PHYSICS,
				null,"121-121-1212", "email@email.com");
		Student Daniel = new Student("Daniel", null, "Blewvas", Date(1996, 2, 7), eMajor.NURSING,
				null,"121-121-1212", "email@email.com");
		Student Russel = new Student("Russel", null, "Upser", Date(1996, 2, 7), eMajor.BUSINESS,
				null,"121-121-1212", "email@email.com");
		Student Eli = new Student("Eli", null, "Manning", Date(1996, 2, 7), eMajor.COMPSI, null,"121-121-1212",
				"email@email.com");
		Student Sarah = new Student("Sarah", null, "Mario", Date(1996, 2, 7), eMajor.CHEM, null,"121-121-1212",
				"email@email.com");
		Student Morgan = new Student("Morgan", null, "Looper", Date(1996, 2, 7), eMajor.CHEM,
				null,"121-121-1212", "email@email.com");
		Student Kyle = new Student("Kyle", null, "Hunter", Date(1996, 2, 7), eMajor.PHYSICS,
				null,"121-121-1212", "email@email.com");
		ArrayList<Student> Students = new ArrayList<Student>(
				Arrays.asList(Jane, Albert, Cooper, Steven, Daniel, Russel, Eli, Sarah, Morgan, Kyle));
		
		Section Cisc181011=new Section(Cisc181.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 11);
		
		Section Cisc181012=new Section(Cisc181.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 11);
		
		Section Chem221011=new Section(Chem221.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 100);
		
		Section Chem221012=new Section(Chem221.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 100);
		
		Section Physics101011=new Section(Physics101.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 67);
		
		Section Physics101012=new Section(Physics101.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 67);
		
	
		
		ArrayList<Section> Sections=new ArrayList<Section>(
				Arrays.asList(Cisc181011, Cisc181012,Chem221011,Chem221012,Physics101011,Physics101012));
				
		
		
		@BeforeClass
		public static void setup() {
	}
	

	@Test
	public void test() {
		Enrollment Jane = new Enrollment(Cisc181011.getSectionID(), Jane.getStudentID());
		Enrollment Albert = new Enrollment(Cisc181011.getSectionID(), Albert.getStudentID());
		Enrollment Cooper = new Enrollment(Cisc181012.getSectionID(), Cooper.getStudentID());
		Enrollment Steven = new Enrollment(Cisc181012.getSectionID(), Steven.getStudentID());
		Enrollment Daniel = new Enrollment(Chem221011.getSectionID(), Daniel.getStudentID());
		Enrollment Russel = new Enrollment(Chem221011.getSectionID(), Russel.getStudentID());
		Enrollment Eli = new Enrollment(Chem221012.getSectionID(), Eli.getStudentID());
		Enrollment Sarah = new Enrollment(Chem221012.getSectionID(), Sarah.getStudentID());
		Enrollment Morgan = new Enrollment(Physics101011.getSectionID(), Morgan.getStudentID());
		Enrollment Kyle = new Enrollment(Physics101012.getSectionID(), Kyle.getStudentID());
		ArrayList<Enrollment> Enrollments = new ArrayList<Enrollment>();
		
		Enrollments.add(Jane);
		Enrollments.add(Albert);
		Enrollments.add(Cooper);
		Enrollments.add(Steven);
		Enrollments.add(Daniel);
		Enrollments.add(Russel);
		Enrollments.add(Eli);
		Enrollments.add(Sarah);
		Enrollments.add(Morgan);
		Enrollments.add(Kyle);
		
		
		for (Enrollment person : Enrollments){
			person.setGrade(100);
		}
	
		
		assertEquals(Jane.getGrade()+Albert.getGrade()/2,100,100);
		assertEquals(Cooper.getGrade()+Steven.getGrade()/2,100,100);
		assertEquals(Daniel.getGrade()+Russel.getGrade()/2,100,100);
		assertEquals(Eli.getGrade()+Sarah.getGrade()/2,100,100);
		assertEquals(Morgan.getGrade()+Kyle.getGrade()/2,100,100);
		
}
}