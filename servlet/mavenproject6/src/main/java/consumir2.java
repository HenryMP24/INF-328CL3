/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Henry
 */
@WebServlet(urlPatterns = {"/consumir2"})
public class consumir2 extends HttpServlet {

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
            out.println("<title>Servlet consumir2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Ingrese el nuevo CI</h3>");
            out.println("<form method=get>");
            out.println("<input type=text name=nci />");
            out.println("<h3>Ingrese el ID del alumno</h3>");
            out.println("<input type=text name=id />");
            out.println("<input type=submit value=Corregir />");
            out.println("</form>");
            String alumno=request.getParameter("id");
            int nci = Integer.parseInt(request.getParameter("nci"));
            List<String> resultados2 = new ArrayList<String>();
            resultados2=cambiaremos(alumno,nci);
            out.println("<h2> cambiado </h2>"); 
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
        processRequest(request, response);
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
 private static java.util.List<java.lang.String> cambiaremos(String idalumno,int ci) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.cambiaremos(idalumno,ci);
    }
}
