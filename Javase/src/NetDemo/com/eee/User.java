package NetDemo.com.eee;

import java.io.Serializable;

/**
 * @author ZHJ
 * @description @ZHJ
 * @create 2019-11-09 19:16
 **/
public class User implements Serializable {

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static final long serialVersionUID = 6585371466345542038L;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}


