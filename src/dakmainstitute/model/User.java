/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class User {

    private String userNAme;
    private String password;
    private int privileges;

    public User() {
    }

    public User(String userNAme, String password, int privileges) {
        this.userNAme = userNAme;
        this.password = password;
        this.privileges = privileges;
    }

    /**
     * @return the userNAme
     */
    public String getUserNAme() {
        return userNAme;
    }

    /**
     * @param userNAme the userNAme to set
     */
    public void setUserNAme(String userNAme) {
        this.userNAme = userNAme;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the privileges
     */
    public int getPrivileges() {
        return privileges;
    }

    /**
     * @param privileges the privileges to set
     */
    public void setPrivileges(int privileges) {
        this.privileges = privileges;
    }
}
