package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		
		Staff WillSmith = new Staff("", "", "", null, "", "", "", "", 1000, 0, null, null);
		Staff TeacherMcTeacher = new Staff("", "", "", null, "", "", "", "", 7000, 0, null, null);
		Staff RichTeacher = new Staff("", "", "", null, "", "", "", "", 100000, 0, null, null);
		Staff PoorTeacher = new Staff("", "", "", null, "", "", "", "", 100, 0, null, null);
		Staff John = new Staff("", "", "", null, "", "", "", "", 5000, 0, null, null);

		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(WillSmith);
		staff.add(TeacherMcTeacher);
		staff.add(RichTeacher);
		staff.add(PoorTeacher);
		staff.add(John);
		
		double salarytotal = 0.0;
		
		for (Staff pers:staff){
			salarytotal = salarytotal + pers.getSalary(); 
			
		}
		
		
		assertEquals(salarytotal/5,22620,22620);
	}	
	@Test(expected = PersonException.class)
	public void test2() throws PersonException {
		Staff Staffnew = new Staff("", "", "", Date(1915, 1, 1), "", "7", "", "", 15000, 0, null, null);

}
}
