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
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subjects")
public class SubjectListServlet extends HttpServlet {
    private long starttime;

    @Override
    public void destroy() {
        System.out.println("Duration of SubjectListServlet" + this.getServletInfo() + " is " + (System.currentTimeMillis() - starttime) + " mili second");
    }

    @Override
    public void init() throws ServletException {
        starttime = System.currentTimeMillis();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SubjectRepository sr = new SubjectRepository();
        List<Subject> subjectList = sr.findAll();
        // get data from model and put it into request
        req.setAttribute("subjects", subjectList);
        // forward to Jsp
        req.getRequestDispatcher("/subjects_list.jsp").forward(req, resp);


//        PrintWriter out = resp.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Subject List::</h1><hr>");
//        out.println("<table>");
//        out.println("<tr>");
//        out.println("<td>Subject Id</td><td>Subject Title</td><td>Credit</td>");
//        out.println("</tr>");
//        for(Subject subject : sr.findAll()) {
//            out.println("<tr>");
//            out.println("<td> "+ subject.getId()+" </td>");
//            out.println("<td> "+ subject.getTitle()+" </td>");
//            out.println("<td> "+ subject.getCredit()+" </td>");
//            out.println("</tr>");
//        }
//        out.println("</table>");
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
