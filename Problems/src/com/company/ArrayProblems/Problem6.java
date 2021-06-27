package com.company.ArrayProblems;


import java.util.Arrays;
import java.util.Comparator;

//Merging overlapping subintervals
public class Problem6 {
    int arr[][] = new int[][] {{1,3},{2,6},{8,10},{8,9},{9,11},{15,18},{2,4},{16,17}};

    public void printArray(int[][] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.print("},");
        }
    }

    public void printArray(int[][] arr,int row)
    {
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.print("},");
        }
    }

    //sort it and then linearly travrse through array;
    //time : O(NlogN) + N;
    public void method1()
    {
        printArray(arr);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0])
                    return 1;
                return -1;
            }
        });
        printArray(arr);
        int newArr[][] = new int[arr.length][];
        int ind=0;
        int n1=0,n2=0;
        n1=arr[0][0];
        n2=arr[0][1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] <= n2)
            {
                if(arr[i][1] > n2)
                {
                    n2=arr[i][1];
                }
            }
            else {
                newArr[ind] = new int[2];
                newArr[ind][0] = n1;
                newArr[ind][1] = n2;
                ind++;
                n1=arr[i][0];
                n2=arr[i][1];
            }
            if(i == arr.length-1)
            {
                newArr[ind] = new int[2];
                newArr[ind][0] = n1;
                newArr[ind][1] = n2;
                ind++;
            }
        }

        printArray(newArr,ind);
    }

}
