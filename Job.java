/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnnnew
 */
public class Job {
    int jobNumber;
    int jobSizeFinal;
    int timeStart;
    int timeAllocate;
    int timeExit;
    int jobSize;
    boolean isProcess;
    
    public Job(int jobNumber, int jobSize, int timeStart) {
        this.jobNumber = jobNumber;
        this.jobSize = jobSize;
        this.timeStart = timeStart;
        this.jobSizeFinal = jobSize;
        isProcess = false;
    }
    
    public String getString() {
        return String.format("Job %d: Time Start %d,  Size %d", getJobNumber(), getTimeStart(), getJobSizeFinal());
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeExit() {
        return timeExit;
    }

    public void setTimeExit(int timeExit) {
        this.timeExit = timeExit;
    }

    public int getJobSize() {
        return jobSize;
    }

    public void setJobSize(int jobSize) {
        this.jobSize = jobSize;
    }

    public boolean isIsProcess() {
        return isProcess;
    }

    public void setIsProcess(boolean isProcess) {
        this.isProcess = isProcess;
    }

    public int getJobSizeFinal() {
        return jobSizeFinal;
    }

    public void setJobSizeFinal(int jobSizeFinal) {
        this.jobSizeFinal = jobSizeFinal;
    }

    public int getTimeAllocate() {
        return timeAllocate;
    }

    public void setTimeAllocate(int timeAllocate) {
        this.timeAllocate = timeAllocate;
    }
}
