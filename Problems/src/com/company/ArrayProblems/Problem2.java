package com.company.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

//find the missing and Repeating number in the size of array n which would have elements from 1
// to n.
public class Problem2 {
    int arr[] = new int[]{3,4,1,6,7,5,2,8,13,10,12,9,12};
    public void printArray()
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //Summation method: O(2N)
    public void method1()
    {
        int temp[] = new int[arr.length+1];
        Arrays.fill(temp,0);
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        int repeat=0, missing=0;
        for (int i = 1; i < temp.length; i++) {
            if(temp[i]==0)
            {
                missing = i;
            }
            else if(temp[i]==2)
            {
                repeat = i;
            }
        }
        printArray();
        System.out.println("Missing: "+missing+" repeating: "+repeat);
    }
}
