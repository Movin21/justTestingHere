package com.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;


//attendee CRUD Opertaions
public class AttendeeDBUtil {
	

	private static Connection con=null;
	private static boolean isSuccess;
	private static PreparedStatement preparedStatement = null;
	
	//Create Attendee
	public static boolean insertAttendee(Attendee attendee) {
		con = DBConnectivity.getConnection();
		try {
			String sql = "INSERT INTO Attendee (attendeeId,attendeeName, attendeeAddress, attendeePhone, attendeeEmail, tickets, previouslyAttendedEvents, username, password) " +
	                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";

	    preparedStatement = con.prepareStatement(sql);

	    // Set the values for the placeholders
	    preparedStatement.setInt(1, attendee.getAttendeeId());
	    preparedStatement.setString(2, attendee.getAttendeeName());
	    preparedStatement.setString(3, attendee.getAttendeeAddress());
	    preparedStatement.setString(4, attendee.getAttendeePhone());
	    preparedStatement.setString(5, attendee.getAttendeeEmail());
	    preparedStatement.setInt(6, attendee.getTickets());
	    preparedStatement.setString(7, attendee.getPreviouslyAttendedEvents());
	    preparedStatement.setString(8, attendee.getUsername());
	    preparedStatement.setString(9, attendee.getPassword());

	    // Execute the query
	    int rowsInserted = preparedStatement.executeUpdate();
			
			if(rowsInserted>0) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}
		
			}
		catch(Exception e) {
			System.out.print("Insert query failure");
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Update Attendee
	//Delete Attendee
	//Select Attendee
	
}
