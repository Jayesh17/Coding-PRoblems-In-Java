package com.company.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//return all the permutation of the given array.
public class Problem1 {

    //naive solution with recursion, T - O(N! * N) S- O(N+N)
    public void method1(int[] arr)
    {
        boolean[] hash = new boolean[arr.length];
        Arrays.fill(hash,false);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        permute(arr,hash,stack,result);

        result.forEach(list->{
            System.out.println(list);
        });
    }

    private void permute(int[] arr, boolean[] hash, List<Integer> stack, List<List<Integer>> result) {

        if(stack.size()==arr.length)
        {
            result.add(new ArrayList<>(stack));
            return;
        }
        for(int i =0 ; i<arr.length;i++)
        {
            if(!hash[i])
            {
                hash[i]=true;
                stack.add(arr[i]);
                permute(arr,hash,stack,result);
                stack.remove(stack.size()-1);
                hash[i]=false;
            }
        }
    }

    public void method2(int[] arr)
    {
        List<List<Integer>> result = new ArrayList<>();
        permute(0,arr,result);

        System.out.println();
        result.forEach(list->{
            System.out.println(list);
        });
    }

    private void permute(int i, int[] arr, List<List<Integer>> result) {

        if(i==arr.length)
        {
            List<Integer> ds = new ArrayList<>();
            for (int i1 = 0; i1 < arr.length; i1++) {
                ds.add(arr[i1]);
            }
            result.add(ds);
            return;
        }
        for (int j = i; j < arr.length; j++) {
            swap(j,i,arr);
            permute(i+1,arr,result);
            swap(j,i,arr);
        }
    }

    private void swap(int j, int i, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
