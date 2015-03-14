/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import dakmainstitute.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shashi
 */
public class UserController {
    public  static int addUser(User user) throws ClassNotFoundException, SQLException{
        String sql="insert into User values(?,password(?),?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement pStatement=connection.prepareStatement(sql);
        pStatement.setString(1, user.getUserNAme());
        pStatement.setString(2, user.getPassword());
        pStatement.setInt(3, user.getPrivileges());
        return pStatement.executeUpdate();
    }
    public  static int getPrivileges(String username,String pasword) throws ClassNotFoundException, SQLException{
        String sql="select Privilege from user where username=? and password=password(?)";
        Connection conn=DBConnection.getInstance().getConnection();
        PreparedStatement pStatement=conn.prepareStatement(sql);
        pStatement.setString(1, username);
        pStatement.setString(2, pasword);
        ResultSet rst=pStatement.executeQuery();
        if(rst.next()){
            return rst.getInt(1);
        }else{
            return -1;
        }
    }
}
