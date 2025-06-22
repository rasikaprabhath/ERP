package com.example.erp.finance;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FinanceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("Finance Module Running!");
    }
}
