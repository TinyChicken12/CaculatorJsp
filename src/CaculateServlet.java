import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculateServlet",urlPatterns = "/calculate")
public class CaculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperator = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperator = Integer.parseInt(request.getParameter("second-operand"));

        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result</h1>");
        try{
            float result = Caculator.caculate(firstOperator,secondOperator,operator);
            writer.println(firstOperator + " " + operator + " " + secondOperator + " = " + result);
            writer.println("<html>");
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
