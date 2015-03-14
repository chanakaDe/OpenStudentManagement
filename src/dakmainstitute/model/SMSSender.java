/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class SMSSender {
    
    private String indexNo;
    private String testId;
    private String marks;
    private int rank;
    private String schName;
    private String contactNo;

    public SMSSender() {
    }

    public SMSSender(String indexNo, String testId, String marks, int rank, String schName) {
        this.indexNo = indexNo;
        this.testId = testId;
        this.marks = marks;
        this.rank = rank;
        this.schName = schName;
    }
    
    public SMSSender(String indexNo, String testId, String marks, int rank,String contactNo,int i) {
        this.indexNo = indexNo;
        this.testId = testId;
        this.marks = marks;
        this.rank = rank;
        this.contactNo=contactNo;
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
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @return the schName
     */
    public String getSchName() {
        return schName;
    }

    /**
     * @param schName the schName to set
     */
    public void setSchName(String schName) {
        this.schName = schName;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    
    
    
    
}
