package Service;

import Data.StaffDAO;
import Model.Staff;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class StaffService {

    private static StaffDAO staffDAO = new StaffDAO();

    public List<Staff> findAllStaff(){
        try {
            return staffDAO.getAllStaff();
        } catch (SQLException throwables) {
            System.out.println("Cannot get staff information from DB");
        }
        return null;
    }

    public List<Staff> findAllStaffByBirthdayIsToday(){
        try {
            return staffDAO.getStaffByBirthDayToday();
        } catch (SQLException throwables) {
            System.out.println("Cannot get today's birthdays from DB");
        }
        return null;
    }

    public List<Staff> findAllStaffByBirthdayIsThisWeek(){
        try {
            return staffDAO.getStaffByBirthDayThisWeek();
        } catch (SQLException throwables) {
            System.out.println("Cannot get next birthdays from DB");
        }
        return null;
    }

    public List<Staff> findStaffByFirstNameOrLastName(final String firstNameOrLastName){
        try {
            return staffDAO.getStaffByFirstOrLastName(firstNameOrLastName);
        } catch (SQLException throwables) {
            System.out.println("Cannot get staff information from DB");
        }
        return null;
    }

    private boolean isStaffValid(Staff staff){

        boolean isValid = true;
        if(staff.getPhoneNumber().length() < 10){
            System.out.println("Phone number must contain 10 digits: please enter a valid number");
            isValid = false;
        }

        if(staff.getFirstName().equals("") || staff.getLastName().equals("")){
            System.out.println("First name and last name cannot be empty");
            isValid = false;
        }

        if(staff.getSalary() > 0){
            System.out.println("Salary must be greater than 0");
            isValid = false;
        }

        if(staff.getDateOfBirth().isAfter((LocalDate.now().minusYears(18)))){
            System.out.println("Staff must be older than 18 years old!");
            isValid = false;
        }
        return isValid;
    }

    public boolean addStaff(Staff staffToAdd){
        final boolean isStaffValid = isStaffValid(staffToAdd);
        if(isStaffValid){
            try {
                staffDAO.addStaff(staffToAdd);
                return true;
            } catch (SQLException throwables) {
                System.out.println("Problem with adding new staff");
                return false;
            }
        }
        return false;
    }

    public void editStaff(Staff staffToUpdate, int id){
        try {
            staffDAO.updateStaff(staffToUpdate);
        } catch (SQLException throwables) {
            System.out.println("Problem with editing staff information, please make sure that id is correct");
        }
    }

    public void removeStaff(int id){
        try {
            staffDAO.deleteStaff(id);
        } catch (SQLException throwables) {
            System.out.println("Problem with deleting staff, please make sure that staff with id " + id + " exists..");
        }
    }

}
