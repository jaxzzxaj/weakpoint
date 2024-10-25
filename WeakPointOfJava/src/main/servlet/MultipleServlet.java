package question1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問1-A3
 */
@WebServlet("/MultipleServlet")
public class MultipleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 二つの値を受け取り掛け算をする
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		// 値を受け取り計算する
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int result = num1 * num2;

		// 出力
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>");
		out.println("掛け算");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("掛け算の結果<br>");
		out.println(num1 + " × " + num2 + " = " + result);
		out.println("</body>");
		out.println("</html>");
	}

}
