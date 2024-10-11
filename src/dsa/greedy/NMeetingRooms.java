package dsa.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NMeetingRooms {

    public static void main(String[] args) {

        int[] start = {1,2,8,5,5,0};
        int[] end = {2,4,9,7,9,4};

        ArrayList<MeetingInfo> meetingInfos = new ArrayList<>();

        for (int i=0;i<start.length;i++){
            meetingInfos.add(new MeetingInfo(start[i],end[i],i));
        }

        Collections.sort(meetingInfos);

        int prevEnd = meetingInfos.get(0).end;
        int count = 1;

        for (int i=1;i<meetingInfos.size();i++){
            int currStart = meetingInfos.get(i).start;

            if (currStart>=prevEnd){
                count++;
                prevEnd = meetingInfos.get(i).end;
            }
        }

        System.out.println(count);
    }

    static class MeetingInfo implements Comparable<MeetingInfo> {
        int start;
        int end;
        int position;

        public MeetingInfo (int start, int end, int position){
            this.start=start;
            this.end=end;
            this.position=position;
        }

        @Override
        public int compareTo(MeetingInfo o) {
            return this.end-o.end;
        }

        @Override
        public String toString(){

            return this.start+" "+this.end + " "+this.position;
        }
    }
}
