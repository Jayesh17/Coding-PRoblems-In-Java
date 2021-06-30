package com.company.ArrayProblems;

import java.util.HashMap;

//find the Majority element : which appears more than n/2 times.
public class Problem15 {
    int[] arr = {3,3,1,3,3,3,3,5,5,5,5,3,2};

    public void printArray(int[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //By adding value in hash map, Time: O(Nlog2N), space:O(N)
    public void method1()
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int ME = arr.length/2;
        int result=-1;

        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey(arr[i]))
                hash.put(arr[i],hash.get(arr[i])+1);
            else
                hash.put(arr[i],1);

            if(hash.get(arr[i]) > ME)
            {
                result = arr[i];
            }
        }
        printArray(arr);
        System.out.println("Majority Element is :"+result);
    }

    //Moose voting Algo : Time : O(N)
    public void method2()
    {
        int cnt = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt==0)
            {
                element = arr[i];
            }
            if(element == arr[i])
                cnt++;
            else
                cnt--;
        }

        printArray(arr);
        System.out.println("Majority Element is :"+element);
    }
}
