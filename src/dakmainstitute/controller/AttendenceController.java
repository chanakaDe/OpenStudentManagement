/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Attendence;
import dakmainstitute.model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class AttendenceController {
    public static int addAttendence(Attendence attendence) throws SQLException,ClassNotFoundException{
        String date=attendence.getDate();
        String indexNo=attendence.getIndexNo();
        String time=attendence.getTime();
        String clz=attendence.getClz();
        String subjectName=attendence.getSubjectName();
        String attend=attendence.getAttend();
        String distric=attendence.getDistric();
       
        String quary="insert into attendence values(?,?,?,?,?,?,?)";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        prepareStatement.setString(1, date);
        prepareStatement.setString(2, indexNo);
        prepareStatement.setString(3, time);
        prepareStatement.setString(4, clz);
        prepareStatement.setString(5, subjectName);
        prepareStatement.setString(6, attend);
        prepareStatement.setString(7, distric);
        
        return prepareStatement.executeUpdate();
        
    }
    public static ArrayList<Attendence> getSelectedStudent(String clz, String subject,String date) throws SQLException, ClassNotFoundException {
        String query = "select * from attendence a,student s where a.clz='"+clz+"' AND a.subjectName='"+ subject +"' AND a.date='"+date+"' AND s.indexNo=a.indexNo";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Attendence> studentList = new ArrayList<>();
        while (rst.next()) {
            String indexNo = rst.getString("indexNo");
            String studentName = rst.getString("studentName");  
            
            Student student=new Student(studentName,"");
            Attendence attendence = new Attendence(indexNo, student);
            studentList.add(attendence);
        }
        return studentList;

    }
}
