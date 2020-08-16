package Data;

import Model.Project;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class ProjectDAO {

    public void createProject(Project project) throws SQLException {

        String sql = "INSERT INTO project(project_number,project_name,project_start,description,price,expected_date) VALUES ('?,?,?,?,?,?')";

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, project.getProjectNumber());
        statement.setString(2, project.getProjectName());
        statement.setDate(3, project.getProjectStart());
        statement.setString(4, project.getDescription());
        statement.setDouble(5, project.getPrice());
        statement.setDate(6, project.getExpectedDate());
        int updateCount = statement.executeUpdate(sql);
    }


    public void deleteProject(int projectNumber) throws SQLException {

        String sql = "DELETE FROM project WHERE project_number = ?";

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, projectNumber);
        int deleteCount= statement.executeUpdate();
    }

    public List<Project> getAllProject() throws SQLException {

        String sql = "SELECT * FROM Project";
        List<Project> projectList = new ArrayList<>();

        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            Project project = new Project();

            project.setProjectNumber(rs.getInt("project_number"));
            project.setProjectName(rs.getString("project_name"));
            project.setProjectStart(rs.getDate("project_start"));
            project.setDescription(rs.getString("description"));
            project.setPrice(rs.getDouble("price"));
            project.setExpectedDate(rs.getDate("expected_date"));
            projectList.add(project);
        }

        return projectList;
}

}
