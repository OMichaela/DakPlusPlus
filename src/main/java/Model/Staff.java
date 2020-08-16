package Model;

import java.sql.Date;

public class Staff {

    private int staffId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String phoneNumberIce;
    private Date dateOfBirth;
    private double salary;


    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int StaffId){
        this.staffId = staffId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberIce(){
        return phoneNumberIce;
    }

    public void setPhoneNumberIce(String phoneNumberIce){
        this.phoneNumberIce = phoneNumberIce;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ICEPhoneNumber='" + phoneNumberIce + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
