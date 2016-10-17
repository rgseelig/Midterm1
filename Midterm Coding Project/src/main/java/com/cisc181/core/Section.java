package com.cisc181.core;
import java.util.UUID;
public class Section {
	
	private UUID CourseID;
	private UUID SectionID;
	private int RoomID;
	private UUID SemesterID;
	
	public Section(UUID CourseID,UUID SemesterID, UUID SectionID,
			int RoomID) {
		this.SectionID = SectionID;
		this.RoomID = RoomID;
		this.CourseID = CourseID;
		this.SemesterID= SemesterID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}
	
	


}
