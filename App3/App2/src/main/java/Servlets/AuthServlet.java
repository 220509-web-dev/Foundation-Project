//package Servlets;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class AuthServlet {
//    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws
//            IOException{
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out=response.getWriter();
//
//        out.println("<html>");
//        out.println("<h1> Hello </h1>");
//        out.println("<h1> Servlet NewServlet at" + request.getContextPath() + "</h1>");
//        String user=request.getParameter("user");
//        out.println("</h2> Welcome "+user+"</h2>");
//        out.println("</html>");
//    }
//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//}