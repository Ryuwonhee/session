package com.bs.cookiecontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieCreateServlet
 */
@WebServlet("/cookietest.do")
public class CookieCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Cookie객체 생성하기
		Cookie c=new Cookie("userId","admin");
		
		//옵션설정
		c.setMaxAge(24*60*60);
		//c.setPath()
		
		//저장시키기
		response.addCookie(c);
		
		Cookie c1=new Cookie("readProduct","1|2|3|4");
		c.setMaxAge(24*60*60);
		response.addCookie(c1);
		
		response.sendRedirect("/04_session_cookie");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
