package com.company.ArrayProblems;

//rotate the matrix 90 degree clockwise
public class Problem12 {
    int arr[][] = {
            {1,2,3},{4,5,6},{7,8,9}
    };

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
    //with the help of new matrix: time-O(n2) space-O(N2)
    public void method1()
    {
        int temp[][] = new int[arr.length][arr[0].length];
        int n = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[j][(n-1)-i] = arr[i][j];
            }
        }
        printArray(arr);
        printArray(temp);
    }
    public void reverse(int[] arr,int st,int end)
    {
        int mid = (st+end)/2;
        int n = end;
        for (int i = st; i < mid; i++) {
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }
    // Time: O(N2 + N2) space : O(1);
    public void method2()
    {
        int temp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            reverse(temp[i],0,temp[i].length);
        }

        printArray(arr);
        printArray(temp);
    }
}
