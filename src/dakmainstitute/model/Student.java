/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.model;

/**
 *
 * @author Shashi
 */
public class Student {

    private String indexNo;
    private String nic;
    private String studentName;
    private String Address;
    private String dateOfBirth;
    private String school;
    private String mobileNum;
    private String homeNum;
    private String gender;
    private String distric;
    private String dateOfAdd;
    private String classes;
    private String subjectName;
    private Mother mother;
    private Father father;
    private Guardian guardian;
    private School schools;

    public Student() {
    }

    public Student(School schools,boolean b) {
        this.schools = schools;
    }
    public Student(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public Student(String studentName,String s) {
        this.studentName = studentName;
    }
    public Student(String indexNo,int i) {
        this.indexNo = indexNo;
    }
    public Student(String indexNo, String studentName, String school) {
        this.indexNo = indexNo;
        this.studentName = studentName;
        this.school = school;
    }

    public Student( String classes,String subjectName,int i) {
        this.classes = classes;
        this.subjectName = subjectName;
    }

    

    
    public Student(String studentName, School schools) {

        this.studentName = studentName;
        this.schools = schools;
    }
    public Student( String studentName, String Address, School schools,String dateOfBirth, String nic, String mobileNum , String homeNum ,boolean b) {
        this.Address = Address;
        this.studentName = studentName;
        this.schools = schools;
        this.dateOfBirth = dateOfBirth;
        this.nic= nic;
        this.mobileNum = mobileNum;
        this.homeNum = homeNum;
    }
    public Student(String indexNo, String studentName,  School schools,String classes, String subject, String mobileNum , String homeNum) {
        this.indexNo = indexNo;
        this.studentName = studentName;
        this.schools = schools;
        this.classes = classes;
        this.subjectName= subject;
        this.mobileNum = mobileNum;
        this.homeNum = homeNum;
    }
    public Student(String indexNo, String nic, String studentName, String dateOfAdd, String Address, String dateOfBirth, String school, String mobileNum, String homeNum, String gender, String distric, String classes, String subjectName) {
        this.indexNo = indexNo;
        this.nic = nic;
        this.studentName = studentName;
        this.dateOfAdd = dateOfAdd;
        this.Address = Address;
        this.dateOfBirth = dateOfBirth;
        this.school = school;
        this.mobileNum = mobileNum;
        this.homeNum = homeNum;
        this.gender = gender;
        this.distric = distric;
        this.classes = classes;
        this.subjectName = subjectName;
    }
    public Student(String indexNo, String nic, String studentName, String Address, String dateOfBirth, String school, String mobileNum, String homeNum, String gender, String distric, String dateOfAdd, String classes, String subjectName, Mother mother, Father father,Guardian guardian) {
        this.indexNo = indexNo;
        this.nic = nic;
        this.studentName = studentName;
        this.Address = Address;
        this.dateOfBirth = dateOfBirth;
        this.school = school;
        this.mobileNum = mobileNum;
        this.homeNum = homeNum;
        this.gender = gender;
        this.distric = distric;
        this.dateOfAdd = dateOfAdd;
        this.classes = classes;
        this.subjectName = subjectName;
        this.mother = mother;
        this.father = father;
        this.guardian = guardian;
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
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the TempAddress
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the TempAddress to set
     */
    public void setTempAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
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
     * @return the homeNum
     */
    public String getHomeNum() {
        return homeNum;
    }

    /**
     * @param homeNum the homeNum to set
     */
    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getDistric() {
        return distric;
    }

    @Override
    public String toString() {
        return mobileNum+"";
    }
    
    public void setDateOfAdd(String dateOfAdd) {
        this.dateOfAdd = dateOfAdd;
    }

    public String getDateOfAdd() {
        return dateOfAdd;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setSubject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getClasses() {
        return classes;
    }

    public String getSubject() {
        return subjectName;
    }

    public void setSchools(School schools) {
        this.schools = schools;
    }

    public School getSchools() {
        return schools;
    }

    
    /**
     * @return the age
     */
    
}
