package com.example.erp.sales;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SalesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("Sales Module Running!");
    }
}
