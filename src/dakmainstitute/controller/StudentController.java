/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class StudentController {

    public static int addStudent(Student student) throws SQLException, ClassNotFoundException {
        String indexNo = student.getIndexNo();
        String nic = student.getNic();
        String studentName = student.getStudentName();
        String Address = student.getAddress();
        String dateOfAdd = student.getDateOfAdd() + "";
        String dateOfBirth = student.getDateOfBirth()+"" ;
        String school = student.getSchool();
        String mobileNum = student.getMobileNum();
        String homeNum = student.getHomeNum();
        String distric = student.getDistric() + "";
        String gender = student.getGender() + "";
        String classes = student.getClasses() + "";
        String subjectName = student.getSubject() + "";
        String quary = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement prepareStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        prepareStatement.setString(1, indexNo);
        prepareStatement.setString(2, nic);
        prepareStatement.setString(3, studentName);
        prepareStatement.setString(4, dateOfAdd);
        prepareStatement.setString(5, Address);
        prepareStatement.setString(6, dateOfBirth);
        prepareStatement.setString(7, school);
        prepareStatement.setString(8, mobileNum);
        prepareStatement.setString(9, homeNum);
        prepareStatement.setString(10, distric);
        prepareStatement.setString(11, gender);
        prepareStatement.setString(12, classes);
        prepareStatement.setString(13, subjectName);

        return prepareStatement.executeUpdate();

    }

    public static ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException {
        String query = "select * from student";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Student> studentList = new ArrayList<>();
        while (rst.next()) {
            String indexNo = rst.getString("indexNo");
            String studentName = rst.getString("studentName");
            String school = rst.getString("school");

            Student student = new Student(indexNo, studentName, school);
            studentList.add(student);
        }
        return studentList;

    }
    public static ArrayList<Student> getAllDetails(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from student s,school sc where indexNo='"+indexNo+"' AND s.schoolId=sc.schoolId";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Student> studentList = new ArrayList<>();
        while (rst.next()) {
            
            String studentName = rst.getString("studentName");
            String address = rst.getString("Address");
            String dob = rst.getString("dateOfBirth");
            String schoolName = rst.getString("schoolName");
            String nic = rst.getString("nic");
            String mobileNum = rst.getString("mobileNum");
            String homeNum = rst.getString("homeNum");
            
            School school=new School(schoolName);
            Student student = new Student( studentName,address, school,dob,nic,mobileNum,homeNum,true);
            studentList.add(student);
        }
        return studentList;

    }

    public static ArrayList<Student> getSelectedStudent(String clz, String subject) throws SQLException, ClassNotFoundException {
        String query = "select * from student where class='" + clz + "' AND subjectName='" + subject + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Student> studentList = new ArrayList<>();
        while (rst.next()) {
            String indexNo = rst.getString("indexNo");
            String studentName = rst.getString("studentName");

            Student student = new Student(indexNo, studentName,"");
            studentList.add(student);
        }
        return studentList;

    }

    public static int updateMobileNum(String mobileNum, String curNum) throws SQLException, ClassNotFoundException {
        String query = "update student set mobileNum='" + mobileNum + "'where mobileNum='" + curNum + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        int res = stm.executeUpdate(query);

        return res;

    }

    public static ArrayList<Student> getAllStudents() throws SQLException, ClassNotFoundException {
        String sql = "select * from student s,school sc where s.schoolId=sc.schoolId";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; rst.next(); i++) {
            String index = rst.getString("indexNo");
            String studentName = rst.getString("studentName");
            String schools = rst.getString("schoolName");
            String clz = rst.getString("class");
            String subject = rst.getString("subjectName");
            String mobileNum = rst.getString("mobileNum");
            String homeNum = rst.getString("homeNum");

            School sc = new School(schools);

            Student student = new Student(index, studentName, sc, clz, subject, mobileNum, homeNum);
            studentList.add(student);
        }

        return studentList;

    }

    public static Student getSubject(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from student where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        while (rst.next()) {
            String clz = rst.getString("class");
            String subjectName = rst.getString("subjectName");
            Student student = new Student(clz, subjectName,0);
            return student;
        }
        return null;

    }
    public static String getMobieNum(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from student where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        while (rst.next()) {
           return rst.getString("mobileNum");
            
        }
        return null;

    }
    public static boolean isStudentAvailable(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from student where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        
        return rst.next();

    }
    public static boolean isClassAvailable(String clz) throws SQLException, ClassNotFoundException {
        String query = "select * from student where class='" + clz + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        
        return rst.next();

    }
     public static ArrayList<Student> getMobileNumbers() throws SQLException, ClassNotFoundException {
        String sql = "select mobileNum from student";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; rst.next(); i++) {
            String mobileNum = rst.getString("mobileNum");

            Student student = new Student( mobileNum);
            studentList.add(student);
        }

        return studentList;

    }
}
