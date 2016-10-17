package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;


public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		
	}
	
	public Course(String courseName, UUID courseID, int gradePoints) {
		CourseName = courseName;
		CourseID = courseID;
		GradePoints = gradePoints;
}
	
	public void setCourseID(UUID CourseID){
		this.CourseID=CourseID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints=GradePoints;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}

}
