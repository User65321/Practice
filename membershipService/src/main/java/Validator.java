

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validator
 */
//@WebServlet("/Validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public Validator() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
//		RequestDispatcher dispatcher=request.getRequestDispatcher("/registerForm.jsp");
//		dispatcher.forward(request,response);
//	
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
//		request.setCharacterEncoding("SJIS");
		
//	    response.setContentType("text/html;charset=Shift_JIS");
//	    PrintWriter out = response.getWriter();

	    request.setCharacterEncoding("Shift_JIS");
	    
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String mail=request.getParameter("mail");
		String mailForCheck=request.getParameter("mailForCheck");
		String phoneNumber=request.getParameter("phoneNumber");
		String postcode=request.getParameter("postcode");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String[] subject=request.getParameterValues("subject");
		
		//エラーメッセージ
		String[] errorMessages=check(name,password,mail,mailForCheck,phoneNumber,postcode,gender,age,subject);
		
		//エラーチェック処理
		boolean isError=false;
		for(int i=0;i<errorMessages.length;i++) {
			if(errorMessages[i]!=null) {
				isError=true;
				break;
			}
		}
		
		if(isError) {
			request.setAttribute("errorMessages",errorMessages);
			String url="/registerForm.jsp";
			RequestDispatcher dispatcher=request.getRequestDispatcher(url);
			dispatcher.forward(request,response);
		}else {
			String url="/WaitingApp/comfirmation.jsp";
			RequestDispatcher dispatcher =request.getRequestDispatcher(url);
			dispatcher.forward(request,response);
		}
		
		
	}

	private String[] check(String name, String password, String mail, String mailForCheck, String phoneNumber,
			 String postcode, String gender, String age, String[] subject) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[]errorMessages=new String[10];
		
		if(name.length()==0) {
			errorMessages[0]="名前が入力されていません。";
		}
		
		if(password.length()==0) {
			errorMessages[1]="パスワードが入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(mail.length()==0) {
			errorMessages[2]="メースアドレスが入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(mailForCheck.length()==0) {
			errorMessages[3]="確認用メースアドレスが入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(phoneNumber.length()==0) {
			errorMessages[4]="電話番号が入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		
		if(postcode.length()==0) {
			errorMessages[6]="郵便番号を入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(age.length()==0) {
			errorMessages[7]="年齢が入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(postcode.length()==0) {
			errorMessages[8]="郵便番号が入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(gender.length()==0) {
			errorMessages[8]="性別が入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		if(subject.length==0) {
			errorMessages[8]="ご希望の講座が入力されていません。";
		}
		//ここから正規表現
//		}else{
		
		return errorMessages;
	}

}
