package question3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 問3-A3
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 入力値をセッションとリクエストに格納し表示
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		// 入力値を取得し、それぞれリクエストとセッションに格納する
		String address = request.getParameter("address");
		String hobby = request.getParameter("hobby");
		HttpSession session = request.getSession(true);
		session.setAttribute("address", address);
		request.setAttribute("hobby", hobby);

		// 次画面に遷移する
		RequestDispatcher rd = request.getRequestDispatcher("/question3/addressHobby1.jsp");
		rd.forward(request, response);
	}
}
