package xin.shaozeming.dubboxapi.po;

import java.io.Serializable;

/**
 * @author: 邵泽铭
 * @date: 2018/12/21
 * @description:
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -5761417870859612914L;

    private String userName;

    private String password;

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
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}