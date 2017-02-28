package eightbitsbigbyte;

import javax.validation.constraints.AssertTrue;

/**
 * Created by gillianreynolds-titko on 2/28/17.
 */
public class LoginPage {

    private boolean loginIsValid;
    private String name;
    private String password;

    public boolean loginIsValid() {
        return loginIsValid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
