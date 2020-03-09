package model;

public class Employee {
    private  String eid;
    private String fname ;
    private String lname;
    private String dob;
    private String address;
    private String gender;
    private String[] qualification;
    private String tpNo;
    private double salary;
    private String position;
    private String[] school;
    private String bankAccNo;

    public Employee() {
         this.eid = " ";
        this.fname = " ";
        this.lname = " ";
        this.dob = " ";
        this.address = " ";
        this.gender=" ";
        this.tpNo = " ";
        this.salary = 0;
        this.position = " ";
        this.bankAccNo = "0";
        
    }
    
    
    
   

    public Employee(String eid, String fname, String lname, String dob, String address,String gender, String[] qualification, String tpNo, double salary, String position, String[] school, String bankAccNo) {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
        this.gender=gender;
        this.qualification = qualification;
        this.tpNo = tpNo;
        this.salary = salary;
        this.position = position;
        this.school = school;
        this.bankAccNo = bankAccNo;
        
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
    
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getQualification() {
        return qualification;
    }

    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }

    public String getTpNo() {
        return tpNo;
    }

    public void setTpNo(String tpNo) {
        this.tpNo = tpNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getSchool() {
        return school;
    }

    public void setSchool(String[] school) {
        this.school = school;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }
    
    
    
}

