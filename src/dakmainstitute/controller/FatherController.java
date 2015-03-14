/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Father;
import dakmainstitute.model.Mother;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class FatherController {

    public static int addFather(Father father) throws SQLException, ClassNotFoundException {
        String quary = "insert into father values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, father.getIndexNo());
        preparedStatement.setString(2, father.getFatherName());
        preparedStatement.setString(3, father.getOccupation());
        preparedStatement.setString(4, father.getOfficeAddress());
        preparedStatement.setString(5, father.getMobileNum());
        preparedStatement.setString(6, father.getOfficeNum());

        return preparedStatement.executeUpdate();
    }

    public static ArrayList<Father> getAllDetails(String indexNo) throws SQLException, ClassNotFoundException {
        String query = "select * from father where indexNo='" + indexNo + "'";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);
        ArrayList<Father> fatherList = new ArrayList<>();
        while (rst.next()) {

            String fatherName = rst.getString("fatherName");
            String occupation = rst.getString("occupation");
            String officeAddress = rst.getString("officeAddress");
            String mobileNum = rst.getString("mobileNum");
            String officeNum = rst.getString("officeNum");

            Father father = new Father(fatherName, occupation, officeAddress, mobileNum, officeNum);
            fatherList.add(father);
        }
        return fatherList;
    }
}
