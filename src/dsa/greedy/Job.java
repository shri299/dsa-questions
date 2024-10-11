package dsa.greedy;

public class Job implements Comparable<Job>{

    int jobId;
    int deadline;
    int profit;

    public Job (int id, int deadline, int profit){
        this.jobId=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    //descending
    @Override
    public int compareTo(Job o) {
        return o.profit-this.profit;
    }

    //ascending
//    @Override
//    public int compareTo(Job o) {
//        return this.profit-o.profit;
//    }

    @Override
    public String toString(){

        return this.jobId+" "+this.deadline + " "+this.profit;
    }
}
