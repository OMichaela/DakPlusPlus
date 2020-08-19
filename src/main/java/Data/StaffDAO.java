package Data;

import Model.Staff;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class StaffDAO {


    public List<Staff> getAllStaff() throws SQLException {
        String sql = "SELECT * FROM staff";
        List<Staff> staffList = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);

                while(rs.next()){
                    Staff staff = new Staff();
                    staff.setStaffId(rs.getInt("staff_id"));
                    staff.setFirstName(rs.getString("first_name"));
                    staff.setLastName(rs.getString("last_name"));
                    staff.setPhoneNumber(rs.getString("phone_number"));
                    staff.setPhoneNumberIce(rs.getString("phone_number_ice"));
                    staff.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
                    staff.setSalary(rs.getDouble("salary"));
                    staffList.add(staff);
                }
                return staffList;
    }

    public void addStaff(Staff staff) throws SQLException {

        String sql = "INSERT INTO Staff(first_name,last_name,phone_number,phone_number_ice,date_of_birth,salary) VALUES (?,?,?,?,?,?)";
        Connection connection = ConnectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, staff.getFirstName());
        statement.setString(2, staff.getLastName());
        statement.setString(3, staff.getPhoneNumber());
        statement.setString(4, staff.getPhoneNumberIce());
        statement.setDate(5, Date.valueOf(staff.getDateOfBirth()));
        statement.setDouble(6, staff.getSalary());
        statement.executeUpdate();

    }

    public void deleteStaff(int staffId) throws SQLException {

        String sql = "DELETE FROM staff WHERE staff_id = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, staffId);
        statement.executeUpdate();
}

    public void updateStaff(Staff staff) throws SQLException {
        String sql = "UPDATE staff SET (first_name=?,last_name=?,phone_number=?,phone_number_ice=?,date_of_birth=?,salary=? WHERE staff_id=?)";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, staff.getFirstName());
        statement.setString(2, staff.getLastName());
        statement.setString(3, staff.getPhoneNumber());
        statement.setString(4, staff.getPhoneNumberIce());
        statement.setDate(5, Date.valueOf(staff.getDateOfBirth()));
        statement.setDouble(6, staff.getSalary());
        statement.setInt(7, staff.getStaffId());
        statement.executeUpdate();
    }

    public List<Staff> getStaffByFirstOrLastName(String firstNameOrLastName) throws SQLException {
        String sql = "SELECT * FROM staff WHERE first_name =? OR last_name=?";
        List<Staff> staffListByName = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, firstNameOrLastName);
        statement.setString(2, firstNameOrLastName);
        ResultSet rs = statement.executeQuery(sql);


        while(rs.next()){
            Staff staff = new Staff();
            staff.setStaffId(rs.getInt("staff_id"));
            staff.setFirstName(rs.getString("first_name"));
            staff.setLastName(rs.getString("last_name"));
            staff.setPhoneNumber(rs.getString("phone_number"));
            staff.setPhoneNumberIce(rs.getString("phone_number_Ice"));
            staff.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
            staff.setSalary(rs.getDouble("salary"));
            staffListByName.add(staff);
        }
        return staffListByName;

    }

    public List<Staff> getStaffByBirthDayToday() throws SQLException {
        String sql = "SELECT * FROM staff WHERE DAY(date_of_birth) = DAY(now()) AND MONTH(date_of_birth) = MONTH(now());";
        List<Staff> staffListByName = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            Staff staff = new Staff();
            staff.setStaffId(rs.getInt("staff_id"));
            staff.setFirstName(rs.getString("first_name"));
            staff.setLastName(rs.getString("last_name"));
            staff.setPhoneNumber(rs.getString("phone_number"));
            staff.setPhoneNumberIce(rs.getString("phone_number_Ice"));
            staff.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
            staff.setSalary(rs.getDouble("salary"));
            staffListByName.add(staff);
        }
        return staffListByName;

    }

    public List<Staff> getStaffByBirthDayThisWeek() throws SQLException {
        String sql = "SELECT * FROM staff WHERE WEEK(date_of_birth) = WEEK(now());";
        List<Staff> staffListByName = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery(sql);


        while(rs.next()){
            Staff staff = new Staff();
            staff.setStaffId(rs.getInt("staff_id"));
            staff.setFirstName(rs.getString("first_name"));
            staff.setLastName(rs.getString("last_name"));
            staff.setPhoneNumber(rs.getString("phone_number"));
            staff.setPhoneNumberIce(rs.getString("phone_number_Ice"));
            staff.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
            staff.setSalary(rs.getDouble("salary"));
            staffListByName.add(staff);
        }
        return staffListByName;

    }

}
