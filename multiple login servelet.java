import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Assuming the first character of the username represents the account type
        char accountType = username.charAt(0);
        
        if (accountType == 'A') {
            // attendee login logic here
        } else if (accountType == 'S') {
            // service provider login logic here
        } else if (accountType == 'E') {
            // Event Organizer login logic here
        } else {
            // Handle invalid account type
            response.sendRedirect("login.jsp");
        }
    }
}
