package com.bs.cookiecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestExtrainfoServlet
 */
@WebServlet("/requestexrainfo.do")
public class RequestExtrainfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestExtrainfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//요청 해더정보 가져오기
		String accept=request.getHeader("Accept");
		System.out.println(accept);
		String cookie=request.getHeader("Cookie");
		System.out.println(cookie);
		String prevPage=request.getHeader("Referer");
		System.out.println(prevPage);
		String pp=prevPage.substring(prevPage.indexOf(request.getContextPath()));
		System.out.println(pp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
