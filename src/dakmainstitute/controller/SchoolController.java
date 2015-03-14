/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.School;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class SchoolController {
     public static int addSchool(School school) throws SQLException, ClassNotFoundException{
        String quary="insert into school values(?,?,?)";
        PreparedStatement preparedStatement=DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1,school.getSchoolId());
        preparedStatement.setString(2,school.getSchoolName());
        preparedStatement.setString(3, school.getSchoolDistric());

        return preparedStatement.executeUpdate();
    }
    public static String getSchoolId() throws SQLException, ClassNotFoundException{
        String quary="select schoolId from school order by 1 desc limit 1";
        Statement stm=DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst=stm.executeQuery(quary);
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
    public static ArrayList<School> getAllSchool() throws SQLException, ClassNotFoundException{
        String quary="select * from school";
        Statement stm=DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst=stm.executeQuery(quary);
        ArrayList<School> schoolList=new ArrayList<>();
        
        while(rst.next()){
            String schoolId=rst.getString("SchoolId");
            String schoolName=rst.getString("schoolName");
            
            School school=new School(schoolId,schoolName);
            schoolList.add(school);
        }
        return schoolList;
    }
}
