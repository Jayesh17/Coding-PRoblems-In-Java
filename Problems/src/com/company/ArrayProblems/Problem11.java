package com.company.ArrayProblems;

//stock buy and sell
public class Problem11 {
    int[] range = {1,5,6,7,3,10,2,9};

    //Time O(N)
    public void method1()
    {
        int min = -1;
        int profit = 0;
        for (int i = 0; i < range.length; i++) {
            if(min == -1)
            {
                min = range[i];
            }
            else if(range[i] < min)
            {
                min = range[i];
            }
            if((range[i] - min) > profit)
            {
                profit = range[i]-min;
            }
        }

        System.out.println("Max profit is : "+profit);
    }
}
