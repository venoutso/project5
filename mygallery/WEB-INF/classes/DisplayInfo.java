import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class DisplayInfo extends HttpServlet {

  public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

    request.getSession();

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
		out.println("<center>");
                out.println("<h1>Information Window</h1>");
		out.println("<table border='1'>");
			out.println("<tr>");
				out.print("<td><b>Users:</b></td>");
				out.print("<td>"+ConcurrentUserTracker.getConcurrentUsers()+"</td>");
			out.println("</tr>");
			out.println("<tr>");
				out.print("<td><b>Name of user:</b></td>");
				out.print("<td>"+ShowName.getNewAttributes()+"</td>");
			out.println("</tr>");
			out.println("<tr>");
				out.print("<td><b>Total Uploads:</b></td>");
				out.print("<td>"+UploadDoneCounter.getAccessions()+"</td>");
			out.println("<tr>");
		out.println("</table>");
		out.println("</center>");
    out.println("</html>");
	
	
  }
}
