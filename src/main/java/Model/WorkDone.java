package Model;

import java.time.LocalDate;

public class WorkDone {

        private LocalDate dateWorkDone;
        private int hoursWorked;
        private String remarks;


        public LocalDate getDateWorkDone(){
            return dateWorkDone;
        }

        public void setDateWorkDone(LocalDate dateWorkDone){
            this.dateWorkDone = dateWorkDone;
        }

        public int getHoursWorked(){
            return hoursWorked;
        }

        public void setHoursWorked(int hoursWorked){
            this.hoursWorked = hoursWorked;
        }

        public String getRemarks(){
            return remarks;
        }

        public void setRemarks(){
            this.remarks = remarks;
        }

    @Override
    public String toString() {
        return "WorkDone{" +
                "dateWorkDone=" + dateWorkDone +
                ", hoursWorked=" + hoursWorked +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
