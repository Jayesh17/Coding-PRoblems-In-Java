package com.company.ArrayProblems;

import java.util.Random;
import java.util.Vector;

//Sort an array of 0's 1's and 2's
public class Problem1 {
    int arr[] = new int[] {1,2,1,0,0,0,2,2,0,1,2,0,1};

    public void printArray()
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //Just Simply sort the array by any sorting method:
    //Selection sort : O(n2)
    public void method1()
    {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray();
    }

    //Counting Sort method: O(2N);
    public void method2()
    {
        int count0,count1,count2;
        count0=count1=count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count0++;
            }
            else if(arr[i]==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        int index=0;
        while(true)
        {
            if(count0==0)
            {
                break;
            }
            arr[index] = 0;
            index++;
            count0--;
        }
        while(true)
        {
            if(count1==0)
            {
                break;
            }
            arr[index] = 1;
            index++;
            count1--;
        }
        while(true)
        {
            if(count2==0)
            {
                break;
            }
            arr[index] = 2;
            index++;
            count2--;
        }
        printArray();;
    }

    //Dutch National Flag Algorithm - O(N)
    //pointers: low,high,mid -> left to low will always be 0, right to high will always be 2;
    public void method3()
    {
        int low,mid,high,t=0;
        low = mid = 0;
        high = arr.length -1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                t= arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                t= arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
        }

        printArray();
    }
}
