package com.company.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

//Longest consecutive Elements in unsorted array.
public class Problem3 {
    Integer[] arr = {5,100,6,7,101,4,3,2,99,98,97,96,102};

    //Sort and iterate through array and check consecutiveness
    //Time: O(NlogN + N)
    //space if mergesort: O(N)
    public void method1()
    {
        Arrays.sort(arr);
        int max=0;
        int m=1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]+1 == arr[i+1])
            {
               m++;
               if(max<m)
                   max=m;
            }
            else m=1;
        }
        System.out.println("Result : "+max);
    }

    //Time:O(3N)
    //space: O(N)
    public void method2()
    {
        HashSet<Integer> hash = new HashSet<>();
        hash.addAll(Arrays.asList(arr));
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int temp=1;
            if(!hash.contains(arr[i]-1))
            {
                while (hash.contains(arr[i]+temp))
                {
                   temp++;
                }
            }
            if(temp>max)
                max=temp;
        }

        System.out.println("result is : "+max);
    }
}
