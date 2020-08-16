package Service;

import Data.StaffDAO;
import Model.Staff;

import java.sql.SQLException;
import java.util.List;

public class StaffService {


    public static List<Staff> getStaffBirthToday() {
    }

    public List<Staff> getStaffBornThisWeekBornToday() throws SQLException {
        return StaffDAO.getStaffBornToday();

    }

    public List<Staff> getStaffBornThisWeek() throws SQLException {
        return StaffDAO.getStaffBornThisWeek();
    }
}
