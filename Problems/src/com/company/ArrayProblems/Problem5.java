package com.company.ArrayProblems;

import java.util.Arrays;

//Find the duplicate from the array of contegous elements
public class Problem5 {
    int arr[] = new int[]{1,4,3,2,5,1};

    //merge sort and find 2 continuous same elements - O(NlogN)
    //problem : array will be changed.
    public void method1()
    {

    }

    //hashing : O(2N)
    //problem : more space is required.
    public void method2()
    {
        int dup=0;
        int temp[] = new int[arr.length+1];
        Arrays.fill(temp,0);
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>1)
            {
                dup=i;
                break;
            }
        }
        System.out.println("duplicate element is :"+dup);
    }

    //Linked list cycling method:O(N) best
    public void method3()
    {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while(slow!=fast);

        fast = arr[0];
        while(fast!=slow)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println("duplicate element is : "+slow);
    }
}
