/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 *
 * @author Administrator
 */
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction1 extends ActionSupport{
    private String userName;
    private String userPassword;
    private int userAge;
    private String userTelephone;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    public String getUserTelephone() {
        return userTelephone;
    }
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    } 
    public void validate(){  
        if(userName==null ||userName.length()<6 || userName.length()>16){
            addFieldError("userName","用户姓名的长度不符合要求,6-16位！"); 
	}
        if(userPassword.length()>16||userPassword.length()<6){
            addFieldError("userPassword","密码长度不符合要求，6-16位！");
        }
        if(userAge>130||userAge<1){
            addFieldError("userAge","年龄不符合要求，1-130岁");
        }
        if(userTelephone.length()!=8){
            addFieldError("userTelephone","电话号码不符合要求，8位");
        }  
    }
    public String execute(){
        return SUCCESS;
    }
}

