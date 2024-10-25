package question3;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 問3-A5
 */
@WebFilter("/PracticeFilterServlet")
public class PracticeFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * コンソールに日時を表示する
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E)HH時mm分");
		String dateStr = sdf.format(date);
		System.out.println("HelloFilter:" + dateStr);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
