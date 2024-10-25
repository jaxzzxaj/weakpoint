package question3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問3-A5
 */
@WebServlet("/PracticeFilterServlet")
public class PracticeFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * フィルター用サーブレット
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("  <body>");
		out.println("  Hello World!!");
		out.println("  </body>");
		out.println("</html>");
	}

}
