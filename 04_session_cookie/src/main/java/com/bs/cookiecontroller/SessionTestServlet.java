package com.bs.cookiecontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTestServlet
 */
@WebServlet("/sessiontest.do")
public class SessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Session이 있으면 Session을 가져오고, 없으면 만들어서 가져와라!
		HttpSession session=request.getSession();
		//Session이 있으면 session을 가져오고, 없으면 null반환
//		HttpSession session=request.getSession(false);
		session.setAttribute("checkLogin", "test");
		session.setMaxInactiveInterval(5);//second <-일정시간후가 지나면 session의 값을 삭제한다.
		System.out.println(session);
		response.sendRedirect(request.getContextPath()+"/cookieExpCheck.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
