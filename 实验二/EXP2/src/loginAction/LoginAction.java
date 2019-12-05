/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Administrator
 */
public class LoginAction extends ActionSupport{
    private String userName;
    private String userPassWord;
    private String tip;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassWord() {
        return userPassWord;
    }
    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String execute() throws Exception
    {
        ActionContext ac=ActionContext.getContext();
        if (getUserName().equals("QQ")&&getUserPassWord().equals("123") )
	{
            ac.getSession().put("userName",getUserName());
            this.tip = getText("login.success",new String[] { this.userName });
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }  
}
