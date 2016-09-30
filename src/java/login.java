import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {
    
    Connection con;
    String username, password, url;
    PreparedStatement ps, ps1;
    ResultSet rs, rs1;
    RequestDispatcher rd, rd1;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
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
        
        int i=0,j=0;
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        HttpSession session=request.getSession(); 
         
        ps = con.prepareStatement("select comusername,compassword,REQUITERID from recruiterdetails");
        rs = ps.executeQuery();
        
        while(rs.next())
        {
            if((user.equals(rs.getString(1)) && pass.equals(rs.getString(2))))
            {
                session.setAttribute("serial_no",rs.getInt(3)); 
                rd = request.getRequestDispatcher("companyprofile.jsp");
                rd.forward(request, response);
                pw.print("<script>alert('Successfully logged in')</script>");
                i++;                      
            }            
        }
        if(i == 0){
            pw.print("<script>alert('Wrong username and password')</script>");
        }

        ps1 = con.prepareStatement("select userName,pwd from jobseekerdetails");
        rs1 = ps1.executeQuery();
        
        while(rs1.next())
        {
            if((user.equals(rs1.getString(1)) && pass.equals(rs1.getString(2))))
            {
                rd1 = request.getRequestDispatcher("profile.jsp");
                rd1.forward(request, response);
                pw.print("<script>alert('Successfully logged in')</script>");
                j++;                      
            }            
        }
        if(j == 0){
            pw.print("<script>alert('Wrong username and password')</script>");
        }
        
        }
        catch(Exception e)
        {
            pw.print("Exception at:- "+e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
