package com.demo.controller;

import com.demo.dao.FruitDAO;
import com.demo.model.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "editFruitServlets", urlPatterns = "/edit-fruit")
public class editFruitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Double price = Double.parseDouble(request.getParameter("price"));
        String unit = request.getParameter("unit");
        String origin = request.getParameter("origin");
        String thumbnail = request.getParameter("thumbnail");
        Integer categoryId = Integer.parseInt(request.getParameter("categoryId"));

        Fruit fruit =new Fruit();
        fruit.setId(id);
        fruit.setName(name);
        fruit.setDescription(description);
        fruit.setPrice(price);
        fruit.setUnit(unit);
        fruit.setOrigin(origin);
        fruit.setThumbnail(thumbnail);
        fruit.setCategoryId(categoryId);
        response.sendRedirect("list-category");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("ListCategory.jsp").forward(request, response);
    }
}
