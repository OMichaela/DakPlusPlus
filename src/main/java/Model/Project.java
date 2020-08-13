package Model;

import java.time.LocalDate;

public class Project {

    private int projectNumber;
    private String projectName;
    private LocalDate projectStart;
    private String description;
    private double price;
    private LocalDate expectedDate;

    public int getProjectNumber(){
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber){
        this.projectNumber = projectNumber;
    }

    public String getProjectName(){
        return projectName;
    }

    public void setProjectName(){
        this.projectName = projectName;
    }

    public LocalDate getProjectStart(){
        return projectStart;
    }

    public void setProjectStart(LocalDate projectStart){
        this.projectStart = projectStart;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public LocalDate getExpectedDate(){
        return expectedDate;
    }

    public void setExpectedDate(LocalDate expectedDate){
        this.expectedDate = expectedDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectNumber=" + projectNumber +
                ", projectName='" + projectName + '\'' +
                ", projectStart=" + projectStart +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", expectedDate=" + expectedDate +
                '}';
    }
}
