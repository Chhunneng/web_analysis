import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class NextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");

        request.setAttribute("color",user);
        request.setAttribute("color","Blue");
        request.removeAttribute("color");



        HttpSession hs = request.getSession();
        hs.setAttribute("user",user);
        hs.setAttribute("user","Chhunneng");
        hs.removeAttribute("user");


        ServletContext context = getServletContext();
        context.setAttribute("school","ITC");
        context.setAttribute("school","KIT");
        context.removeAttribute("school");




        Cookie ck = new Cookie("user",user);
        response.addCookie(ck);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<a href='LogoutServ'>LogOut Using Listener</a><br>");
        out.println("Welcome :"+user);
        out.println("<a href='LogoutServlet'>Click to Logout</a><br>");
        out.println("<a href='WriteURL?user="+user+"'>Go to WriteURl</a><br>");
        out.println("<form action='HiddenForm' method='post'>");
        out.println("<input type='hidden' name='user' value='"+user+"'>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");

    }
}
