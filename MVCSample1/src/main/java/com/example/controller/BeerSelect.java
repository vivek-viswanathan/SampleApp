package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer selection Advice<br>");
		String c = request.getParameter("color");
		out.println("Got Beer Color:" + c);
		BeerExpert be = new BeerExpert();
		request.setAttribute("styles", be.getBrands(c));
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}
// request.getRequestDispatcher("/jsp/welcome.jsp?pwd="+request.getParameter("password")+"&userName="+request.getParameter("loginName")).forward(request,
// response);
// response.sendRedirect(request.getContextPath()+"/jsp/welcome.jsp?pwd="+request.getParameter("password")+"?userName="+request.getParameter("loginName"));
