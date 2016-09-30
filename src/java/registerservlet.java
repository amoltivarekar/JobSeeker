import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerservlet extends HttpServlet {

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
            out.println("<title>Servlet registerservlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerservlet at " + request.getContextPath() + "</h1>");
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
                                  
            String companyname = request.getParameter("companyName");
            String location = request.getParameter("location");
            String founded = request.getParameter("founded");
            String industry = request.getParameter("industry");
            String ceo = request.getParameter("ceo");
            String website = request.getParameter("website");
            String country = request.getParameter("countryComboBox");
            String email = request.getParameter("email");
            String comusername = request.getParameter("userName");
            String compassword = request.getParameter("password");                  
                                                                                              
            ps = con.prepareStatement("insert into recruiterdetails(companyname, headquarters, founded, industry, ceo, websit, country, email, comusername, compassword) values(?,?,?,?,?,?,?,?,?,?)");
                      
            ps.setString(1, companyname);
            ps.setString(2, location); 
            ps.setString(3, founded);
            ps.setString(4, industry);
            ps.setString(5, ceo);
            ps.setString(6, website);
            ps.setString(7, country);          
            ps.setString(8,email);            
            ps.setString(9, comusername);
            ps.setString(10, compassword);
                        
            int i = ps.executeUpdate();
            if(i>0)
            {
                pw.print("<script> alert('You have successfully register your information, Thank You')</script>");
            }          
            RequestDispatcher rstd = request.getRequestDispatcher("index.jsp");
            rstd.forward(request, response);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            pw.print("Exception at: "+e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
