package View;

import Model.Staff;
import Model.WorkDone;
import Service.StaffService;
import Service.WorkDoneService;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.List;

public class SecretariatView {
    public static void main(String[] args) {

    }


    protected void StaffDayAtWork(WorkDoneService workDoneService) {
        List<WorkDone> workDone = null;


        }

    }

    protected void findStaffByName(StaffService staffService) {
        System.out.println("Fill Staff first or last name:");
        List<Staff> staff = null;

        }


        protected void birthdaysToday(StaffService staffService) throws SQLException {
        List<Staff> result = StaffService.getStaffBirthToday();
        if (result.isEmpty()) {
            System.out.println("No birthday today");
        } else {
            System.out.println("Today is the birthday of:");
        result.forEach(System.out :: println);}
    }


    protected void birthdaysThisWeek(StaffService staffService) throws SQLException {
        List<Staff> result = StaffService.getStaffBornThisWeek();
        if (result.isEmpty()) {
            System.out.println("No birthday this week");
        } else {
            System.out.println("This week we'll celebrate birthdays of:");
        result.forEach(System.out :: println);
        }


    }
