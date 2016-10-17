package com.cisc181.core;
import java.util.Date;
import java.util.UUID;
public class Semester{
	
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	public Semester(){
	}
	
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID = semesterID;
		StartDate = startDate;
        EndDate = endDate;
        }
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	public UUID getSemesterID(){
		return SemesterID;
	}
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	public Date getStartDate(){
		return StartDate;
	}
	 
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
	
	public Date getEndDate(){
		return EndDate;
	}

}
