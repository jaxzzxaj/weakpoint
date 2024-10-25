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
 * 3-A4
 */
@WebServlet("/ResetToDoServlet")
public class ResetToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * セッションを破棄する
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {

			//セッションを破棄
			session.invalidate();
		}
		String path = "/question3/todoList.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
