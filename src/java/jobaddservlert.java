/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/jobaddservlert"})
public class jobaddservlert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet jobaddservlert</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet jobaddservlert at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            try{
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "AMOL";
            String password = "12345";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,username,password);
            
            String jobnm=(String) request.getParameter("positionName");
            String jobloc=(String) request.getParameter("location");
            String jobtype=(String) request.getParameter("jobtype");
            String jobdesc=(String) request.getParameter("description");
            String jobsalrange=(String) request.getParameter("salaryrange");
            
            HttpSession session = request.getSession(false);  
            int n=(int)session.getAttribute("serial_no");
            
            PreparedStatement pst1=con.prepareStatement("select companyname from recruiterdetails where requiterid="+n+"");
            ResultSet rs1=pst1.executeQuery();
            rs1.next();
       
            String s=rs1.getString(1);
          
            PreparedStatement pst;
            pst = con.prepareStatement("insert into jobs(jobname,jobloc,jobtype,jobdesc,companyname,salaryrange) values(?,?,?,?,?,?)");
            pst.setString(1,jobnm);
            pst.setString(2,jobloc);
            pst.setString(3,jobtype);
            pst.setString(4,jobdesc);
            pst.setString(5,s);
            pst.setString(6,jobsalrange);
            
            ResultSet rs=pst.executeQuery();
            
            out.print("<script>alert('you seccessfully insert your record')</script>");
            
            RequestDispatcher rstd = request.getRequestDispatcher("addjobs.jsp");
            rstd.forward(request, response);
            }
            catch (Exception ex)
            {
                out.print("hello : "+ex);
            }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}

    private PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

  
