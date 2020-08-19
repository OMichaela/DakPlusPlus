package Data;

import Model.Project;
import Model.Staff;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class ProjectDAO {

    public void addProject(Project project) throws SQLException {

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

    public List<Project> getAllProjects() throws SQLException {

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


        public List<Project> findAllCurrentProjects(Date project) throws SQLException {
            Connection conn = ConnectionFactory.getConnection();
            List<Project> result = null;
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM project where endDate > ?");
            statement.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
            ResultSet rs = statement.executeQuery();

            return result = parseProjects(rs);
        }
            String sql = "SELECT * FROM Project WHERE ";

            List<Project> findAllCurrentProjectsList = new ArrayList<>();

            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.createStatement(sql);

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

            return findAllCurrentProjectsList;
}
    public List<Project> findProjectsStartingToday(Date projectStart) throws SQLException {

            String sql = "SELECT * FROM project WHERE DAY(project_start) = DAY(now()) AND MONTH(project_start) = MONTH(now());";

            List<Project> projectListByName = new ArrayList<>();

            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            Project project = new Project();
            project.setProjectNumber(rs.getInt("project_number"));
            project.setProjectName(rs.getString("project_name"));
            project.setProjectStart(rs.getDate("project_start"));
            project.setDescription(rs.getString("description"));
            project.setPrice(rs.getDouble("price"));
            project.setExpectedDate(rs.getDate("expected_date");
            projectListByName.add(project);
        }
        return projectListByName;

    }

}
}
