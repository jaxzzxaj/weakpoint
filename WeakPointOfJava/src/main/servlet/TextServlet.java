package question1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問1-A4
 */
@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 文章を縦に表示
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 値を受け取る
		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");

		// 出力
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>");
		out.println("文章出力");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("あなたが入力した文章は以下です");
		out.println("<br>");

		// 文字列の表示
		for (int i = 0; i <= text.length() - 1; i++) {
			out.println(text.charAt(i));
			out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
