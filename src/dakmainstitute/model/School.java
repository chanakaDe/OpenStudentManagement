/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class School {
    private String schoolId;
    private String schoolName;
    private String schoolDistric;

    public School() {
    }
    
    public School(String schoolId,int i) {
        this.schoolId = schoolId;
    }
    public School(String schoolName) {
        this.schoolName = schoolName;
    }
    
    public School(String schoolId, String schoolName) {
        this.schoolId=schoolId;
        this.schoolName = schoolName;
    }
    
    public School(String schoolId, String schoolName, String schoolDistric) {
        this.schoolId=schoolId;
        this.schoolName = schoolName;
        this.schoolDistric = schoolDistric;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolId() {
        return schoolId;
    }

   

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return the schoolDistric
     */
    public String getSchoolDistric() {
        return schoolDistric;
    }

    /**
     * @param distric the schoolDistric to set
     */
    public void setSchoolDistric(String schoolDistric) {
        this.schoolDistric = schoolDistric;
    }

    @Override
    public String toString() {
        return schoolId+" - "+schoolName;
    }
    
}
