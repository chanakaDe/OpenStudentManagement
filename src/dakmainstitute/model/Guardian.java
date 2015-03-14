/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Guardian {
   private String indexNo;
   private String guardianName;
   private String occupation;
   private String officeAddress;
   private String mobileNum;
   private String officeNum;

    public Guardian() {
    }

    public Guardian(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public Guardian(String guardianName, String occupation, String officeAddress, String mobileNum, String officeNum) {
        this.guardianName = guardianName;
        this.occupation = occupation;
        this.officeAddress = officeAddress;
        this.mobileNum = mobileNum;
        this.officeNum = officeNum;
    }
    public Guardian(String indexNo, String guardianName, String occupation, String officeAddress, String mobileNum, String officeNum) {
        this.indexNo = indexNo;
        this.guardianName = guardianName;
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
     * @return the guardianId
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * @param guardianId the guardianId to set
     */
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
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
