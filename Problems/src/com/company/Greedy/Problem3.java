package com.company.Greedy;

//Job sequencing problem - find the max profit.

import java.util.*;

public class Problem3 {

    //optimal T- O(Nlogn) + O(n2) S- O(M)
    public void method1(List<Job> jobs)
    {
        int n = jobs.size();
        Collections.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if(o1.getProfit()<o2.getProfit())
                    return 1;
                return -1;
            }
        });

        int[] units = new int[n];
        Arrays.fill(units,-1);
        int profit = 0;
        int jobsDone = 0;
        ListIterator<Job> it = jobs.listIterator();
        while (it.hasNext())
        {
            if(jobsDone==n)
            {
                break;
            }
            Job job = it.next();
            int deadline = job.getDeadline();
            while (units[deadline]!=-1)
            {
                deadline--;
            }
            if(deadline!=0) {
                units[deadline] = job.getId();
                profit+=job.getProfit();
                jobsDone++;
            }
        }

        System.out.println("Jobs Done in the order: ");
        for (int i = 1; i < units.length-1; i++) {
            System.out.print(units[i]+" ");
        }
        System.out.println("Total Profit : "+profit);
        System.out.println("Total Jobs Done : "+jobsDone);
    }
}
