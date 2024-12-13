package servlets;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
public class BasicServlet extends HttpServlet {
	@SuppressWarnings("unused")
	private String message;
	@Override
    public void init() throws ServletException {
        message = "Hello";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, welcome to the servlet!</h1>");
    }
    @Override
    public void destroy() {
        
}
}
