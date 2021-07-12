package com.company.twoPointers;

import java.util.HashSet;

// remove duplicates from the sorted array.
public class Problem4 {

    public void printArray(Integer[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //Using HashSet, T - O(NlogN + N) S - O(N)
    public void method1(Integer[] arr)
    {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hash.contains(arr[i]))
            {
                hash.add(arr[i]);
            }
        }
        hash.toArray(arr);
        for (int i = hash.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        printArray(arr);
    }

    // T - O(N) S - O(1)
    public void method2(Integer[] arr)
    {
        int i = 0;
        int j = 1;
        while (j<arr.length)
        {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        printArray(arr);
    }
}
