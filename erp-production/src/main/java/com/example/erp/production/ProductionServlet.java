package com.example.erp.production;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProductionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("Production Module Running!");
    }
}
