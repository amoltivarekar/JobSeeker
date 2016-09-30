import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class jobseekerservlet extends HttpServlet {
    
    Connection con;
    String username, password, url;
    PreparedStatement ps;
    RequestDispatcher rd;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet jobseekerservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet jobseekerservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        try{
            url="jdbc:oracle:thin:@localhost:1521:XE";
            username="AMOL";
            password="12345";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,username,password);
            
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String mobileNumber = request.getParameter("mobileNumber");
            String male = request.getParameter("gender");
            String female = request.getParameter("gender");
            String dob = request.getParameter("dob");
            String email = request.getParameter("email");
            String userName = request.getParameter("userName");
            String pwd = request.getParameter("password");            
            String country = request.getParameter("country");
            String workExp = request.getParameter("workexp");
            String education = request.getParameter("education");
            
            ps = con.prepareStatement("insert into jobseekerdetails(firstName, lastName, mobileNumber, male, female, dob, email, userName, pwd, countrry, workExp, education) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, mobileNumber);
            
            if(male.equals("male"))
                ps.setString(4,"Yes");
            else
                ps.setString(4,"No");
            
            if(female.equals("female"))
                ps.setString(5,"Yes");
            else
                ps.setString(5,"No");
            
            ps.setString(6, dob);
            ps.setString(7, email);
            ps.setString(8, userName);
            ps.setString(9, pwd);         
            ps.setString(10, country);
            ps.setString(11, workExp);
            ps.setString(12, education);
            
            int i = ps.executeUpdate();
            if(i>0)
            {
                pw.print("<script>alert('You are successfully registered')</script>");
            }          
            RequestDispatcher rstd = request.getRequestDispatcher("index.jsp");
            rstd.forward(request, response);
        }
        catch(ClassNotFoundException | SQLException e){
            pw.print("Exception at: "+e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
