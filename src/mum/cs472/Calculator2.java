package mum.cs472;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.function.BiFunction;

public class Calculator2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            Integer a = Integer.parseInt(request.getParameter("a"));
            Integer b = Integer.parseInt(request.getParameter("b"));
            Integer c = Integer.parseInt(request.getParameter("c"));
            Integer d = Integer.parseInt(request.getParameter("d"));

            request.setAttribute("a", a);
            request.setAttribute("b", b);
            request.setAttribute("c", c);
            request.setAttribute("d", d);
            request.setAttribute("r1", summing.apply(a,b));
            request.setAttribute("r2", multiplying.apply(c,d));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        RequestDispatcher view = request.getRequestDispatcher("calculator-2.jsp");
        view.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    BiFunction<Integer, Integer, Integer> summing = (a, b) -> a + b;
    BiFunction<Integer, Integer, Integer> multiplying = (a, b) -> a * b;
}
