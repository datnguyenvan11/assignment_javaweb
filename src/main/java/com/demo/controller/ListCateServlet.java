package com.demo.controller;

import com.demo.dao.FruitDAO;
import com.demo.model.Category;
import com.demo.model.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListCateServlet", urlPatterns = "/list-cate")
public class ListCateServlet extends HttpServlet {
    FruitDAO dao = new FruitDAO();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> list = dao.getAllCategory();
        request.setAttribute("categories", list);
        request.getRequestDispatcher("ListCategory.jsp").forward(request, response);
    }
}
