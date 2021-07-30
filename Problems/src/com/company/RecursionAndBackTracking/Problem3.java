package com.company.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

//subset 2 : print all the subsets of given array. only unique
public class Problem3 {

    // T - O(2^N+N) S-O(1)
    public void method1(int[] arr)
    {
        List<List<Integer>> result =  new ArrayList<>();
        subsets(0,arr,arr.length,new ArrayList<>(),result);
        result.forEach(list -> {
            System.out.println(list);
        });
    }

    private void subsets(int ind, int[] arr, int length, ArrayList<Integer> ds,
                         List<List<Integer>> result) {
        result.add(new ArrayList<>(ds));
        for (int i = ind; i < length; i++) {
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            subsets(i+1,arr,length,ds,result);
            ds.remove(ds.size()-1);
        }
    }
}
