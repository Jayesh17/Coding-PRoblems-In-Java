package com.company.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//4 SUM Problem : a+b+c+d : target
//give all the unique combinations
public class Problem2 {

    Integer[] arr = {1,2,3,5,4,4,1,6,10,7,9,8};
    HashSet<Integer[]> hash = new HashSet<>();


    public void printArray(Integer[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //Time : O(N3)+nLogn
    //space: O(1)
    public void method1(int target)
    {
        if(arr.length < 4)
        {
            System.out.println("Could't apply this method on this array.");
            return;
        }
        int left=-1;
        int right=-1;
        int sum=0;
        int n = arr.length;
        Arrays.sort(arr);
        printArray(arr);
        for (int i = 0; i < arr.length-3; i++) {
            for (int j = i+1; j < arr.length-2; j++) {
                sum=arr[i]+arr[j];
                int remain= target-sum;
                left = j+1;
                right = n-1;

                while(left<right)
                {
                    int sum2 = arr[left]+arr[right];
                    if(sum2 < remain) left++;
                    else if(sum2 > remain) right--;
                    else {
                        Integer[] found = {arr[i],arr[j],arr[left],arr[right]};
                        hash.add(found);

                        while(left < right && arr[left+1] == found[2])left++;
                        while(left < right && arr[right-1] == found[3])right--;
                        left++;
                        right--;
                    }
                }
                while(j+1 < n && arr[j+1]==arr[j])j++;
            }
            while(i+1 < n && arr[i+1]==arr[i])i++;
        }

        if(hash.isEmpty())
        {
            System.out.println("No such Elements.");
        }
        else {
            Iterator<Integer[]> it = hash.iterator();
            while(it.hasNext())
            {
              Integer[] arr = it.next();
              printArray(arr);
            }
        }
    }
}
