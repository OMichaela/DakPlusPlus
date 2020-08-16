package Model;

import java.sql.Date;

public class WorkDone {

        private int staffId;
        private int projectNumber;
        private Date dateWorkDone;
        private int hoursWorked;
        private String remarks;


        public int getStaffId() {
            return staffId;
        }

        public void setStaffId(int staffId) {
            this.staffId = staffId;
        }

        public int getProjectNumber() {
            return projectNumber;
        }

        public void setProjectNumber(int projectNumber){
            this.projectNumber = projectNumber;
        }

        public Date getDateWorkDone() {
            return dateWorkDone;
        }

        public void setDateWorkDone(Date dateWorkDone) {
            this.dateWorkDone = dateWorkDone;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = this.remarks;
        }

    @Override
    public String toString() {
        return "WorkDone{" +
                "staffId=" + staffId +
                ", projectNumber=" + projectNumber +
                ", dateWorkDone=" + dateWorkDone +
                ", hoursWorked=" + hoursWorked +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

