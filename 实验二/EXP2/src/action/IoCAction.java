package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class IoCAction extends ActionSupport implements ServletRequestAware {
	private String userName;
	private String password;
	private HttpServletRequest request;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

	public String execute() throws Exception {
		if (getUserName().equals("QQ") && getPassword().equals("123")) {
			// 通过request对象获取session对象
			HttpSession session = request.getSession();
			// 把登录名传入session中
			session.setAttribute("userName", this.getUserName());
			return "success";
		} else {
			return "error";
		}
	}

}
