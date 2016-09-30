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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author microsoft
 */
public class jobupdate extends HttpServlet {

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
            out.println("<title>Servlet jobupdate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet jobupdate at " + request.getContextPath() + "</h1>");
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
        PrintWriter out=response.getWriter();
        try
        {   //connection
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String username="AMOL";
            String password="12345";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,username,password);
            
            //get parameters for where cluse
            String posnm=request.getParameter("posnm");
            
            //get parameter for update query
            String uptposnam=request.getParameter("positionName");
            String uptloc=request.getParameter("location");
            String uptjobtype=request.getParameter("jobtype");
            String uptdesc=request.getParameter("description");
            String uptsal=request.getParameter("salaryrange");
            
            
            /*out.print(posnm+"   ");
            out.print(loc+"   ");
            out.print(jobdec+"   ");
            out.print(sal+"   ");
            out.print(uptposnam+"   ");
            out.print(uptloc+"   ");
            out.print(uptjobtype+"   ");
            out.print(uptdesc+"   ");
            out.print(uptsal+"   ");
            */
            //sqlStstement
            PreparedStatement pst=con.prepareStatement("update jobs set jobname=?,jobloc=?,jobtype=?,jobdesc=?,salaryrange=? where jobname='"+posnm+"'");
            
            //insert value as per '?' in prepareststement
            pst.setString(1,uptposnam);
            pst.setString(2,uptloc);
            pst.setString(3,uptjobtype);
            pst.setString(4,uptdesc);
            pst.setString(5,uptsal);
           
            
            int i=pst.executeUpdate();
            if(i>0)
            {
                out.print("<script> alert('You have successfully Updated your information, Thank You')</script>");
            }       
            RequestDispatcher rstd = request.getRequestDispatcher("editjobs.jsp");
            rstd.forward(request, response);
            
        }
        catch(Exception e)
        {
            out.print("hello exception here :"+e );
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
