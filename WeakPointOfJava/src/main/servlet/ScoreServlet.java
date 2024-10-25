package question3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問3-A1
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 点数判定し合格不合格を表示
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 入力値を取得
		String numStr = request.getParameter("num");
		int num = Integer.parseInt(numStr);

		// 値によって遷移先を指定
		String path;
		if (60 <= num) {
			path = "/question3/pass.jsp";
		} else {
			path = "/question3/faile.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
