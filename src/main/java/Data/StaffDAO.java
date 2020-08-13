package Data;

import java.sql.*;

import Model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class StaffDAO {

    public List<Staff> getAllStaff() throws SQLException, ClassNotFoundException{
        List<Staff> staff = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql:"SELECT * FROM Employee");

                while(ResultSet.next()){
                    Staff staff = new Staff();
                    staff.setStaffId(rs.getInt(columnLabel:"id"));
                    staff.setFirstName(rs.getString(columnLabel:"first_name"));
                    staff.setLastName(rs.getString(columnLabel:"last_name"));
                    staff.getPhoneNumber(rs.getString(columnLabel:"phone_number"));
                    staff.getICEPhoneNumber(rs.getString(columnLabel:"ICE_phone_number"));
                    staff.getDateOfBirth(rs.getLocalDate(columnLabel:"date_of_birth"))
                    staff.getSalary(rs.getDouble(columnLabel:"salary"));
                    Staff.add(staff);
                }
                return staff;
    }

    public void addStaff(Staff staff) throws SQLException {

        String sql = "INSERT INTO Staff(firstName,lastName,phoneNumber,ICEPHoneNumber,date_of_birth,salary) VALUES (?,?,?,?,?,?)";
        Connection connection = ConnectionFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, staff.getFirstName());
        statement.setString(2, staff.getLastName());
        statement.setString(3, staff.getPhoneNumber());
        statement.setString(4, staff.getICEPhoneNumber());
        statement.setDate(5, Date.valueOf(staff.getDateOfBirth());
        statement.setDouble(6, staff.getSalary());
        statement.executeUpdate();

    }

    public void deleteStaff(Staff staff) throws SQLException {

        String sql = "DELETE FROM staff WHERE staffId = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, staff.getStaffId());
        statement.executeUpdate();
}

    public void updateStaff(Staff staff) throws SQLException{

    }
}
