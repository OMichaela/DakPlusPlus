package Data;

import Model.Project;
import Model.Staff;
import Model.WorkDone;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkDoneDAO {

    private List<WorkDone> getAllWorkDone () throws SQLException {
        String sql = "SELECT * FROM INNER JOIN staff ON Staff_id + INNER JOIN project ON project_number";
        List<WorkDone> workDoneList = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                WorkDone workDone = new WorkDone();
                workDone.setStaffId(rs.getInt("staff_id"));
                workDone.setProjectNumber(rs.getInt("project_number"));
                workDone.setDateWorkDone(rs.getDate("date_work_done"));
                workDone.setHoursWorked(rs.getInt("hours_worked"));
                workDone.setRemarks(rs.getString("remarks"));

                workDoneList.add(workDone);

            }

            return workDoneList;
        }

                //IS/past
                public List<WorkDone> whoOnWhichProject (int staffId, int projectNumber) throws SQLException {
                    String sql = "SELECT * FROM staff JOIN project WHERE staff_id =? OR project_number=?";
                    List<Project> whoOnWhichProjectList = new ArrayList<>();
                    List<Staff>
                    Connection connection = ConnectionFactory.getConnection();
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(sql);

                    while (rs.next()) {
                        Project whoOnWhichProject = new whoOnWhichProject();

                        whoOnWhichProject.setStaffId(rs.getInt("staff_id"));
                        whoOnWhichProject.setProjectNumber(rs.getInt("project_number"));
                        whoOnWhichProjectList.add(whoOnWhichProject);
                    }

                    return whoOnWhichProjectList;
                }


    public void addRecords(WorkDone workDone) throws SQLException {
        String sql=  "INSERT INTO staff JOIN project (staff_Id,project_number,date_work_done,hours_worked,remarks) VALUES ( ?, ?, ?, ?, ?)");

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);


        statement.setInt(1, workDone.getStaffId());
        statement.setInt(2, workDone.getProjectNumber());
        statement.setDate(3, (workDone.getDateWorkDone()));
        statement.setInt(4, workDone.getHoursWorked());
        statement.setString(5, workDone.getRemarks());
     }


    public void deleteRecords(WorkDone workDone) throws SQLException {
        String sql = "DELETE FROM workdone WHERE employee_id = ? AND project_number = ?";

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        }

    }


}
