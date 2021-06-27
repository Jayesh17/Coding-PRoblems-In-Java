package com.company.ArrayProblems;

import java.util.Arrays;

//set Matrixes Zero;
public class Problem7 {
    int arr[][] = new int[][]{
            {1,2,3,0},{3,2,0,1},{1,1,1,1}
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
    //Time: O(2*(N*M))
    //space : O(N+M)
    public void method1()
    {
        int[] cols = new int[arr[0].length];
        int[] rows = new int[arr.length];

        Arrays.fill(cols,1);
        Arrays.fill(rows,1);

        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0)
                {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(cols[j]==0 || rows[i] == 0)
                {
                    arr[i][j]=0;
                }
            }
        }

        cols=null;
        rows=null;
        printArray(arr);
    }
}
