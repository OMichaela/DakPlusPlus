package Model;

import java.time.LocalDate;

public class Staff {

    private int staffId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String ICEPhoneNumber;
    private LocalDate dateOfBirth;
    private double salary;

    public static void add(Staff staff) {
    }


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

    public String getICEPhoneNumber(){
        return ICEPhoneNumber;
    }

    public void setICEPhoneNumber(String ICEPhoneNumber){
        this.ICEPhoneNumber = ICEPhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
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
                ", ICEPhoneNumber='" + ICEPhoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
