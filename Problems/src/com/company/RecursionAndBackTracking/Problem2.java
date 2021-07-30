package com.company.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//all subset sums via recursion
public class Problem2 {

    // T - O(2^N + 2^Nlog(2^n)) S- O(1)
    public void method1(int[] arr)
    {
        List<Integer> result = new ArrayList<>();
        sum(0,0,arr.length,arr,result);
        Collections.sort(result);
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }

    private void sum(int i, int sum, int length, int[] arr, List<Integer> result) {
        if(i==length)
        {
            result.add(sum);
            return;
        }
        sum(i+1,sum+arr[i],length,arr,result);
        sum(i+1,sum,length,arr,result);
    }
}
