package Service;


import Data.ProjectDAO;
import Model.Project;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.now;


public class ProjectService {

    private static ProjectDAO projectDAO = new ProjectDAO();

    private boolean isProjectValid(Project project){

        boolean isValid = true;

        if(project.getPrice() > 0){
            System.out.println("Price must be greater than 0");
            isValid = false;
        }

        if(project.getProjectStart().isAfter(now())){
            System.out.println("Past project cannot be added");
            isValid = false;
        }

        if(project.getProjectStart().before(project.getExpectedDate())) {
            System.out.println("Project ending date cannot be added before project start date");
            isValid = false;
        }
        return isValid;
    }

    public List<Project> findAllCurrentProjects(){
        try {
            return projectDAO.findAllCurrentProjects(int projectNumber);
        } catch (SQLException throwables) {
            System.out.println("Cannot get all current projects");
        }
        return null;
    }
    public List<Project> findAllProjectsStartingToday(){
        try {
            return projectDAO.findProjectsStartingToday();
        } catch (SQLException throwables) {
            System.out.println("Cannot get projects starting today");
        }
        return null;
    }


        public boolean addProject(Project projectToAdd){
        final boolean isProjectValid = isProjectValid(projectToAdd);
        if(isProjectValid){
            try {
                projectDAO.addProject(projectToAdd);
                return true;
            } catch (SQLException throwables) {
                System.out.println("Cannot add new project");
                return false;
            }

            public void deleteProject( int projectNumber) {
                try {
                    projectDAO.deleteProject(projectNumber);
                } catch (SQLException throwables) {
                    System.out.println("Cannot delete project: please make sure that project with number " + projectNumber + " exists.");
                }
            }
    }




}
