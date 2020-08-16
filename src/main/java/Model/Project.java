package Model;

import java.sql.Date;

public class Project {

    private int projectNumber;
    private String projectName;
    private Date projectStart;
    private String description;
    private double price;
    private Date expectedDate;

    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectStart() {
        return projectStart;
    }

    public void setProjectStart(Date projectStart) {
        this.projectStart = projectStart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
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

