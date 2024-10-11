package dsa.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {

    //https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
    public static void main(String[] args) {
        Job job = new Job(1,4,40);
        Job job1 = new Job(2,1,10);
        Job job2 = new Job(3,4,40);
        Job job3 = new Job(4,1,30);

        ArrayList<Job> list = new ArrayList<>();
        list.add(job);
        list.add(job1);
        list.add(job2);
        list.add(job3);

        //SORT THE JOB LIST BASED ON PROFIT
        Collections.sort(list);

        int maxDeadLine = 0;
        int maxProfit = 0;

        for (Job job4: list){
            maxDeadLine = Math.max(maxDeadLine, job4.deadline);
        }

        int[] dayTrack = new int[maxDeadLine+1];
        Arrays.fill(dayTrack,-1);

        for (Job job4: list){
            for (int i=job4.deadline;i>=1;i--){
                if (dayTrack[i]==-1){
                    dayTrack[i]=job4.jobId;
                    maxProfit = maxProfit + job4.profit;
                    break;
                }
            }
        }

        System.out.println(maxProfit);



    }
}
