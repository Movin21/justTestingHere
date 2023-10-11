package com.customer;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AttendeeServlet
 */
public class AttendeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int attendeeId = Integer.parseInt(request.getParameter("attendeeId"));
	        String attendeeName = request.getParameter("attendeeName");
	        String address = request.getParameter("address");
	        String phone = request.getParameter("phone");
	        String email = request.getParameter("email");
	        int tickets = Integer.parseInt(request.getParameter("tickets"));
	        String previouslyAttendedEvents = request.getParameter("previouslyAttendedEvents");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        
	       Attendee attendee=new Attendee(attendeeId,attendeeName,address,phone,email,tickets,previouslyAttendedEvents,username,password);
	       boolean isTrue=AttendeeDBUtil.insertAttendee(attendee);
	       
	        
	        PrintWriter out=response.getWriter();
	        if(isTrue==true) {
	        	//Alert Success
	        	//navigate to admin portal
	        	response.setContentType("text/html");
				out.println("<script type = 'text/javascript'> "
						+ "alert('Atendee added successfully!');"
						+"location='adminPortal.jsp'</script>");
	        }
	        else {
	        	//Alert failed
	        	//navigate to admin portal
				response.setContentType("text/html");
				out.println("<script type = 'text/javascript'> "
						+ "alert('Insertion failed !');"
						+"location='adminPortal.jsp'</script>");
				
	        }
	}}

