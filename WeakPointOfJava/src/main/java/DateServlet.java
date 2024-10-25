package question1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 問1-A2
 */
@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 現在日時を表示
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>");
		out.println("日付表示");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");

		// 日付の取得・表示
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日（E）");
		String dateStr = sdf.format(date);
		out.println(dateStr);
		out.println("</body>");
		out.println("</html>");
	}

}
