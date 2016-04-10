/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author adamopoulo
 */
public class HelloWorldServlet extends HttpServlet {
    
    private static final String myForm =
    "<html>\n" +
"    <head>\n" +
"        <title>a sample form using get</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <h2>A sample form using get</h2>\n" +
"    	<form action=\"http://localhost:8080/WebApplication1/HelloWorldServlet\">\n" +
"    		<center>\n" +
"    			first name: <input type=\"text\" name=\"firstName\"><br>\n" +
"    			last name: <input type=\"text\" name=\"lastName\"><br>\n" +
"    			<input type=\"submit\">\n" +
"    		</center>\n" +
"    	</form>\n" +
"    </body>\n" +
"</html>";
    
        private static final String myOutpout =
    "<html>\n" +
"    <head>\n" +
"        <title>a sample form using get</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <h2>Outpout Page</h2>\n" +

"    </body>\n" +
"</html>";
           
               
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

            out.println(myForm);
            
            String myName = request.getParameter("firstName");
            String myLast = request.getParameter("lastName");
            if (((myLast == "") && (myName == "")) || ((myLast == null) && (myName == null)))
            {
           
            }
            else { out.println(myOutpout);}
            // geia sas 
            
            
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

}
