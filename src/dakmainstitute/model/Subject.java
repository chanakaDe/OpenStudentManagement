/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Subject {
    private String subjectName;
    private String fee;
    private String dayOfWeek;
    private String duration;

    public Subject() {
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }
    
 
    
    public Subject(String subjectName, String fee, String dayOfWeek, String duration) {
        this.subjectName = subjectName;
        this.fee = fee;
        this.dayOfWeek = dayOfWeek;
        this.duration = duration;
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
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the dayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * @param dayOfWeek the dayOfWeek to set
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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

    @Override
    public String toString() {
        return subjectName+"";
    }
    
    
}
