/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.School;
import dakmainstitute.model.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class SubjectController {
    public static int addSubject(Subject subject) throws SQLException,ClassNotFoundException{
        String subjectName=subject.getSubjectName();
        String fee=subject.getFee();
        String dayOfWeek=subject.getDayOfWeek();
        String duration=subject.getDuration();
        
        String quary="insert into subject values(?,?,?,?)";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        prepareStatement.setString(1, subjectName);
        prepareStatement.setString(2, fee);
        prepareStatement.setString(3, dayOfWeek);
        prepareStatement.setString(4, duration);
       
        return prepareStatement.executeUpdate();
        
    }
    public static ArrayList<Subject> getAllSubject() throws SQLException, ClassNotFoundException{
        String quary="select * from subject";
        Statement stm=DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst=stm.executeQuery(quary);
        ArrayList<Subject> subjectList=new ArrayList<>();
        
        while(rst.next()){
            String subjectName=rst.getString("subjectName");
            
            Subject subject=new Subject(subjectName);
            subjectList.add(subject);
        }
        return subjectList;
    }
}
