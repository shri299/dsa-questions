package dsa.greedy;

public class ShortestJobFirst {

    public static void main(String[] args) {
        //Problem Statement: Given a list of job durations representing the time it takes to complete each job. Implement the Shortest Job First algorithm to find the average waiting time for these jobs.

        int[] jobDurations = {6, 8, 7, 3, 4};
        System.out.println("Average Waiting Time: " + calculateAverageWaitingTime(jobDurations));
    }

    private static String calculateAverageWaitingTime(int[] jobDurations) {
        // Sort the job durations in ascending order
        java.util.Arrays.sort(jobDurations);

        int totalWaitingTime = 0;
        int waitingTime = 0;

        for (int jobDuration : jobDurations) {
            totalWaitingTime += waitingTime;
            waitingTime += jobDuration;
        }

        double averageWaitingTime = (double) totalWaitingTime / jobDurations.length;
        return String.format("%.2f", averageWaitingTime);
    }
}
