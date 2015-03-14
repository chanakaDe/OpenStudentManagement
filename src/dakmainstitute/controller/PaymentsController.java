/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.controller;

import dakmainstitute.db.DBConnection;
import dakmainstitute.model.Payments;
import dakmainstitute.model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shashi
 */
public class PaymentsController {

    public static int addPayments(Payments payments) throws SQLException, ClassNotFoundException {
        String month = payments.getMonth();
        String indexNo = payments.getIndexNo();
        String clz = payments.getClz();
        String subjectName = payments.getSubjectName();
        String payment = payments.getPayment();

        String quary = "insert into payments values(?,?,?,?,?)";
        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(quary);
        preparedStatement.setString(1, month);
        preparedStatement.setString(2, indexNo);
        preparedStatement.setString(3, clz);
        preparedStatement.setString(4, subjectName);
        preparedStatement.setString(5, payment);

        return preparedStatement.executeUpdate();
    }

    public static String searchPayments(String indexNo, String month) throws SQLException, ClassNotFoundException {
        String query = "select * from payments where indexNo='" + indexNo + "' AND month='" + month + "' ";
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(query);

        while (rst.next()) {
            String payment = rst.getString("payment");

            return payment;

        }
        return null;

    }

    public static int updatePayments(Payments payments) throws SQLException, ClassNotFoundException {
        String query = "Update payments set payment='" + payments.getPayment() + "' where indexNo='" + payments.getIndexNo()+ "'AND month='"+payments.getMonth()+"'";
        int res = DBConnection.getInstance().getConnection().createStatement().executeUpdate(query);
        return res;
    }
}
