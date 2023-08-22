package sit.init202.simple.simpletue;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalcGradeServlet", value = "/grade")
public class CalcGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = Integer.valueOf(request.getParameter("score"));
        CalcGrade cal = new CalcGrade(score);
        PrintWriter out = response.getWriter();
        String color = "darkblue";
        out.println("<html><body>");
        out.println("<h1> Calculate Grade Servlet</h1>");

        out.println("<h3> Your Score is " + score + "</h3>");


        if(cal.getGrade().equalsIgnoreCase("F")){
            color = "red";
        }

        out.println("<h3 style=color:"+color+"> Your grade is " + cal.getGrade() + "</h3>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
