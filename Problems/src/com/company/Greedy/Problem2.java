package com.company.Greedy;

import java.util.Arrays;

//minimum number of platform needed to manage all trains.
public class Problem2 {

    public int method1(int[] st, int[] end, int n)
    {
        Arrays.sort(st);
        Arrays.sort(end);

        int i=0,j=0;
        int max=0;
        int platform=0;
        while (i< n && j <n)
        {
            if(st[i] <= end[j])
            {
                platform++;
                i++;
            }
            else if(st[i] > end[j])
            {
                platform--;
                j++;
            }

            if(platform>max)
            {
                max= platform;
            }
        }
        return max;
    }
}
