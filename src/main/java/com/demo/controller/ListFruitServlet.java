package com.demo.controller;

import com.demo.dao.FruitDAO;
import com.demo.model.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListFruitServlet", urlPatterns = "/list-fruit")
public class ListFruitServlet extends HttpServlet {
    FruitDAO dao = new FruitDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Fruit> list = dao.getAllFruit();
        request.setAttribute("fruits", list);
        request.getRequestDispatcher("listFruit.jsp").forward(request, response);
    }
}
