/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Attendence {
    private String date;
    private String indexNo;
    private String time;
    private String clz;
    private String subjectName;
    private String attend;
    private String distric;
    private Student student;

    public Attendence() {
    }

    public Attendence( String indexNo,Student student) {
        this.indexNo = indexNo;
        this.student=student;
    }
    public Attendence(String date, String indexNo, String time, String clz, String subjectName, String attend,String distric) {
        this.date = date;
        this.indexNo = indexNo;
        this.time = time;
        this.clz = clz;
        this.subjectName = subjectName;
        this.attend = attend;
        this.distric = distric;
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
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
     * @return the attend
     */
    public String getAttend() {
        return attend;
    }

    /**
     * @param attend the attend to set
     */
    public void setAttend(String attend) {
        this.attend = attend;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getDistric() {
        return distric;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    
    
    
}
