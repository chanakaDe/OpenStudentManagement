/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class TestMarks implements Comparable<TestMarks> {
    private String testId;
    private String indexNo;
    private int rank;
    private String marks;
    private Student student;
    private String avg;
    private String count;
    private String Number_of_student;
    private String totalMarks;
    
    
    

    public TestMarks() {
    }

    
    
    public TestMarks(String count,boolean b ) {
        this.count = count;
    }
    public TestMarks(String indexNo ) {
        this.indexNo = indexNo;
    }
    public TestMarks(String marks,int i ) {
        this.marks = marks;
    }
    
    public TestMarks(Student student ) {
        this.student = student;
    }
    
    public TestMarks(String testId, String indexNo ,String marks , int rank    ) {
        this.testId = testId;
        this.indexNo = indexNo;
        this.marks = marks;
        this.rank = rank;
    }
    
    public TestMarks(Student student , String avg,String Number_of_student,boolean b) {
        this.student = student;
        this.avg = avg;
        this.Number_of_student = Number_of_student;
    }
    
    public TestMarks(String indexNo , String marks) {
        this.indexNo = indexNo;
        this.marks = marks;
    }
    public TestMarks(Student student , String count,String totalMarks) {
        this.student = student;
        this.count = count;
        this.totalMarks = totalMarks;
    }
    
    
    public TestMarks( String testId,String marks,int i) {
        this.testId = testId;
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
    public TestMarks(String testId, String indexNo , String marks) {
        this.testId = testId;
        this.indexNo = indexNo;
        this.marks = marks;
    }
    
    
    
    public TestMarks(String indexNo ,Student student, String marks,boolean  b) {
        this.indexNo = indexNo;
        this.student = student;
        this.marks = marks;
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
     * @return the studentName
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

  

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int compareTo(TestMarks o) {
        return Integer.compare(Integer.parseInt(marks), Integer.parseInt(o.getMarks()));
    }

    @Override
    public String toString() {
        return indexNo+"  "+marks+"  "+rank;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getAvg() {
        return avg;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCount() {
        return count;
    }

    public void setNumber_of_student(String Number_of_student) {
        this.Number_of_student = Number_of_student;
    }

    public String getNumber_of_student() {
        return Number_of_student;
    }

    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getTotalMarks() {
        return totalMarks;
    }

    

    
}
