package com.company.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//return all unique triplets which gives sum=0 in an array.
public class Problem2 {

    public HashSet<List<Integer>> method1(int[] arr)
    {
        HashSet<List<Integer>> hash = new HashSet<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        Integer[] a = {arr[i],arr[j],arr[k]};
                        Arrays.sort(a);
                        hash.add(Arrays.asList(a));
                    }
                }
            }
        }
        return hash;
    }

    public List<List<Integer>> method2(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int a;
        int n = arr.length;
        int sum=0;
        int low;
        int hi;
        for (int i = 0; i < n-2; i++) {
            if(i==0 || (arr[i]!=arr[i-1]))
            {
                low  = i+1;
                hi = n-1;
                a = arr[i];
                sum = 0 - arr[i];
                while (low<hi)
                {
                    if(arr[low]+arr[hi]==sum)
                    {
                        List<Integer> l = new ArrayList<>();
                        l.add(a);
                        l.add(arr[hi]);
                        l.add(arr[low]);
                        list.add(l);
                        low++;
                        hi--;
                    }
                    else if(arr[low]+arr[hi]<sum)
                    {
                        int prev=low;
                        while (low<hi && arr[low]==arr[prev])low++;
                    }
                    else {
                        int prev=hi;
                        while (low<hi && arr[hi]==arr[prev])hi--;
                    }
                }
            }
        }
        return list;
    }
}
