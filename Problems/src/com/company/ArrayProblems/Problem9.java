package com.company.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find the next Permutation
public class Problem9 {
    Integer arr[] = {3,1,2};

    //Just collect all the permutations and find the given from them, result:next
    public void method1()
    {
        List<List<Integer>> pers = new ArrayList<>();
        int ind1=-1,ind2=-1;
        while(true)
        {
           List<Integer> per = new ArrayList<Integer>();
            for (int i = arr.length-2; i >= 0; i--) {
                if(arr[i]< arr[i+1])
                {
                    ind1 = i;
                    break;
                }
            }
            for(int i=arr.length-1;i>=0;i--)
            {
                if(arr[i]>ind1)
                {
                    ind2=i;
                    break;
                }
            }
            int temp = arr[ind1];;
            arr[ind1] = arr[ind2];
            arr[ind2] = temp;

            int mid = (ind1+arr.length)/2;
            int n = arr.length;
            for (int i = ind1+1; i < mid; i++) {
                int t = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = t;
            }
            Collections.addAll(per,arr);
            if(per.equals(Arrays.asList(arr)))
            {
                break;
            }
            pers.add(per);
        }

        for (int i = 0; i < pers.size(); i++) {
            System.out.println();
            System.out.print(pers.get(i)+" ");
        }
    }

    public void reverse(int st,int end)
    {
        int mid = (st+end)/2;
        int n = end;
        for (int i = st; i < mid; i++) {
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }

    public void printArray(Integer[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //just get the next permutation : O(3N)
    public void method2()
    {
        printArray(arr);
        int ind1=-1,ind2=-1;
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i]< arr[i+1])
            {
                ind1 = i;
                break;
            }
        }
        if(ind1 == -1)
        {
            reverse(0, arr.length);
            printArray(arr);
            return;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>ind1)
            {
                ind2=i;
                break;
            }
        }
        int temp = arr[ind1];;
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

        reverse(ind1+1,arr.length);
        printArray(arr);
    }
}
