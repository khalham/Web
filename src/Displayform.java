

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Displayform
 */
@WebServlet("/Displayform")
public class Displayform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Displayform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String grade = request.getParameter("grade");
		String regno = request.getParameter("regno");
		
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	    final String DB_URL="jdbc:mysql://localhost/testone";
	      
	    final String USER = "root";
	    final String PASS = "123";
	     
	    Connection conn = null;
	    Statement stmt = null;
	    
	    // SQL query
	    String query = "SELECT name,grade,regno FROM testone";
	    
	    
	    // Connection to Database
	    try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			out.println("not conn");
		}
	    
	    try {
	    	stmt = conn.createStatement();
	    	ResultSet results = stmt.executeQuery(query);
	    	
	    	// Get and Print results
	    	while(results.next()) {
	    		String stdname = results.getString("name");
	    		String stdgrade = results.getString("grade");
	    		String stdreg = results.getString("regno");
	    		
	    		out.println("<p>name: " + name + ", grade: " + grade + ", regno: " + regno + "</p></br>");
	    	}
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
