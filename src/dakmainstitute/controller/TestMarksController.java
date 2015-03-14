/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.School;
import dakmainstitute.model.Student;
import dakmainstitute.model.Test;
import dakmainstitute.model.TestMarks;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class TestMarksController {

    public static int addTestMarks(TestMarks testMarks) throws SQLException, ClassNotFoundException {
        String testId = testMarks.getTestId();
        String indexNo = testMarks.getIndexNo();
        String marks = testMarks.getMarks();
        String quary = "insert into testMarks values(?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, testId);
        preparedStatement.setString(2, indexNo);
        preparedStatement.setString(3, marks);

        return preparedStatement.executeUpdate();
    }

    public static ArrayList<TestMarks> viewStudentMarks(String testId, String distric) throws SQLException, ClassNotFoundException {
        String query = "select * from testMarks t,student s,school sc  where t.testId='" + testId + "' and s.indexNo=t.IndexNo and s.schoolId=sc.schoolId order by t.marks desc";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> marksList = new ArrayList<>();
        while (rst.next()) {
            if (rst.getString("indexNo").charAt(0) == distric.charAt(0)) {
                String indexNo = rst.getString("indexNo");
                String studentName = rst.getString("studentName");
                String schoolName = rst.getString("schoolName");
                String marks = rst.getString("marks");

                School school = new School(schoolName);
                Student student = new Student(studentName, school);

                TestMarks testMarks = new TestMarks(indexNo, student, marks,true);
                marksList.add(testMarks);
            } else {
                return null;
            }
        }
        return marksList;

    }

    public static ArrayList<TestMarks> getTestMarks(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from testMarks where indexNo='" + indexNo + "' ";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> marksList = new ArrayList<>();
        while (rst.next()) {
            String marks = rst.getString("marks");
            String tstId = rst.getString("testId");

            TestMarks testMarks = new TestMarks(tstId, marks, 0);
            marksList.add(testMarks);
        }
        return marksList;

    }
//    public static ArrayList<TestMarks> getTestMarks11() throws SQLException, ClassNotFoundException{
//        String query = "select * from testMarks  ";
//        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
//        ArrayList<TestMarks> marksList = new ArrayList<>();
//        while (rst.next()) {
//            String marks = rst.getString("marks");
//            String tstId = rst.getString("testId");
//
//           
//
//            TestMarks testMarks = new TestMarks(tstId,marks,0);
//            marksList.add(testMarks);
//        }
//        return marksList;
//        
//    }

    public static ArrayList<TestMarks> getStudentMarks(String testId, String distric) throws SQLException, ClassNotFoundException {
        String query = "select * from testMarks  where testId='" + testId + "' ";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> marksList = new ArrayList<>();
        while (rst.next()) {
            if (rst.getString("indexNo").charAt(0) == distric.charAt(0)) {
                String marks = rst.getString("marks");
                String indexNo = rst.getString("indexNo");

                TestMarks testMarks = new TestMarks(indexNo, marks);
                marksList.add(testMarks);
            } else {
                return null;
            }
        }
        return marksList;
    }

    public static ArrayList<TestMarks> getSchoolsRank(String testId) throws SQLException, ClassNotFoundException {
        String query = "select sc.schoolName,SUM(marks)/COUNT(s.schoolId) AS avg,"
                + "count(s.indexNo) AS Number_of_student from testMarks t,student s,school sc where"
                + " testId='" + testId + "' AND sc.schoolId=s.schoolId AND t.indexNo=s.indexNo "
                + "group by (s.schoolId) order by (SUM(marks)/COUNT(s.schoolId)) desc;";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> testIdList = new ArrayList<>();
        while (rst.next()) {
            String schoolName = rst.getString("schoolName");
            String avg = rst.getString("avg");
            String Number_of_student = rst.getString("Number_of_student");
            School school = new School(schoolName);
            Student student = new Student(school, true);
            TestMarks testMarks = new TestMarks(student, avg, Number_of_student, true);
            testIdList.add(testMarks);
        }
        return testIdList;

    }
    public static ArrayList<TestMarks> getPrecentageOfSchoolsGetA(String testId,String marks) throws SQLException, ClassNotFoundException {
        String query = "select sc.schoolName,count(s.indexNo) AS studentCount, sum(t.marks) AS totalMarks from testMarks t,student s,school sc where t.testId='"+testId+"' AND t.marks>="+marks+" AND sc.schoolId=s.schoolId AND t.indexNo=s.indexNo group by (s.schoolId) order by sum(t.marks) desc";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> testIdList = new ArrayList<>();
        while (rst.next()) {
            String schoolName = rst.getString("schoolName");
            String studentCount = rst.getString("studentCount");
            String totMarks = rst.getString("totalMarks");
            School school = new School(schoolName);
            Student student = new Student(school, true);
            TestMarks testMarks = new TestMarks(student, studentCount,totMarks);
            testIdList.add(testMarks);
        }
        return testIdList;

    }

    public static ArrayList<TestMarks> getStudentCountOfRanges(String testId, String firstRange, String secRange) throws SQLException, ClassNotFoundException {
        String query = "select COUNT(indexNo) AS count_of_student from testMarks where testId='" + testId + "' AND marks between '" + firstRange + "' and '" + secRange + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> testIdList = new ArrayList<>();
        while (rst.next()) {
            String count = rst.getString("count_of_student");

            TestMarks testMarks = new TestMarks(count, true);
            testIdList.add(testMarks);
        }
        return testIdList;

    }
    public static String allOfStudentCountOfgetA(String testId, String marks) throws SQLException, ClassNotFoundException {
        String query = "select COUNT(indexNo) AS count_of_student from testMarks where testId='" + testId + "' AND marks>="+marks+"";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<TestMarks> testIdList = new ArrayList<>();
        while (rst.next()) {
            String count = rst.getString("count_of_student");

            return count;
        }
        return null;

    }

    public static String getAllOfStudentsCount(String testId) throws SQLException, ClassNotFoundException {
        String query = "select COUNT(indexNo) AS count from testMarks where testId='" + testId + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        while (rst.next()) {
            String count = rst.getString("count");

            return count;
        }
        return null;

    }

}
