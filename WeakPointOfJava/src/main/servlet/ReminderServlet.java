package question3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問3-A2
 */
@WebServlet("/ReminderServlet")
public class ReminderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 入力値の余剰を求め表示
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 入力値を取得し余剰を計算
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int result = num1 % num2;

		// 出力値をリクエストに格納しフォワード
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/question3/reminder.jsp");
		rd.forward(request, response);
	}
}
