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
@WebServlet("/InvalidateServlet")
public class InvalidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * セッションを破棄する
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// セッションの破棄
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/question3/addressHobby3.jsp");
		rd.forward(request, response);
	}

}
