import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for(Cookie ck:cookies){
            ck.setValue(null);
            ck.setMaxAge(0);
            response.addCookie(ck);
        }
        PrintWriter out = response.getWriter();
        out.println("");
        response.sendRedirect("index.jsp");
    }
}
