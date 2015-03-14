/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dakmainstitute.model;

import dakmainstitute.db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Shashi
 */
public class Payments {
    private String month;
    private String indexNo;
    private String clz;
    private String subjectName;
    private String payment;

    public Payments() {
    }

    public Payments(String payment) {
        this.payment = payment;
    }
    
    public Payments(String month, String indexNo, String clz, String subjectName, String payment) {
        this.month = month;
        this.indexNo = indexNo;
        this.clz = clz;
        this.subjectName = subjectName;
        this.payment = payment;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the indexNo
     */
    public String getIndexNo() {
        return indexNo;
    }

    /**
     * @param indexNo the indexNo to set
     */
    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    /**
     * @return the clz
     */
    public String getClz() {
        return clz;
    }

    /**
     * @param clz the clz to set
     */
    public void setClz(String clz) {
        this.clz = clz;
    }

    /**
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return payment+"";
    }
    
    
}
