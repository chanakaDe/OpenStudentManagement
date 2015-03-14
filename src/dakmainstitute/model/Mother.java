/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Mother {
   private String indexNo;
   private String motherName;
   private String occupation;
   private String officeAddress;
   private String mobileNum;
   private String officeNum;

    public Mother() {
    }

    public Mother( String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public Mother( String motherName, String occupation, String officeAddress, String mobileNum, String officeNum) {
        this.motherName = motherName;
        this.occupation = occupation;
        this.officeAddress = officeAddress;
        this.mobileNum = mobileNum;
        this.officeNum = officeNum;
    }
    public Mother(String indexNo, String motherName, String occupation, String officeAddress, String mobileNum, String officeNum) {
        this.indexNo = indexNo;
        this.motherName = motherName;
        this.occupation = occupation;
        this.officeAddress = officeAddress;
        this.mobileNum = mobileNum;
        this.officeNum = officeNum;
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
     * @return the motherId
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * @param motherId the motherId to set
     */
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the officeAddress
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * @param officeAddress the officeAddress to set
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * @return the mobileNum
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    /**
     * @return the officeNum
     */
    public String getOfficeNum() {
        return officeNum;
    }

    /**
     * @param officeNum the officeNum to set
     */
    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }
   
}
