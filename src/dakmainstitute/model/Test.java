/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Test {
    private String testId;
    private String date;
    private String duration;
    private String testType;
    private String classes;
    private String subjectName;

    public Test() {
    }
    public Test(String testId) {
         this.testId = testId;
    }
    
    public Test(String date,String duration) {
         this.date = date;
         this.duration = duration;
    }
    public Test(String subjectName,String classes,int i) {
         this.subjectName = subjectName;
         this.classes = classes;
    }
    
    public Test(String testId, String date,String duration,String classes,String subjectName) {
         this.testId = testId;
         this.date = date;
         this.duration = duration;
         this.classes=classes;
         this.subjectName = subjectName;
    }
    
    public Test(String testId, String date, String duration, String testType,String classes,String subjectName) {
        this.testId = testId;
        this.date = date;
        this.duration = duration;
        this.testType = testType;
        this.classes=classes;
        this.subjectName=subjectName;
    }

    /**
     * @return the testId
     */
    public String getTestId() {
        return testId;
    }

    /**
     * @param testId the testId to set
     */
    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the testType
     */
    public String getTestType() {
        return testType;
    }

    /**
     * @param testType the testType to set
     */
    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSubject() {
        return subjectName;
    }

    public void setSubject(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return testId+"";
    }
    

 
}
