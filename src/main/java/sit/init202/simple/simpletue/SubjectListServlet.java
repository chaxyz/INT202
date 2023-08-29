package sit.init202.simple.simpletue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.init202.simple.simpletue.entities.Subject;
import sit.init202.simple.simpletue.repository.SubjectRepository;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SubjectListServlet",value = "/subject")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SubjectRepository sr = new SubjectRepository();
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Subject List::</h1><hr>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>Subject Id</td><td>Subject Title</td><td>Credit</td>");
        out.println("</tr>");
        for(Subject subject : sr.findAll()) {
            out.println("<tr>");
            out.println("<td> "+ subject.getId()+" </td>");
            out.println("<td> "+ subject.getTitle()+" </td>");
            out.println("<td> "+ subject.getCredit()+" </td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
