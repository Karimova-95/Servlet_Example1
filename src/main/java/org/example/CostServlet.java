package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String kmAsString = req.getParameter("km");
        String kgAsString = req.getParameter("kg");

        int km = Integer.parseInt(kmAsString);
        int kg = Integer.parseInt(kgAsString);

        CostCalculator calculator = new CostCalculator(400, 30);
        double cost = calculator.deliverCost(kg, km);

        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Cost " + cost + "rub<h1>");
    }
}
