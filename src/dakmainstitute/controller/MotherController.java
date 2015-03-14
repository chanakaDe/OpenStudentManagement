/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import java.sql.PreparedStatement;
import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Mother;
import dakmainstitute.model.School;
import dakmainstitute.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class MotherController {

    public static int addMother(Mother mother) throws SQLException, ClassNotFoundException {
        String indexNo = mother.getIndexNo();
        String motherName = mother.getMotherName();
        String occupation = mother.getOccupation();
        String officeAddress = mother.getOfficeAddress();
        String mobileNum = mother.getMobileNum();
        String officeNum = mother.getOfficeNum();

        String quary = "insert into mother values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, indexNo);
        preparedStatement.setString(2, motherName);
        preparedStatement.setString(3, occupation);
        preparedStatement.setString(4, officeAddress);
        preparedStatement.setString(5, mobileNum);
        preparedStatement.setString(6, officeNum);

        return preparedStatement.executeUpdate();
    }

    public static ArrayList<Mother> getAllDetails(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from mother where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Mother> motherList = new ArrayList<>();
        while (rst.next()) {

            String motherName = rst.getString("motherName");
            String occupation = rst.getString("occupation");
            String officeAddress = rst.getString("officeAddress");
            String mobileNum = rst.getString("mobileNum");
            String officeNum = rst.getString("officeNum");

            Mother mother = new Mother(motherName, occupation, officeAddress, mobileNum, officeNum);
            motherList.add(mother);
        }
        return motherList;

    }
}
