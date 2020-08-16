package Service;

import Data.ConnectionFactory;
import Model.Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    private java.lang.Object Object;

    public boolean projectExpectedValidDate(Project project, Object date){
            if(project.getExpectedDate().before(project.getProjectStart())) {
        return false; // System.out.println("Invalid date entry: starting date begins after Expected
        return true;
            }

    public boolean projectValidDate(Project project);{
                if (project.getProjectStart().before(now) {
        return false; //System.out.println("Invalid date entry: you cannot add this project")
        return true;
    }


    public getProjectsCurrentlyRunning() {

    }

    public List<Project> getProjectsStartingToday() throws SQLException {

        String sql = "SELECT * FROM project where Date =?";
        List<Project> projectListStartsToday = new ArrayList<>();

        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.prepareStatement(sql);
        statement.setString(1, (getAllProjectStartToday());
        ResultSet rs = statement.executeQuery();

        return projectListStartsToday ;
    }

}
