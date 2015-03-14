/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Student;
import dakmainstitute.model.Test;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class TestController {

    public static int addTest(Test test) throws SQLException, ClassNotFoundException {
        String testId = test.getTestId();
        String date = test.getDate();
        String duration = test.getDuration();
        String testType = test.getTestType();
        String classes = test.getClasses();
        String subject = test.getSubject();

        String quary = "insert into test values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, testId);
        preparedStatement.setString(2, date);
        preparedStatement.setString(3, duration);
        preparedStatement.setString(4, testType);
        preparedStatement.setString(5, classes);
        preparedStatement.setString(6, subject);

        return preparedStatement.executeUpdate();
    }

    public static ArrayList<Test> getAllTestId() throws SQLException, ClassNotFoundException {
        String quary = "select * from test";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(quary);
        ArrayList<Test> testList = new ArrayList<>();

        while (rst.next()) {
            String testId = rst.getString("testId");
            String date = rst.getString("date");
            String duration = rst.getString("duration");
            String classes = rst.getString("classes");
            String subject = rst.getString("subjectName");
            Test test = new Test(testId, date, duration, classes, subject);
            testList.add(test);
        }
        return testList;
    }

    public static ArrayList<Test> getTestId(String clz, String subject, String testType) throws SQLException, ClassNotFoundException {
        String query = "select testId from test where classes='" + clz + "' AND subjectName='" + subject + "' AND testType='" + testType + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Test> testIdList = new ArrayList<>();
        while (rst.next()) {
            String testId = rst.getString("testId");
            Test test = new Test(testId);
            testIdList.add(test);
        }
        return testIdList;

    }

    public static ArrayList<Test> getDuration(String testId) throws SQLException, ClassNotFoundException {
        String query = "select * from test where testId='" + testId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Test> testIdList = new ArrayList<>();
        while (rst.next()) {
            String date = rst.getString("Date");
            String duration = rst.getString("duration");
            Test test = new Test(date, duration);
            testIdList.add(test);
        }
        return testIdList;

    }
    public static ArrayList<Test> getTestId(String date) throws SQLException, ClassNotFoundException {
        String query = "select * from test where date='" + date + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Test> testIdList = new ArrayList<>();
        while (rst.next()) {
            String testId = rst.getString("testId");
            Test test = new Test(testId);
            testIdList.add(test);
        }
        return testIdList;
    }
    public static ArrayList<Test> getSubjectAndClz(String testId) throws SQLException, ClassNotFoundException {
        String query = "select * from test where testId='" + testId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Test> testIdList = new ArrayList<>();
        while (rst.next()) {
            String subject = rst.getString("subjectName");
            String clz = rst.getString("classes");
            Test test = new Test(subject,clz,0);
            testIdList.add(test);
        }
        return testIdList;
    }

    
}
