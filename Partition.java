/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnnnew
 */
public class Partition {
    int partitionNumber;
    boolean Avialable;
    int jobNumberInProcess;
    int sizeSegment;
    
    public Partition(int partitionNumber, int sizeSegment) {
        this.partitionNumber = partitionNumber;
        this.sizeSegment = sizeSegment;
        Avialable = true;
        jobNumberInProcess = -1;
    }

    public String getString() {
        String str = "Partition:" + String.valueOf(partitionNumber) + " ";
        str += "Size: " + String.valueOf(getSizeSegment()) + " ";
        return str;
    }
    
    public int getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(int partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public boolean isAvialable() {
        return Avialable;
    }

    public void setAvialable(boolean isAvialable) {
        this.Avialable = isAvialable;
    }

    public int getJobNumberInProcess() {
        return jobNumberInProcess;
    }

    public void setJobNumberInProcess(int jobNumberInProcess) {
        this.jobNumberInProcess = jobNumberInProcess;
    }

    public int getSizeSegment() {
        return sizeSegment;
    }

    public void setSizeSegment(int sizeSegment) {
        this.sizeSegment = sizeSegment;
    }
}
