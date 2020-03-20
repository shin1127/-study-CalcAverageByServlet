package average;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Average
 */
@WebServlet("/Average")
public class Average extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/Average.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// リクエストパラメータの取得
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		String third = request.getParameter("third");

		// 入力値をプロパティに設定
		Number number = new Number();
		number.setFirstNumber(Double.parseDouble(first));
		number.setSecondNumber(Double.parseDouble(second));
		number.setThirdNumber(Double.parseDouble(third));

		// 計算を実行し結果を設定
		AverageLogic averageLogic = new AverageLogic();
		averageLogic.execute(number);  // ここのnumberは上で宣言したNumberクラスのnumberインスタンス

		// リクエストスコープに保存
		request.setAttribute("average", number);

		// フォワード

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/AverageResult.jsp");
		dispatcher.forward(request, response);


	}

}
