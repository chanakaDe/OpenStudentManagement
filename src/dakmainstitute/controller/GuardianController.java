/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import java.sql.PreparedStatement;
import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Guardian;
import dakmainstitute.model.Mother;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class GuardianController {

    public static int addGuardian(Guardian guardian) throws SQLException, ClassNotFoundException {
        String quary = "insert into guardian values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, guardian.getIndexNo());
        preparedStatement.setString(2, guardian.getGuardianName());
        preparedStatement.setString(3, guardian.getOccupation());
        preparedStatement.setString(4, guardian.getOfficeAddress());
        preparedStatement.setString(5, guardian.getMobileNum());
        preparedStatement.setString(6, guardian.getOfficeNum());

        return preparedStatement.executeUpdate();

    }

    public static ArrayList<Guardian> getAllDetails(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from guardian where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Guardian> guardianList = new ArrayList<>();
        while (rst.next()) {

            String guardianName = rst.getString("guardianName");
            String occupation = rst.getString("occupation");
            String officeAddress = rst.getString("officeAddress");
            String mobileNum = rst.getString("mobileNum");
            String officeNum = rst.getString("officeNum");

            Guardian guardian = new Guardian(guardianName, occupation, officeAddress, mobileNum, officeNum);
            guardianList.add(guardian);
        }
        return guardianList;

    }
}
