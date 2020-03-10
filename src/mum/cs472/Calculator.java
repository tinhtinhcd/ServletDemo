package mum.cs472;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.function.BiFunction;

public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            Integer a = Integer.parseInt(request.getParameter("a"));
            Integer b = Integer.parseInt(request.getParameter("b"));
            Integer c = Integer.parseInt(request.getParameter("c"));
            Integer d = Integer.parseInt(request.getParameter("d"));

            StringBuffer buff = new StringBuffer();
            if (a != null && b != null)
                buff.append(a + " + " + b + " = " + summing.apply(a, b) +"<br>");
            if (c != null && d != null)
                buff.append(c + " * " + d + " = " + multiplying.apply(c, d));
            request.setAttribute("result", buff.toString());

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        RequestDispatcher view = request.getRequestDispatcher("calculator.jsp");
        view.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    BiFunction<Integer, Integer, Integer> summing = (a, b) -> a + b;
    BiFunction<Integer, Integer, Integer> multiplying = (a, b) -> a * b;
}
