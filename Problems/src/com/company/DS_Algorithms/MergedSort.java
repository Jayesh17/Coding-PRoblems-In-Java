package com.company.DS_Algorithms;

public class MergedSort {


    public static void merge(int[] arr,int low,int mid,int high)
    {
        int third[] = new int[arr.length];
        int FP = low;
        int SP = mid+1;
        int TP = low;

        while(FP < mid && SP < high )
        {
            if(arr[FP] <= arr[SP])
            {
                third[TP] = arr[FP];
                TP++;
                FP++;
            }
            else
            {
                third[TP] = arr[SP];
                SP++;
                TP++;
            }
        }
        while(FP < mid)
        {
            third[TP] = arr[FP];
            TP++;
            FP++;
        }
        while(SP < high)
        {
            third[TP] = arr[SP];
            SP++;
            TP++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = third[i];
        }
    }
    public static void mergeSort(int[] arr,int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}
