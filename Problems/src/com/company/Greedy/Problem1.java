package com.company.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//N meetings in a room, return number of meetings that can be held in that room.
public class Problem1 {

    private class meeting
    {
        int stime;
        int ftime;
        int pos;

        public meeting(int stime, int ftime, int pos) {
            this.stime = stime;
            this.ftime = ftime;
            this.pos = pos;
        }

        public int getStime() {
            return stime;
        }

        public int getFtime() {
            return ftime;
        }

        public int getPos() {
            return pos;
        }
    }
    //optimal : O(NlogN) , O(N)
    public void method1(int[] start, int[] end,int n)
    {
        List<meeting> meets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meeting meet = new meeting(start[i],end[i],i+1);
            meets.add(meet);
        }

        Collections.sort(meets, new Comparator<meeting>() {
            @Override
            public int compare(meeting o1, meeting o2) {
                if(o1.getFtime()<o2.getFtime())
                    return -1;
                if(o1.getPos()<o2.getPos())
                    return -1;
                return 1;
            }
        });

        List<Integer> results = new ArrayList<>();
        AtomicInteger endLimit = new AtomicInteger(meets.get(0).getFtime());
        results.add(meets.get(0).getPos());

        meets.forEach(meet ->{
            if(meet.getStime() > endLimit.get())
            {
                results.add(meet.getPos());
                endLimit.set(meet.getFtime());
            }
        });

        results.forEach(pos ->{
            System.out.print(pos+" ");
        });
    }
}
