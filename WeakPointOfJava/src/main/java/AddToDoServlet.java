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
 * 問3-A4
 */
@WebServlet("/AddToDoServlet")
public class AddToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 予定をセッションに格納する
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//セッションを取得
		HttpSession session = request.getSession(true);

		//予定を格納するための空の配列を宣言
		String[] toDoList;

		//入力された予定を取得
		String toDo = request.getParameter("toDo");

		if (session.getAttribute("toDoList") != null) {

			//すでにセッションに予定配列が存在する場合、配列を取得
			toDoList = (String[]) session.getAttribute("toDoList");
		} else {

			//セッションにない場合は新規作成
			toDoList = new String[5];
		}

		//予定配列のnull（登録されていない）の部分に今回入力された予定を登録
		for (int i = 0; i < toDoList.length; i++) {
			if (toDoList[i] == null) {
				toDoList[i] = toDo;
				break;
			}
		}

		//セッションに予定配列を登録
		session.setAttribute("toDoList", toDoList);

		String path = "/question3/todoList.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
