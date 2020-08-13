package Data;

import Data.ConnectionFactory;
import Model.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class ProjectDAO {

    public void createProject(Project project) throws SQLException {

        String sql = "INSERT INTO project(project_number,project_name,project_start,description,price,expected_date) VALUES ('?,?,?,?,?,?')";

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeUpdate(sql:"CREATE FROM");

        statement.setInt(1, project.getProjectNumber());
        statement.setString(2, project.getProjectName());
        statement.setDate(3, Date.valueOf(project.getProjectStart());
        statement.setString(4, project.getDescription());
        statement.setDouble(5, project.getPrice());
        statement.setDate(6, Date.valueOf(project.getExpectedDate());
        statement.executeUpdate();
    }


    public void deleteProject(Project project) throws SQLException {

        String sql = "DELETE FROM WHERE projectNumber = '?'";

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, project.getProjectNumber());

        statement.executeUpdate();
    }


}
